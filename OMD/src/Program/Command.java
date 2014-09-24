package Program;
import Computer.*;
public interface Command {
	
	public void execute(Memory m, Counter c);

	public String toString();
}
