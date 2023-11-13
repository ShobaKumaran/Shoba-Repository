package Week3.Day3;

public class JavaConnectionTestClass implements InterfaceDBConnection{

	public void DBConnect() {
		 System.out.println("Establish database connection");		
	}

	public void DBDisconnect() {
		 System.out.println("Disconnect database connection");
	}

	public void ExecuteUpdate() {
		 System.out.println("update database connection");
		
	}

	public static void main(String[] args) {
		 
		JavaConnectionTestClass connObj = new JavaConnectionTestClass();
		connObj.DBConnect();
		connObj.DBDisconnect();
		connObj.ExecuteUpdate();

	}

}
