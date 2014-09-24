package Program;
import java.util.*;



public abstract class Program extends ArrayList<Command> {
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < this.size(); i++)
			str.append(i + " " + this.get(i) + "\n");
		return str.toString();
	}
}
