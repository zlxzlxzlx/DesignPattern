package KFUBuilder;
/*
 * ��������
 * */
public abstract class MealBuilder {
	
  protected Meal  meal=new Meal();
  public abstract void BuildFood();
  public abstract void BuildDrink();
  public Meal getMeal(){
	  FoofMeal.show();
	  return meal;
  }
}
