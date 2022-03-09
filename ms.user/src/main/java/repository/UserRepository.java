package repository;

// import com.vanessa.ms.user.*;

import controller.domain.UserDomain;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

// Primeira pasta controller -> classe UserDomain
// Segunda pasta repository -> Interface UserRepository
// ? Coloquei Int dentro de <> e deu errao pq? precisa ser só Integer ?
// O que precisamos importar?

@Repository
public interface UserRepository extends JpaRepository<UserDomain, Integer>{


	
	
}
