package KFUBuilder;

/*÷∏ª”’ﬂ*/
public class KFCWaiter {
   private MealBuilder mealBuilder;
   public KFCWaiter(MealBuilder mealBuilder) {
	   this.mealBuilder=mealBuilder;
    }
   public void setMealBuilder(MealBuilder mealBuilder){
	   this.mealBuilder=mealBuilder;  
   }
   public Meal construct(){
	   mealBuilder.BuildFood();
	   mealBuilder.BuildDrink();
	return mealBuilder.getMeal();
   }
}
