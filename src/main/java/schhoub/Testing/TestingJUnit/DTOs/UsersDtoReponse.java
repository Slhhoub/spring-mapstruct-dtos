package schhoub.Testing.TestingJUnit.DTOs;

import lombok.Builder;
import lombok.Data;
import schhoub.Testing.TestingJUnit.model.Users;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UsersDtoReponse {
    private Integer id;
    private String username;
    private String email;

    // convert un utilisateur(entity) en dto
  /*  public static UsersDtoReponse toDto(Users users){
        if(users==null){
            return null;
        }
        return UsersDtoReponse.builder()
                .id(users.getId())
                .username(users.getUsername())
                .email(users.getEmail())
                .build();
    }*/

    // convertir une liste d'entités utilisateurs en liste de dtos
  /*  public static List<UsersDtoReponse> toDto(List<Users> users){
        if(users==null){
            return null;
        }
        return users.stream()
                .map(user -> UsersDtoReponse.builder()
                        .id(user.getId())
                        .username(user.getUsername())
                        .email(user.getEmail())
                        .build()
                )
                .collect(Collectors.toList());
    }*/
    // convert un dto en entity utilisateur
  /*  public static Users toEntity(UsersDtoReponse usersDto){
        if(usersDto==null){
            return null;
        }
        return Users.builder()
                .id(usersDto.getId())
                .username(usersDto.getUsername())
                .email(usersDto.getEmail())
                .build();
    }*/

}
