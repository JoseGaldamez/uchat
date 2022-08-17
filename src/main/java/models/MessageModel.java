package models;

/**
 * @author josedev
 */
public class MessageModel {
    
    private String uid;
    private String mid;
    private String user;
    private String text;

    public MessageModel(String uid, String user, String text, String mid) {
        this.uid = uid;
        this.user = user;
        this.text = text;
        this.mid = mid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
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
