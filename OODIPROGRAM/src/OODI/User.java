package OODI;

public class User {
	
	
		 
		 protected String firstName;
		 protected String lastName;
		 protected String title;
		 
		 protected String position;
		 protected String emailAddress;
		 protected String Contact;
		 protected String Username;
		 protected String Password;

		 
		 public User(String title,String firstName, String lastName, String position, String emailAddress,String Contact,String
				 Username,String Password){
			
			 this.title= title;
			 this.firstName= firstName;
			 this.lastName= lastName;
			 this.position= position;
			 this.emailAddress= emailAddress;
			 this.Username=Username;
			 this.Password=Password;
			
		 }
		 
		 public String getName() {
			 return (this.lastName +" " + this.firstName);
		 }
		 
		

		 public String emailAddress() {
			 return (this.emailAddress);
		 }
		 
		 
		 	 
		 public String getPosition() {
			 return(this.position);
		 }
		 

}
