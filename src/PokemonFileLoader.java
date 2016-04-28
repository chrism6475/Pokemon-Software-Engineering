import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
public class PokemonFileLoader implements PokemonLoader {
	 LinkedList<Pokemon> PokemonList=new LinkedList<Pokemon>();
	public  void save(LinkedList<Pokemon> list, String location) {
		
		try(PrintWriter out=new PrintWriter(location)){
			for(Pokemon p : list){
			out.println(p.name +","+ p.type+","+p.getHp()+","+p.getAttack()+","+p.getDefense()+","+p.getSpeed());}
		} catch (FileNotFoundException e) {
			 System.err.println("Writing to a file failed. Cause: " + e.getMessage());
	         System.exit(-1); //If something goes wrong, let's terminate the program.
		}
		
	}

	@Override
	public LinkedList<Pokemon> load(String location) {
		Path path = Paths.get(location);
        try {
            // Read from the Path and print all the lines.
            List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
            for (String line : lines) {
             String []attributes=line.split(",");
             PokemonBuilder builder=new PokemonBuilder(attributes[0]);
             builder.name=attributes[0];
             builder.type(attributes[1]);
             builder.hp(Integer.parseInt(attributes[2]));
             builder.attack(Integer.parseInt(attributes[3]));
             builder.defense(Integer.parseInt(attributes[4]));
             builder.speed(Integer.parseInt(attributes[5]));
             Pokemon p=builder.build();
     
             PokemonList.add(p);
            
               
               
            }
        } catch (IOException e) {
            System.err.println("Reading from a file failed. Cause: " + e.getMessage());
            System.exit(-1); //If something goes wrong, let's terminate the program.
        }
		return PokemonList;
	}
	
}
