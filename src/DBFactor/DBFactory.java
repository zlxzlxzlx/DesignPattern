package DBFactor;

public abstract class DBFactory {
  public abstract Connection CreateConnection();
  public abstract Statement CreateStatement();
}
