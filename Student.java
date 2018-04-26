import java.util.*;

public class Student extends TA {
	String name;
	String id;
	String subject;
	String major;
	String bd;
	public void setName(String n) {
		this.name = n ;
	}
	
	public String getName() {
		return name;
	}
	public Calendar getAge() {
		return Calendar.getInstance();
	}
	public String toString() {
		return "Name : "+name+" , Birth Year :"+bd+ ", Age : " +getAge()+", Student ID : "+id+" , Major : "+major;
	}
	
	

}
