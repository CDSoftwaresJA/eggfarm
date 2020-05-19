package OODI;

public class EXTERNALEGGSUPPLYER {
	private String firstname,lastname,farmaddress,contactnumber ;
	
	
	
	public EXTERNALEGGSUPPLYER(String firstname, String lastname, String farmaddress,String contactnumber){
		
		Database DB =new Database();
		DB.WritetoDatabaseexternalsupplier(firstname, lastname,farmaddress,contactnumber);
		
		
		
		
		
	}

}
