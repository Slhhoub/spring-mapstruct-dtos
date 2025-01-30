package schhoub.Testing.TestingJUnit.mappers;

import org.mapstruct.Mapper;
import schhoub.Testing.TestingJUnit.DTOs.UsersDto;
import schhoub.Testing.TestingJUnit.model.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UsersDto toDto(Users users);
    List<UsersDto> toListDto(List<Users> users);
    Users toEntity(UsersDto usersDto);
}
