/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class Halt implements Command {

	public Halt() {
		// TODO Auto-generated constructor stub
	}
	public void execute(Memory m, Counter c){
		c.jump(-1);
	}
	
	public String toString() {
		return "HLT ";
	}


}
