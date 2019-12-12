package turntabl.io.stories.extra;

public class DbVars {
    public static String GET_ALL_AUTHORS = "select * from authors";
    public static String ADD_NEW_AUTHOR = "insert into authors " +
                    "(author_id, author_name, author_email) " +
                    "values (?, ?, ?, ?)";
    public static String GET_AUTHOR_BY_ID = "select * from authors where author_id = ? ";
    public static String GET_AUTHOR_BY_NAME = "select * from authors where author_name = ? ";
    public static String DELETE_AUTHOR = "delete from authors where author_id = ? ";
    public static String UPDATE_AUTHOR = "update authors set author_name= ?, author_email = ? " +  "where author_id = ? ";

}
