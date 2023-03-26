//package com.jwt.db.services;
//
//import com.jwt.db.model.CustomUserDetails;
//import com.jwt.db.model.User;
//import com.jwt.db.repo.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService{
//
//	@Autowired
//	private UserRepository userRepository;
//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
//
//		 final User user = this.userRepository.findByUsername(userName);
//
//		if(user==null){
//			throw new UsernameNotFoundException("User Not Found!!");
//		}else{
//			return new CustomUserDetails(user);
//		}
//
////		if(userName.equals("user")) {
////			return new User("user","1234",new ArrayList<>());
////		}else {
////			throw new UsernameNotFoundException("User not found");
////		}
//
//		
//	}
//}
