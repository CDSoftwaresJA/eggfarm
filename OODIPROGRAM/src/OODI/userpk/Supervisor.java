package OODI.userpk;
import OOD.*;
public class Supervisor extends User{
	protected String employeeID;
	private static int ID=99;

	public Supervisor(String title, String firstName, String lastName,
			String position, String emailAddress,
			String Contact, String Username, String Password) {
		super(title, firstName, lastName, position, emailAddress, Contact,
				Username, Password);
		// TODO Auto-generated constructor stub
		
		this.employeeID=lastName+Integer.toString(ID--);
	

	
	 Database Database =new Database();
	 Database.WritetoDatabaseSupervisor(title, firstName, lastName, position, emailAddress, Contact,
				Username, Password,employeeID);
}}