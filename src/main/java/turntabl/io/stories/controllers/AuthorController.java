package turntabl.io.stories.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.extra.DbVars;
import turntabl.io.stories.extra.GenerateID;
import turntabl.io.stories.models.Author;
import turntabl.io.stories.models.AuthorTO;

import java.util.List;

@Api
@RestController
public class AuthorController {
    @Autowired
    JdbcTemplate template;

    @CrossOrigin
    @PostMapping("/api/v1/authors")
    public void addNewAuthor(@RequestBody Author author) {
        template.update(DbVars.ADD_NEW_AUTHOR, GenerateID.getId(6), author.getAuthor_name(), author.getAuthor_email());
    }

    @CrossOrigin
    @GetMapping("api/v1/authors")
    public List<AuthorTO> getAllAuthors() {
        return this.template.query(DbVars.GET_ALL_AUTHORS, new BeanPropertyRowMapper<AuthorTO>(AuthorTO.class));
    }

    @CrossOrigin
    @PutMapping("api/v1/authors/{id}")
    public void updateAuthorInfo(@PathVariable("id") Integer id, AuthorTO author) {
        int status = template.update(DbVars.UPDATE_AUTHOR, author.getAuthor_name(), author.getAuthor_email());
    }

    @CrossOrigin
    @GetMapping("/api/v1/authors/{id}")
    public AuthorTO searchForAuthorById(@PathVariable("id") Integer id) {
        return (AuthorTO) template.queryForObject(
                DbVars.GET_AUTHOR_BY_ID,
                new Object[]{id},
                new BeanPropertyRowMapper(AuthorTO.class));
    }


}
