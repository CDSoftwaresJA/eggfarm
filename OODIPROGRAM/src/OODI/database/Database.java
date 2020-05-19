package OODI.database;
import java.sql.*;
import OOD.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Database {
	
	private Connection con;
	private Statement st ;
	private ResultSet rs ;
	private PreparedStatement pst;
	String url = "jdbc:mysql://localhost:3306/eggfarm";
    String dbuser = "schoolwork";
    String dbupassword ="@Links1010";
	public Database(){
		
	}
	
	public void WritetoDatabasesubordinate(String title, String firstName, String lastName,
			String position, String emailAddress,
			String Contact, String Username, String Password,String employeeID){
		

		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection(url,dbuser,dbupassword);
		pst=(PreparedStatement)con.prepareStatement("INSERT INTO subordinate(`title`, `firstName`, `lastName`, `position`, `emailAddress`,`Contact`,`Username`,`Password`,`.employeeID`)VALUES (?,?,?,?,?,?,?,?,?)");
		
		pst.setString(1,title);
		pst.setString(2, firstName );
		pst.setString(3,lastName);
		pst.setString(4,position);
		pst.setString(5, emailAddress);
		pst.setString(6, Contact);
		pst.setString(7,Username);
		pst.setString(8, Password);
		pst.setString(9, employeeID);
	
		pst.executeUpdate();
		
		JOptionPane.showMessageDialog(new JFrame(), ("Subordinated Registered "));
		pst.close();
		con.close();	
		}catch (Exception e ){
			JOptionPane.showMessageDialog(new JFrame(), ("error"+e));	
			
		}
		
		
	}
	public void WritetoDatabaseSupervisor(String title, String firstName, String lastName,
			String position, String emailAddress,
			String Contact, String Username, String Password,String employeeID){
		

		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection(url,dbuser,dbupassword);
		pst=(PreparedStatement)con.prepareStatement("INSERT INTO supervisor(`title`, `firstName`, `lastName`, `position`, `emailAddress`,`Contact`,`Username`,`Password`,`employeeID`)VALUES (?,?,?,?,?,?,?,?,?)");
		
		pst.setString(1,title);
		pst.setString(2, firstName );
		pst.setString(3,lastName);
		pst.setString(4,position);
		pst.setString(5, emailAddress);
		pst.setString(6, Contact);
		pst.setString(7,Username);
		pst.setString(8, Password);
		pst.setString(9, employeeID);
	
		pst.executeUpdate();
		
		JOptionPane.showMessageDialog(new JFrame(), ("Supervisor Registered "));
		pst.close();
		con.close();	
		}catch (Exception e ){
			JOptionPane.showMessageDialog(new JFrame(), ("error"+e));	
			
		}
	
		
		
		
	}
	public boolean verifySupervisor(String username, String password){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from supervisor";
				rs=st.executeQuery(Query);	
		
				while(rs.next()){
					String DBusername =rs.getString("Username");
					String DBpasword =rs.getString("Password");
					if (username.equals(DBusername)&& password.equals(DBpasword)){
						return true;
					}
					
					}
				
				//JOptionPane.showMessageDialog(new JFrame(), ("DataBase Accessed"));
				con.close();	
				
		}catch(Exception e){
				
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));
				}
		return false;
		}
	
	public boolean verifySubordinate(String username, String password){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from subordinate";
				rs=st.executeQuery(Query);	
		
				while(rs.next()){
					String DBusername =rs.getString("Username");
					String DBpasword =rs.getString("Password");
					if (username.equals(DBusername)&& password.equals(DBpasword)){
						return true;
					}
					
					}
				
				//JOptionPane.showMessageDialog(new JFrame(), ("DataBase Accessed"));
				con.close();	
				
		}catch(Exception e){
				
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));
				}
		return false;
		}
	
	public boolean verifyExternaleggsupplier(String firstname, String lastname){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from Externaleggsupplier";
				rs=st.executeQuery(Query);	
		
				while(rs.next()){
					String lname =rs.getString("lastname");
					String fname =rs.getString("firstname");
					if (firstname.equals(fname)&& lastname.equals(lname)){
						return true;
					}
					
					}
				
				//JOptionPane.showMessageDialog(new JFrame(), ("DataBase Accessed"));
				con.close();	
				
		}catch(Exception e){
				
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));
				}
		return false;
		}
		
		

	
	
	public String getSubordinateEmployeeID(String username, String password){
		String employeeid = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from subordinate";
				rs=st.executeQuery(Query);	
		
				while(rs.next()){
					String DBusername =rs.getString("Username");
					String DBpasword =rs.getString("Password");
					if (username.equals(DBusername)&& password.equals(DBpasword)){
						employeeid =rs.getString(".employeeID");
						
					}
					
					}
				
				//JOptionPane.showMessageDialog(new JFrame(), ("DataBase Accessed"));
				con.close();	
				
		}catch(Exception e){
				
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));
				}
		return  employeeid;
		
		
	}
	
	
	public String getSubordinateFullName(String username, String password){
		String FullName = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from subordinate";
				rs=st.executeQuery(Query);	
		
				while(rs.next()){
					String DBusername =rs.getString("Username");
					String DBpasword =rs.getString("Password");
					if (username.equals(DBusername)&& password.equals(DBpasword)){
						FullName =rs.getString("firstName")+" "+rs.getString("lastName");
						
						}
					}				
				//JOptionPane.showMessageDialog(new JFrame(), ("DataBase Accessed"));
				con.close();	
				
		}catch(Exception e){
				
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));
				}
		return  FullName;
		
		
	}

	public void WritetoDatabaseInternalEggsSupply(String Fullname,
			String WorkStation,String employeeID,String Collected, String Spoilt, String Broken ){
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url,dbuser,dbupassword);
			pst=(PreparedStatement)con.prepareStatement("INSERT INTO InternalEggsSupply(`Fullname`, `WorkStation`, `employeeID`, `Collected`, `Spoilt`,`Broken`)VALUES (?,?,?,?,?,?)");
			
			pst.setString(1,Fullname);
			pst.setString(2, WorkStation );
			pst.setString(3,employeeID);
			pst.setString(4,Collected);
			pst.setString(5, Spoilt);
			pst.setString(6, Broken);
			
		
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(new JFrame(), ("Data Added to Database Succesfuly "));
			pst.close();
			con.close();	
			}catch (Exception e ){
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));	
				
			}
		
		
		
		
	}

	public int getTotlalCollectedeggs() {
		int total=0;
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from InternalEggsSupply";
				rs=st.executeQuery(Query);	
		
				while(rs.next()){
					String Stotal =rs.getString("Collected");
					total=Integer.parseInt(Stotal)+total;
					}									
				//JOptionPane.showMessageDialog(new JFrame(), ("DataBase Accessed"));
				con.close();	
				
		}catch(Exception e){
				
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));
				}
		return total;
	}
	
	
	
	public void WritetoDatabaseexternalsupplier(String firstname, String lastname, String farmaddress,String contactnumber){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url,dbuser,dbupassword);
			pst=(PreparedStatement)con.prepareStatement("INSERT INTO Externaleggsupplier(`firstname`, `lastname`, `farmaddress`, `contactnumber`)VALUES (?,?,?,?)");
			
			pst.setString(1,firstname);
			pst.setString(2, lastname );
			pst.setString(3,farmaddress);
			pst.setString(4,contactnumber);
			
			
		
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(new JFrame(), ("Data Added to Database Succesfuly "));
			pst.close();
			con.close();	
			}catch (Exception e ){
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));	
				
			}
		
		
		
	}
	
	
	public void WritetoDatabaseexternaleggsupply(String eggscollected,String collecteddate){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url,dbuser,dbupassword);
			pst=(PreparedStatement)con.prepareStatement("INSERT INTO Externaleggsupply(`eggscollected`,`collecteddate`)VALUES (?,?)");
			
			pst.setString(1,eggscollected);
			pst.setString(2,collecteddate);
						
		
			pst.executeUpdate();
			
			JOptionPane.showMessageDialog(new JFrame(), ("Data Added to Database Succesfuly "));
			pst.close();
			con.close();	
			}catch (Exception e ){
				JOptionPane.showMessageDialog(new JFrame(), ("error"+e));	
				
			}
		
		
		
		
	}
	
	public Object[][]  readFromexternaleggsupply(){
		Object[][] data = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from Externaleggsupply";
				
				
				 data = new Object[100][2];
				rs=st.executeQuery(Query);
				
				int i=0;
				while(rs.next()){
					String eggcollected ="\t\t"+rs.getString("eggscollected");
					String collecteddate =rs.getString("collecteddate");
										
					data[i][0]=eggcollected;
					data[i][1]=collecteddate;
					i+=1;
				}}catch(Exception e){
					
					
					JOptionPane.showMessageDialog(new JFrame(), ("error222"+e));
					
				}
					
		
		
		return data;}
	
	public Object[][]  readFromInternalsupply(){
		Object[][] data = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from InternalEggsSupply";
				
				
				 data = new Object[100][6];
				rs=st.executeQuery(Query);
				
				int i=0;
				while(rs.next()){
					String fullname =rs.getString("Fullname");
					String workstation =rs.getString("WorkStation");
					String employeeID =rs.getString("employeeID");	
					String Collected =rs.getString("Collected");	
					String Spoilt =rs.getString("Spoilt");	
					String Broken =rs.getString("Broken");	
									
					
					data[i][0]=fullname;
					data[i][1]=workstation ;
					data[i][2]=employeeID;
					data[i][3]=Collected;
					data[i][4]=Spoilt;
					data[i][5]=Broken;
					i+=1;
				}
				}catch(Exception e){
					
					
					JOptionPane.showMessageDialog(new JFrame(), ("error222"+e));
					
				}
					
		
		
		return data;}
		
		
		
