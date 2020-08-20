package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import model.CustomeUserDetails;
import model.User;
import repository.UserRepository;

@Service
public class CustomService implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Optional<User>user=repo.findByUsername(username);
		if(user==null)
			throw new UsernameNotFoundException("User not found");
		return user.map(CustomeUserDetails:: new).get();
		
	}

}


