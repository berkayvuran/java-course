package kodlamaio.hrms_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms_project.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
