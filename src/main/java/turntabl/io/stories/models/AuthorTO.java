package turntabl.io.stories.models;

public class AuthorTO {
    private String author_name;
    private String author_contact;
    private String author_address;
    private String author_about;
    private String author_photo;
    private String author_email;

    public AuthorTO() {
    }

    public AuthorTO(String author_name, String author_contact, String author_address, String author_about, String author_photo, String author_email) {
        this.author_name = author_name;
        this.author_contact = author_contact;
        this.author_address = author_address;
        this.author_about = author_about;
        this.author_photo = author_photo;
        this.author_email = author_email;
    }

    public String getAuthor_name() { return author_name; }

    public void setAuthor_name(String author_name) { this.author_name = author_name; }

    public String getAuthor_contact() { return author_contact; }

    public void setAuthor_contact(String author_contact) { this.author_contact = author_contact; }

    public String getAuthor_address() { return author_address; }

    public void setAuthor_address(String author_address) { this.author_address = author_address; }

    public String getAuthor_about() { return author_about; }

    public void setAuthor_about(String author_about) { this.author_about = author_about; }

    public String getAuthor_photo() { return author_photo; }

    public void setAuthor_photo(String author_photo) { this.author_photo = author_photo; }

    public String getAuthor_email() { return author_email; }

    public void setAuthor_email(String author_email) { this.author_email = author_email; }


    @Override
    public String toString() {
        return "AuthorTO{" +
                "author_name='" + author_name + '\'' +
                ", author_contact='" + author_contact + '\'' +
                ", author_address='" + author_address + '\'' +
                ", author_about='" + author_about + '\'' +
                ", author_photo='" + author_photo + '\'' +
                ", author_email='" + author_email + '\'' +
                '}';

    }
}


