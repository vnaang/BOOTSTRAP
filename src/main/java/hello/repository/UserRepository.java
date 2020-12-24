package hello.repository;


import hello.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

    User findByUsername(String username);
}

