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

    public void createNewUser(String username, String password, String firstName, String lastName, String street,
                              Integer houseNumber, Integer zipCode, String city){

        Address address = addressRepository.findAddressByCityAndStreetAndHouseNumber(city, street, houseNumber);
        if (address == null){
            address = new Address(street, houseNumber, zipCode, city);
            addressRepository.save(address);
        }
            User user = new User(username, password, firstName, lastName, address);
        user.addNewRole("USER");
        //user.addNewRole("ADMIN");
        userRepository.save(user);

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new UserDetailsImpl(userRepository.findUserByUsername(s));
    }
}
