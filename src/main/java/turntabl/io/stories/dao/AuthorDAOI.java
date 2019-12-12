package turntabl.io.stories.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import turntabl.io.stories.extra.DbVars;
import turntabl.io.stories.models.Author;
import turntabl.io.stories.models.AuthorTO;

import java.util.List;

public class AuthorDAOI implements AuthorDAO {
    @Autowired
    JdbcTemplate template;


    @Override
    public void addNewAuthor(Author author) { }

    @Override
    public List<AuthorTO> getAuthors() { return this.template.query(DbVars.GET_ALL_AUTHORS, new BeanPropertyRowMapper<AuthorTO>(AuthorTO.class));
    }

    @Override
    public AuthorTO searchForAuthorById(Integer id) { return (AuthorTO) template.queryForObject(DbVars.GET_AUTHOR_BY_ID, new Object[] {id}, new BeanPropertyRowMapper(AuthorTO.class));
    }

    @Override
    public AuthorTO searchAuthorByName(String name) { return this.template.queryForObject(DbVars.GET_AUTHOR_BY_NAME, new Object[] {name+"%"}, new BeanPropertyRowMapper<AuthorTO>(AuthorTO.class));
    }

    @Override
    public void deleteAuthor(Integer id) { this.template.update(DbVars.DELETE_AUTHOR, id);
    }

    @Override
    public void updateAuthorInfo(Integer id, AuthorTO author) {template.update(DbVars.UPDATE_AUTHOR, author.getAuthor_name(), author.getAuthor_email()); }
}
