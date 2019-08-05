package pl.kf.sportstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.kf.sportstore.repository.UserRepository;

public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
