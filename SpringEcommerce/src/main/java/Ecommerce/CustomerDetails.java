package Ecommerce;

public class CustomerDetails {
public CustomerDetails() {
		 
	}
@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", mobileNo="
				+ mobileNo + ", email=" + email + ", country=" + country + "]";
	}
private int id;
private String FirstName;
private String LastName;
private long mobileNo;
private String email;
private String country;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
 
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
