package turntabl.io.stories.models;

public class UserTO {
    private String _id;
    private String _rev;
    private String user_name;
    private String user_email;
    private String role;

    public UserTO() {
    }

    public UserTO(String _id, String _rev, String user_name, String user_email, String role) {
        this._id = _id;
        this._rev = _rev;
        this.user_name = user_name;
        this.user_email = user_email;
        this.role = role;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserTO{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


