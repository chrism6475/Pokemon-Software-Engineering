import java.util.LinkedList;
import java.util.List;
public interface MoveLoader {
	public void save(LinkedList<Move> list, String location);

    public Move load(String location);
}
