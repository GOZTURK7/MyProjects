package com.techproed.SpringBootJWT_Study;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
// JWT için MyUserDetailsService class mutlaka create edilmeli. loadUserByUsername() method ile App'e user upload edilmeli.

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // bu method app'e user'ın username password ve authorizes tanımladı --> çubuk adam tüm vasıfları ile create edildi.
        return new User("admin", "nimda", new ArrayList<>()); // new ArrayList<>() --> collection type authorizes
        // birden fazla ve sabit olduğu için depolayacak bir boş array create edildi.
    }
}
