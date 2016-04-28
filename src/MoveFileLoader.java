import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class MoveFileLoader implements MoveLoader {
	 LinkedList<Move> MoveList=new LinkedList<Move>();
		public  void save(LinkedList<Move> list, String location) {
			
			try(PrintWriter out=new PrintWriter(location)){
				for(Move p : list){
				out.println(p.name +","+ p.type+","+p.getCategory()+","+p.getPower()+","+p.getAccuracy()+","+p.getPp());}
			} catch (FileNotFoundException e) {
				 System.err.println("Writing to a file failed. Cause: " + e.getMessage());
		         System.exit(-1); //If something goes wrong, let's terminate the program.
			}
			
		}

		@Override
		public Move load(String location) {
			Path path = Paths.get(location);
	        try {
	            // Read from the Path and print all the lines.
	            List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
	            for (String line : lines) {
	             String []attributes=line.split(",");
	             MoveBuilder builder=new MoveBuilder(attributes[0]);
	             builder.name=attributes[0];
	             builder.type(attributes[1]);
	             builder.category(attributes[2]);
	             builder.power(Integer.parseInt(attributes[3]));
	             builder.accuracy(Integer.parseInt(attributes[4]));
	             builder.pp(Integer.parseInt(attributes[5]));
	             Move p=builder.build();
	     
	             MoveList.add(p);
	            
	               
	               
	            }
	        } catch (IOException e) {
	            System.err.println("Reading from a file failed. Cause: " + e.getMessage());
	            System.exit(-1); //If something goes wrong, let's terminate the program.
	        }
			return null;
		}
		
}
