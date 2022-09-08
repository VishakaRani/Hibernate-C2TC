package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp_store1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	


public class employee implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int eid;
	private String ename;
	private double esalary;
	public int geteid() {
		return eid;
	}
	public void seteid(int eid) {
		this.eid = eid;
	}
	public String getename() {
		return ename;
	}
	public void setName(String ename) {
		this.ename = ename;
	}
	public double getesalary() {
		return esalary;
	}
	public void setSalary(double esalary) {
		this.esalary = esalary;
	}
	
}