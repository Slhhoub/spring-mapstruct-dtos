package schhoub.Testing.TestingJUnit.DTOs;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import schhoub.Testing.TestingJUnit.model.Users;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UsersDto {
    private Integer id;
    private String username;
    private String email;
    private String password;

    // convert un utilisateur(entity) en dto
    /*public static UsersDto toDto(Users users){
        if(users!=null){
            return null;
        }
        return UsersDto.builder()
                .id(users.getId())
                .username(users.getUsername())
                .email(users.getEmail())
                .password(users.getPassword())
                .build();
    }*/
    // convertir une liste d'entités utilisateurs en liste de dtos
    /*public static List<UsersDto> toDto(List<Users> users){
       return users.stream()
               .map(user -> UsersDto.builder()
                       .id(user.getId())
                       .username(user.getUsername())
                       .email(user.getEmail())
                       .password(user.getPassword())
                       .build()
               )
               .collect(Collectors.toList());
    }*/
    // convert un dto en entity utilisateur
    /*public static Users toEntity(UsersDto usersDto){
        if(usersDto==null){
            return null;
        }
        return Users.builder()
                .id(usersDto.getId())
                .username(usersDto.getUsername())
                .email(usersDto.getEmail())
                .password(usersDto.getPassword())
                .build();
    }*/


}
