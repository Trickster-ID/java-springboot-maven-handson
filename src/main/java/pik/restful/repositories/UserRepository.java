package pik.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pik.restful.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}