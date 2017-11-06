package DBFactor;

public class OracleFactory extends DBFactory{

	@Override
	public
	Connection CreateConnection() {
		// TODO Auto-generated method stub
		return new OracleConnection();
	}

	@Override
	public
	Statement CreateStatement() {
		// TODO Auto-generated method stub
		return new OracleStatement();
	}

}
