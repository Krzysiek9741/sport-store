package pl.kf.sportstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.kf.sportstore.authentication.UserDetailsImpl;
import pl.kf.sportstore.model.user.Address;
import pl.kf.sportstore.model.user.User;
import pl.kf.sportstore.repository.AddressRepository;
import pl.kf.sportstore.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    UserRepository userRepository;
    AddressRepository addressRepository;

    @Autowired
    public UserService(UserRepository userRepository, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
    }

    public void createNewUser(User user){
        Address addressFromForm = user.getAddress();
        Address addressInDB = addressRepository.findAddressByCityAndStreetAndHouseNumber(addressFromForm.getCity(),
                addressFromForm.getStreet(), addressFromForm.getHouseNumber());
        if (addressInDB == null){
            addressInDB = addressFromForm;
            addressRepository.save(addressInDB);
        }
        user.setAddress(addressInDB);
        user.addNewRole("USER");
        userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.getOne(id);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new UserDetailsImpl(userRepository.findUserByUsername(s));
    }

    public User getUserByUsername(String username){
        return userRepository.findUserByUsername(username);
    }
}
