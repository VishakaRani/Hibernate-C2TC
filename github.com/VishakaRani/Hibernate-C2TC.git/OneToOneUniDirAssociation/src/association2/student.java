package association2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class student {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
private int studentid;
private String name;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="addressid")
private Address address;
public int getSid() {
	return studentid;
}
public void setSid(int sid) {
	this.studentid = sid;
}
public String getSname() {
	return name;
}
public void setSname(String sname) {
	this.name = sname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public student() {
}
public student(int sid, String sname, Address address) {
	this.studentid = sid;
	this.name = sname;
	this.address = address;
}

}