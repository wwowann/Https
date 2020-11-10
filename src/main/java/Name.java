import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
    public String first;
    public String last;

    public Name(
            @JsonProperty("first") String first,
            @JsonProperty("last") String last) {
        this.first = first;
        this.last = last;
    }
}
