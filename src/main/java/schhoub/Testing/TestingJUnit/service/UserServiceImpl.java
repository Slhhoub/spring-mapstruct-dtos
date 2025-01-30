package schhoub.Testing.TestingJUnit.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schhoub.Testing.TestingJUnit.DTOs.UsersDto;
import schhoub.Testing.TestingJUnit.DTOs.UsersDtoReponse;
import schhoub.Testing.TestingJUnit.mappers.UserMapper;
import schhoub.Testing.TestingJUnit.mappers.UserReponseMapper;
import schhoub.Testing.TestingJUnit.model.Users;
import schhoub.Testing.TestingJUnit.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserReponseMapper userReponseMapper;


    @Override
    public List<UsersDtoReponse> getAllUsers() {
        List<Users> users = this.userRepository.findAll();
        return userReponseMapper.toListDto(users);
    }

    @Override
    public UsersDtoReponse getUserById(Integer id) {
        Users users = this.userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return userReponseMapper.toDto(users);
    }

    @Override
    public UsersDto save(UsersDto users) {
        Users usersEntity = userMapper.toEntity(users);
        Users ajouterUser = this.userRepository.save(usersEntity);
        return userMapper.toDto(ajouterUser);
    }

    @Override
    public UsersDto update(UsersDto user, Integer id) {
        Users userEntity = userMapper.toEntity(user);
        Users existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        // Mettre à jour les champs nécessaires
        existingUser.setUsername(userEntity.getUsername());
        existingUser.setEmail(userEntity.getEmail());
        existingUser.setPassword(userEntity.getPassword());
        Users updateUser = userRepository.save(existingUser);

        return userMapper.toDto(updateUser);
    }

    @Override
    public void deleteUser(Integer id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}
