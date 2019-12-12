package turntabl.io.stories.dao;

import turntabl.io.stories.models.Author;
import turntabl.io.stories.models.AuthorTO;

import java.util.List;

public interface AuthorDAO {
    public void addNewAuthor(Author author);
    public List<AuthorTO> getAuthors();
    public AuthorTO searchForAuthorById(Integer id);
    public AuthorTO searchAuthorByName(String name);
    public void deleteAuthor(Integer id);
    public void updateAuthorInfo(Integer id, AuthorTO author);
}
