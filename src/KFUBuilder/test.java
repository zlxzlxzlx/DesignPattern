package KFUBuilder;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MealBuilder mealBuilder=new MealBuilderA();
      KFCWaiter kfcWaiter=new KFCWaiter(mealBuilder);
      Meal meal=kfcWaiter.construct();
     
	}

}
