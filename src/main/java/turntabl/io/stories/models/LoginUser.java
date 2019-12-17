package turntabl.io.stories.models;

public class LoginUser {
    private String user_email;

    public LoginUser() {
    }

    public LoginUser(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