public Object[][]  readsupervisordata(){
		Object[][] data = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
				
				con= DriverManager.getConnection(url,dbuser,dbupassword);
				st=con.createStatement();
				String Query="select* from supervisor";
				
				
				 data = new Object[100][9];
				rs=st.executeQuery(Query);
				
				int i=0;
			
				while(rs.next()){
					String title =rs.getString("title");
					String firstName =rs.getString("firstName");
					String lastName =rs.getString("lastName");	
					String position=rs.getString("position");	
					String emailAddress =rs.getString("emailAddress");	
					String Contact =rs.getString("Contact");	
					String Username =rs.getString("Username");
					String Password =rs.getString("Password");
					String employeeID =rs.getString("employeeID");
										
					data[i][0]=title;
					data[i][1]=firstName ;
					data[i][2]=lastName;
					data[i][3]=position;
					data[i][4]=emailAddress;
					data[i][5]=Contact;
					data[i][6]=Username;
					data[i][7]=Password;
					data[i][8]=employeeID;
					i+=1;
				}
				}catch(Exception e){
					
					
					JOptionPane.showMessageDialog(new JFrame(), ("error222"+e));
					
				}
					
		
		
		return data;}
		

	
public Object[][]  readsubordinatedata(){
	Object[][] data = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection(url,dbuser,dbupassword);
			st=con.createStatement();
			String Query="select* from subordinate";
			
			
			 data = new Object[100][9];
			rs=st.executeQuery(Query);
			
			int i=0;
		
			while(rs.next()){
				String title =rs.getString("title");
				String firstName =rs.getString("firstName");
				String lastName =rs.getString("lastName");	
				String position=rs.getString("position");	
				String emailAddress =rs.getString("emailAddress");	
				String Contact =rs.getString("Contact");	
				String Username =rs.getString("Username");
				String Password =rs.getString("Password");
				String employeeID =rs.getString(".employeeID");
									
				data[i][0]=title;
				data[i][1]=firstName ;
				data[i][2]=lastName;
				data[i][3]=position;
				data[i][4]=emailAddress;
				data[i][5]=Contact;
				data[i][6]=Username;
				data[i][7]=Password;
				data[i][8]=employeeID;
				i+=1;
			}
			}catch(Exception e){
				
				
				JOptionPane.showMessageDialog(new JFrame(), ("error222"+e));
				
			}
				
	
	
	return data;}
	
public Object[][]  readFromexternalsuppliers(){
	Object[][] data = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection(url,dbuser,dbupassword);
			st=con.createStatement();
			String Query="select* from Externaleggsupplier";
			
			
			 data = new Object[50][4];
			rs=st.executeQuery(Query);
			
			int i=0;
			while(rs.next()){
				String firstname =rs.getString("firstname");
				String lastname =rs.getString("lastname");
				String farmaddress=rs.getString("farmaddress");	
				String contactnumber =rs.getString("contactnumber");	
										
				
				data[i][0]=firstname;
				data[i][1]=lastname ;
				data[i][2]=farmaddress;
				data[i][3]=contactnumber;
				
				i+=1;
			}
			}catch(Exception e){
				
				
				JOptionPane.showMessageDialog(new JFrame(), ("error222"+e));
				
			}
				
	
	
	return data;}
	
}


