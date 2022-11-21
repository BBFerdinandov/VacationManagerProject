package com.project.VacationManagerProject.Repository;

import com.project.VacationManagerProject.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByLoginAndPassword(String login, String password);

}
