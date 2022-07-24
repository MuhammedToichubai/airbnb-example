package peaksoft.airbnbexample.services.impl;

import org.springframework.stereotype.Service;
import peaksoft.airbnbexample.models.auth.Role;
import peaksoft.airbnbexample.models.auth.User;
import peaksoft.airbnbexample.repositories.RoleRepository;
import peaksoft.airbnbexample.repositories.UserRepository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class Test {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public Test(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    private List<Role> getRoles(){
        List<Role> roles = new ArrayList<>(List.of(
                new Role("USER"),
                new Role("ADMIN"),
                new Role("VENDOR")
        ));
        return roles;
    }

    @PostConstruct
    public void saveRole(){
        List<Role> roles = getRoles();
        roleRepository.saveAll(roles);
    }

    @PostConstruct
    public void saveUser(){
        List<Role> roles = getRoles();
        List<User> users = new ArrayList<>(List.of(
                new User("Muhammed Toichubai uulu","muhammed@gmail.com", "password", "jffhgifer8hf", roles.get(0)),
                new User("Kanat Ulukbek uulu","kanat@gmail.com", "password", "jffhgifer8hf", roles.get(1)),
                new User("Altynbek Mamasadykov","altynbek@gmail.com", "password", "jffhgifer8hf", roles.get(2))
        ));
        userRepository.saveAll(users);
    }


}
