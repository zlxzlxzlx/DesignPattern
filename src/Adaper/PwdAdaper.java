package Adaper;

public class PwdAdaper extends DataOperator{

	private Adaper pwd;
	public PwdAdaper()
	{
		pwd=new Adaper();
	}
	public PwdAdaper(Adaper pwd){
		this.pwd=pwd;
	}
	
	@Override
	public String doEncrypt(String password) {
		return pwd.doEncrypt(password);
	}
   
}
