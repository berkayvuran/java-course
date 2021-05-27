package kodlamaio.hrms_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms_project.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findUserByEmail (String email);
}
