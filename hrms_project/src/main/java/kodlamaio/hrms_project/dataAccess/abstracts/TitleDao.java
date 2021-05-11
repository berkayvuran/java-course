package kodlamaio.hrms_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms_project.entities.concretes.Title;

public interface TitleDao extends JpaRepository<Title, Integer> {

}
