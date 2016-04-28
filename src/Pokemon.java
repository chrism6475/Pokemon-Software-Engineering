import java.util.LinkedList;
import java.util.List;
public class Pokemon {
    final public String name;
    final public String type;
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(String n, String t) {
        this.name = n;
        this.type = t;
    }

    public Pokemon(String n, String t, int hp, int attack, int defense, int speed) {
        this.name = n;
        this.type = t;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public Pokemon(PokemonBuilder pokemonBuilder) {
    	this.name = pokemonBuilder.name;
        this.type = pokemonBuilder.type;
        this.hp = pokemonBuilder.getHp();
        this.attack = pokemonBuilder.getAttack();
        this.defense = pokemonBuilder.getDefense();
        this.speed = pokemonBuilder.getSpeed();
	}

	public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
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
