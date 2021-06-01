package kodlamaio.northwind.core.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);
	
}
