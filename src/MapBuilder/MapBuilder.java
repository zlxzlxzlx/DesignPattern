package MapBuilder;

public abstract class MapBuilder {
	 protected Map  map=new Map();
	  public abstract void BuildSky();
	  public abstract void BuildGround();
	  public abstract void BuildBackGround();
	  public Map getMap(){
		  MapP.show();
		 return map;
	  }
}
