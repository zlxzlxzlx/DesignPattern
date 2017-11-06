package MapBuilder;

public class CharacterDirector {
	 private CharacterBuilder characterBuilder;
	   public CharacterDirector(CharacterBuilder characterBuilder) {
		   this.characterBuilder=characterBuilder;
	    }
	   public void setMealBuilder(CharacterBuilder characterBuilder){
		   this.characterBuilder=characterBuilder;  
	   }
	   public Character construct(){
		   characterBuilder.BuildBody();
		   characterBuilder.BuildConstume();
		   characterBuilder.BuildEquipment();
		return characterBuilder.getCharacter();
	   }
}
