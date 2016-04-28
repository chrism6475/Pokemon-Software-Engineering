
public class PokemonBuilder {
	 public String name="DEFAULT";
		public String type="default";
	    private int hp;
	    private int attack;
	    private int defense;
	    private int speed;
	    
	    public PokemonBuilder(String name){
	    	this.name=name;
	    }
	    public PokemonBuilder type(String type){
	    	this.type=type;
	    	return this;
	    }
	    public PokemonBuilder hp(int hp){
	    	this.setHp(hp);
	    	return this;
	    }
	    public PokemonBuilder attack(int attack){
	    	this.setAttack(attack);
	    	return this;
	    }
	    public PokemonBuilder defense(int defense){
	    	this.setDefense(defense);
	    	return this;
	    }
	    public PokemonBuilder speed(int speed){
	    	this.setSpeed(speed);
	    	return this;
	    }
	    public Pokemon build(){
	    	return new Pokemon(this);
	    }
		public int getAttack() {
			return attack;
		}
		public void setAttack(int attack) {
			this.attack = attack;
		}
		public int getHp() {
			return hp;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}
		public int getDefense() {
			return defense;
		}
		public void setDefense(int defense) {
			this.defense = defense;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}

}
