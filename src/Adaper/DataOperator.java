package Adaper;

public abstract class DataOperator {
  private String password;

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
abstract String doEncrypt(String password); 
}
