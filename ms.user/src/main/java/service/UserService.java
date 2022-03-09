package service;

import java.util.List;

import org.springframework.stereotype.Service;

import controller.domain.UserDomain;
import repository.UserRepository;

// 3 Criar classe na pasta service chamada de "UserService".
// 1 Denominar @Service e importar.
// 2 Declarar a UserRepository (Private);
// 3 Criar um construtor para injetar a dependencia da repository. Onde? para que ?
// ? Pq o final? Precisa sempre?
// Crie o UserController.

@Service
public class UserService {
	
   private final UserRepository userRepository;

   public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
}	
   
   public List<UserDomain> getAllUsers() {
	  List<UserDomain> users = userRepository.findAll();
	  return users;
   }

}