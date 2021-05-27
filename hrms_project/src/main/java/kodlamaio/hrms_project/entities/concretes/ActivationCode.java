package kodlamaio.hrms_project.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="company_activation_code")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivationCode {
	
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	@Column (name="user_id")
	private int userId;
	
	@Column (name="activation_code")
	private String activationCode;
	
	@Column (name="is_confirmed")
	private boolean isActive;
	
	@Column (name="confirmation_date", columnDefinition = "Date default CURRENT_DATE")
	private LocalDate createAt = LocalDate.now();

	public ActivationCode(int userId, String activationCode, boolean isActive, LocalDate createAt) {
		super();
		this.userId = userId;
		this.activationCode = activationCode;
		this.isActive = isActive;
		this.createAt = createAt;
	}
}