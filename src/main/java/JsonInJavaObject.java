import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonInJavaObject {
    public String _id;
    public String text;
    public String type;
    public User user;
    public int upvotes;
    public int userUpvoted;


    public JsonInJavaObject(
            @JsonProperty("_id") String _id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") User user,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvoted") int userUpvoted
    ) {
        this._id = _id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvoted = userUpvoted;

    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "JsonInJavaObject{" +
                "_id='" + _id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", upvotes=" + upvotes +
                ", userUpvoted=" + userUpvoted +
                '}';
    }
}

