package pik.restful.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import pik.restful.entities.User;
import pik.restful.usecases.UserUseCase;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserUseCase userUseCase;

    public UserController(UserUseCase userService) {
        this.userUseCase = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userUseCase.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return userUseCase.getUserById(id);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userUseCase.createUser(user);
    }
}
