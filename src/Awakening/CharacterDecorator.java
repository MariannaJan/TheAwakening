package Awakening;

public abstract class CharacterDecorator implements ICharacter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected ICharacter player;
	
	
	public CharacterDecorator (ICharacter player){
		this.player=player;
	}
	@Override
	public void createCharacter(){
		this.player.createCharacter();
		
	}

}
