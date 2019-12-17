package turntabl.io.stories.controllers;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.models.User;
import turntabl.io.stories.models.UserTO;

import java.io.IOException;
import java.util.List;

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


}
