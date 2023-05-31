package com.fateczl.radarapi.security;

import com.fateczl.radarapi.model.entities.Funcionario;
import com.fateczl.radarapi.model.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Funcionario user = funcionariosRepository.findByEmail(username);

        if (user == null) {
            user = funcionariosRepository.findByUsername(username);
        }

        if (!validUser(user)) {
            throw new UsernameNotFoundException("Usuario sem permissão");
        }

        return user;
    }

    private boolean validUser(Funcionario user) {
        boolean validUser = false;

        if (user != null && user.getRoles() != null) {
            validUser = true;
        }

        return validUser;
    }
}
