package OODI;

public class InternalEggsSupply {
	private String Fullname;
	private String WorkStation;
	private String employeeID;
	private String Colleceted;
	private String Spoilled;
	private String Broken ;
	
	
	public InternalEggsSupply(String Fullname,String WorkStation,String employeeID,String Collected, String Spoilt, String Broken ) {
		this.Fullname=Fullname;
		this.WorkStation=WorkStation;
		this.employeeID=employeeID;
		this.Colleceted=Colleceted;
		this.Spoilled=Spoilled;
		this.Broken=Broken;
		Database DB =new Database();
		DB.WritetoDatabaseInternalEggsSupply(Fullname, WorkStation, employeeID, Collected, Spoilt, Broken);
		
		
		
	}


}
