package Program;
import java.util.*;



public abstract class Program extends ArrayList<Command> {
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < size(); i++)
			str.append(i + " " + get(i) + "\n");
		return str.toString();
	}
}
