package schhoub.Testing.TestingJUnit.mappers;

import org.mapstruct.Mapper;
import schhoub.Testing.TestingJUnit.DTOs.UsersDto;
import schhoub.Testing.TestingJUnit.DTOs.UsersDtoReponse;
import schhoub.Testing.TestingJUnit.model.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserReponseMapper {
    UsersDtoReponse toDto(Users users);
    List<UsersDtoReponse> toListDto(List<Users> users);
    Users toEntity(UsersDtoReponse usersDto);
}
