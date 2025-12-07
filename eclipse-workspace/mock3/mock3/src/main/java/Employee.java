import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employee_ty")
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String branch;
	

}
