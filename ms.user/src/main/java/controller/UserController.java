package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import controller.domain.UserDomain;
import service.UserService;

// 4 Criar classe "UserController" em pasta controller. Após UserService.
// 1 Denominar @RestController e importar.


@RestController
public class UserController {

  private final UserService userService;
	
  public UserController(UserService userService) {
	this.userService = userService;
}

@GetMapping("/users")
@ResponseStatus(HttpStatus.OK)
  public List<UserDomain> getAllUsers() {
  List<UserDomain> user = userService.getAllUsers(); // Pq essa frase é escrita assim?
  return user;  // No video está users, está correto? 
 }
	
}
