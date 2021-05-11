package kodlamaio.hrms.entities.concretes;

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
	@Column(name = "Id")
	private int id;

	@Column(name = "Title")
	private String titleName;

	public Title(int id, String titleName) {
		super();
		this.id = id;
		this.titleName = titleName;
	}
}