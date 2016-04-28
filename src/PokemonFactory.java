import java.util.List;
import java.util.LinkedList;
public class PokemonFactory {
	 LinkedList<Pokemon> PokemonList=new LinkedList<Pokemon>();
	public PokemonFactory(String filelocation){
		PokemonFileLoader LDPokemon =new PokemonFileLoader();
		PokemonList=(LDPokemon.load(filelocation));
        
        System.out.println("Loaded "+PokemonList.size()+" Pokemons:");
        int i=1;
        for(Pokemon p:PokemonList){
        	
        	 System.out.println(i+". "+p.name+"("+p.type+")");
        	 System.out.println("HP "+p.getHp());
        	 System.out.println("Attack "+p.getAttack());
        	 System.out.println("Defense "+p.getDefense());
        	 System.out.println("Speed "+p.getSpeed());
        	 i++;
        }
       
	}
	

	
	
}
