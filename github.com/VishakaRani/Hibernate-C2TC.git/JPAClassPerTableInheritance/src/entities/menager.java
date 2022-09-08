package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp_store1")
public class menager extends employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}
