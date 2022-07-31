package models;

/**
 * @author josedev
 */
public class UserFirebaseModel {
    private String name;
    private String email;
    private String username;
    private String image;
    private String uid;

    public UserFirebaseModel(String uid, String name, String email, String username, String image) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.image = image;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
    
    
    
    
}
