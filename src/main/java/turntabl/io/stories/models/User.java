package turntabl.io.stories.models;

public class User {
    private String user_name;
    private String user_email;
    private String role;

    public User() {
    }

    public User(String user_name, String user_email, String role) {
        this.user_name = user_name;
        this.user_email = user_email;
        this.role = role;
    }

    public String getUser_name() { return user_name; }

    public void setUser_name(String user_name) { this.user_name = user_name; }

    public String getUser_email() { return user_email; }

    public void setUser_email(String user_email) { this.user_email = user_email; }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_name='" + user_name + '\'' +
                ", author_email='" + user_email + '\'' +
                '}';
    }
}
