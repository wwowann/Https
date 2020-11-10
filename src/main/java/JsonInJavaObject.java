import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonInJavaObject {
    private String _id;
    private String text;
    private String type;
    private User user;
    private int upvotes;
    private int userUpvotes;


    public JsonInJavaObject(
            @JsonProperty("_id") String _id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") User user,
            @JsonProperty("upvotes") int upvotes,
            @JsonProperty("userUpvotes") int userUpvotes
    ) {
        this._id = _id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
        this.userUpvotes = userUpvotes;

    }

    public String getId() {
        return _id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public int getUserUpvotes() {
        return userUpvotes;
    }

    @Override
    public String toString() {
        return "JsonInJavaObject{" +
                "_id='" + _id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user=" + user +
                ", upvotes=" + upvotes +
                ", userUpvotes=" + userUpvotes +
                '}';
    }
}

