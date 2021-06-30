package kodlamaio.hrmsproject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.hrmsproject.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>
{
    User findByEmail(String email);
    User findByEmailAndEmailVerifyCode(String email, String emailVerifyCode);
}