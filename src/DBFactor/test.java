package DBFactor;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DBFactory factory=new OracleFactory(); 
    Connection connection=factory.CreateConnection();
    Statement statement=factory.CreateStatement();
    connection.CreateConnection();
    statement.CreateStatement();
	}

}
