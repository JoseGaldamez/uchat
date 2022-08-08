package models;

/**
 * @author josedev
 */
public class MessageModel {
    
    private String uid;
    private String user;
    private String text;

    public MessageModel(String uid, String user, String text) {
        this.uid = uid;
        this.user = user;
        this.text = text;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
    
}
