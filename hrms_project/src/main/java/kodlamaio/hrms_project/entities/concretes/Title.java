package kodlamaio.hrms_project.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_titles")

public class Title {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "job_title")
	private String titleName;
	
	public Title () {}
	
	public Title(int id, String titleName) {
		super();
		this.id = id;
		this.titleName = titleName;
	}
}
