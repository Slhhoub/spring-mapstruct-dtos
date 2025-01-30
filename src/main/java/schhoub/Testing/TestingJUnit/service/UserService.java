package schhoub.Testing.TestingJUnit.service;

import schhoub.Testing.TestingJUnit.DTOs.UsersDto;
import schhoub.Testing.TestingJUnit.DTOs.UsersDtoReponse;
import schhoub.Testing.TestingJUnit.model.Users;

import java.util.List;

public interface UserService {
    List<UsersDtoReponse> getAllUsers();
    UsersDtoReponse getUserById(Integer id);
    UsersDto save(UsersDto usersDto);
    UsersDto update(UsersDto usersDto, Integer id);
    void deleteUser(Integer id);
}
