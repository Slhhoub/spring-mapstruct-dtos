package schhoub.Testing.TestingJUnit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schhoub.Testing.TestingJUnit.DTOs.UsersDto;
import schhoub.Testing.TestingJUnit.DTOs.UsersDtoReponse;
import schhoub.Testing.TestingJUnit.model.Users;
import schhoub.Testing.TestingJUnit.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UsersDtoReponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping
    public UsersDtoReponse getUserById(@RequestParam Integer id) {
        UsersDtoReponse user = userService.getUserById(id);
        return user;
    }

    @PostMapping
    public UsersDto createUser(@RequestBody UsersDto user) {
        UsersDto createdUser = userService.save(user);
        return createdUser;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsersDto> updateUser(@PathVariable Integer id, @RequestBody UsersDto user) {
        UsersDto updatedUser = userService.update(user, id);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
