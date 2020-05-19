package OODI;

public class Subordinate extends User{
	protected String employeeID;
	 private static int ID=0;

	public Subordinate(String title, String firstName, String lastName,
			String position, String emailAddress,
			String Contact, String Username, String Password) {
		super(title, firstName, lastName, position, emailAddress, Contact,
				Username, Password);
		// TODO Auto-generated constructor stub
		
		 this.employeeID=firstName+Integer.toString(ID++);
		 
		 Database Database =new Database();
		 Database.WritetoDatabasesubordinate(title, firstName, lastName, position, emailAddress, Contact,
					Username, Password,employeeID);
	}

	
}
