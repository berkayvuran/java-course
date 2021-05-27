package kodlamaio.hrms_project.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="companies")
@PrimaryKeyJoinColumn(name="user_id")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{

	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="is_active")
	private boolean isVerified;
	
}
