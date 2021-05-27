package kodlamaio.hrms_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms_project.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
