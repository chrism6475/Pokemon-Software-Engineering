import java.util.Scanner;
import java.util.LinkedList;
public class PokemonMaker {
    LinkedList<Pokemon> PokemonList=new LinkedList<Pokemon>();

	public PokemonMaker(){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many pokemon do you have");
		int numofpokemon= scanner.nextInt();
		for(int i=0;i<numofpokemon;i++){
			PokemonBuilder builder=new PokemonBuilder(scanner.nextLine());
			System.out.println("What's the name of the pokemon");
			builder.name=scanner.nextLine();
			System.out.println("What's the Type of the pokemon");
			builder.type(scanner.nextLine());
			System.out.println("What's the HP of the pokemon");
			builder.hp(scanner.nextInt());
			System.out.println("What's the attack of the pokemon");
			builder.attack(scanner.nextInt());
			System.out.println("What's the defense of the pokemon");
			builder.defense(scanner.nextInt());
			System.out.println("What's the speed of the pokemon");
			builder.speed(scanner.nextInt());
			Pokemon toStore=builder.build();
			storePokemon(toStore);	
		}
		PokemonFileLoader loader=new PokemonFileLoader();
		System.out.println("Where do you want to save your pokemon?");
		Scanner newscanner=new Scanner(System.in);
		String response=newscanner.nextLine();
		loader.save(PokemonList, response+".txt");
		
	}
	   public void storePokemon(Pokemon pokemon){
	    	PokemonList.add(pokemon);
	    }
	

}
