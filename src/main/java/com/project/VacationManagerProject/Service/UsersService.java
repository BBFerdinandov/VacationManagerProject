package com.project.VacationManagerProject.Service;

import com.project.VacationManagerProject.Repository.UsersRepository;
import com.project.VacationManagerProject.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Users registerUser(String login, String password, String firstName) {
        if(login!=null && password!=null) {
            return null;
        } else {
            Users users = new Users();
            users.setLogin(login);
            users.setFirstName(firstName);
            users.setPassword(password);
            return usersRepository.save(users);
        }
    }
    public Users authenticate(String login, String firstName, String password) {
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
