package OODI;

public class EXTERNALEGGSUPPLY {
	
	public EXTERNALEGGSUPPLY(String eggscollected,String collecteddate){
		
		Database Db =new Database();
		Db.WritetoDatabaseexternaleggsupply(eggscollected, collecteddate);
		
		
		
		
		
		
		
	}

}
