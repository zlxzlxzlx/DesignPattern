package MapBuilder;

public abstract class CharacterBuilder {
	 protected Character  character=new Character();
	  public abstract void BuildBody();
	  public abstract void BuildConstume();
	  public abstract void BuildEquipment();
	  public Character getCharacter(){
		 CharacterC.show();
		 return character;
	  }
}
