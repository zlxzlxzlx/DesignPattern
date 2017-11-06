package MapBuilder;

import KFUBuilder.KFCWaiter;
import KFUBuilder.Meal;
import KFUBuilder.MealBuilder;
import KFUBuilder.MealBuilderA;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  MapBuilder mapBuilder=new MapBuilderA();
	      MapDirector mapDirector=new MapDirector(mapBuilder);
	       Map map=mapDirector.construct();
	       CharacterBuilder characterBuilder=new CharacterBuilderA();
	       CharacterDirector characterDirector=new CharacterDirector(characterBuilder);
	       Character character=characterDirector.construct();
	}

}
