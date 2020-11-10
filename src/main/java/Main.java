import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final String url = "https://cat-fact.herokuapp.com/facts";
    public static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                        .build())
                .build();
        //создание объекта запроса с произвольными заголовками
        HttpGet request = new HttpGet(url);
        request.setHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.getMimeType());
        CloseableHttpResponse response = httpClient.execute(request);
        Arrays.stream(response.getAllHeaders()).forEach(System.out::println);
        //преобразование json в JavaObject
        List<JsonInJavaObject> javaObjectsList = mapper.readValue(response.getEntity().getContent(),
                new TypeReference<List<JsonInJavaObject>>() {});
        javaObjectsList.stream().filter(value -> value.getUpvotes() > 0)
        .forEach(System.out::println);
//        javaObjectsList.forEach(System.out::println);
    }
}
