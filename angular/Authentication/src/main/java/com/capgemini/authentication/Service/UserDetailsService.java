package com.capgemini.authentication.Service;

import java.util.Map;
import java.util.Optional;
 
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;



public interface UserDetailsService {

	
	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;
	 
    User findUserByEmail(String email);
 
    Optional<User> findUserById(Long id);
 
    LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);


	
//	import com.javachinna.dto.LocalUser;
//	import com.javachinna.dto.SignUpRequest;
//	import com.javachinna.exception.UserAlreadyExistAuthenticationException;
//	import com.javachinna.model.User;
	 

}
