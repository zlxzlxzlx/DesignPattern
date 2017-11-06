package LogFactor;

/**
 * Created by dell on 2017/11/6 0006.
 */
public class FileLogFactory extends LogFactory{
    Log createLog()
    {
      
      return new FileLog();

    }
}
