package dimentor.webflux.service.impl;

import dimentor.webflux.repo.UserRepository;
import dimentor.webflux.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService, ReactiveUserDetailsService {

    final private UserRepository userRepository;

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userRepository
                .findByUsername(username)
                .cast(UserDetails.class);
    }
}
