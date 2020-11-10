import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    public String _id;
    public Name name;

    public User(
            @JsonProperty("_id") String _id,
            @JsonProperty("name") Name name) {
        this._id = _id;
        this.name = name;
    }
}
