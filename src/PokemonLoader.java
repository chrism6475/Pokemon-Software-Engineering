import java.util.LinkedList;
import java.util.List;

public interface PokemonLoader {
	public void save(LinkedList<Pokemon> list, String location);
    public LinkedList<Pokemon> load(String location);

}
