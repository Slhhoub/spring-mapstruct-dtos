package schhoub.Testing.TestingJUnit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import schhoub.Testing.TestingJUnit.model.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
