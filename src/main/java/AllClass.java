import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AllClass {
    public List<JsonInJavaObject> all;

    public AllClass(@JsonProperty("all") List<JsonInJavaObject> all) {
        this.all = all;
    }
}
