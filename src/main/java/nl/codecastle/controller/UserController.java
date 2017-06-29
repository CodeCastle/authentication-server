package nl.codecastle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Controller for all user related operations.
 */
@RestController
public class UserController {

    /**
     * Returns the currently logged in user as a {@link Principal} object.
     *
     * @param principal the principal object for the logged in user.
     * @return the same principal object.
     */
    @GetMapping(value = "/user")
    public Principal sayHello(@Autowired Principal principal) {
        return principal;
    }
}
