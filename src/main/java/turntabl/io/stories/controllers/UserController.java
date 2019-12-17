package turntabl.io.stories.controllers;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import com.cloudant.client.api.query.QueryBuilder;
import com.cloudant.client.api.query.QueryResult;
import com.cloudant.client.api.query.TextIndex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.models.LoginUser;
import turntabl.io.stories.models.User;
import turntabl.io.stories.models.UserTO;

import java.io.IOException;
import java.util.List;

import static com.cloudant.client.api.query.Expression.eq;

@RestController
public class UserController {
    @Autowired
    private Database db;

    @CrossOrigin
    @PostMapping("/api/v1/users")
    public void addNewAuthor(@RequestBody User user) {
        db.save(user);
    }

    @CrossOrigin
    @GetMapping("api/v1/users")
    public List<UserTO> getAllUsers() throws IOException {
        List<UserTO> allAuthors = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(UserTO.class);
        return allAuthors;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/v1/users/{id}", method = RequestMethod.GET)
    public UserTO searchAuthorByID(@PathVariable("id") String id) {
        return db.find(UserTO.class, id);
    }

    @CrossOrigin
    @DeleteMapping("/api/v1/users/{id}/{rev}")
    public void deleteAuthor(@PathVariable("id") String id, @PathVariable("rev") String rev) {
        Response response = db.remove(id, rev);
    }

    @CrossOrigin
    @GetMapping("/api/v1/users/login")
    public UserTO getUserByEmail(@RequestParam String user_email){
        db.createIndex(TextIndex.builder().string("user_email").definition());

        QueryResult<UserTO> user = db.query(new QueryBuilder(
                eq("user_email", user_email)).
                build(), UserTO.class);

        return user.getDocs().get(0);
    }

}
