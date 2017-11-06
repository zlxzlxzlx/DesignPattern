package LogFactor;

/**
 * Created by dell on 2017/11/6 0006.
 */
public class test {
	public static void main(String[] args) {
    LogFactory factory=new FileLogFactory();
    Log log=factory.createLog();
    log.writeLog();
	}
}
