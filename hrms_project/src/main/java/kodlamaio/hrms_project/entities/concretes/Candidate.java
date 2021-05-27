package kodlamaio.hrms_project.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name="user_id")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Candidate extends User {
	
	@Column (name="first_name")
	private String firstName;
	
	@Column (name="last_name")
	private String lastName;
	
	@Column (name="nationality_id")
	private String nationalityId;
	
	@Column (name="birth_date")
	private LocalDate birthDate;
}
