/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class Jump implements Command {
	private int jump; 

	public Jump(int jump) {
		this.jump = jump;
	}
	public void execute(Memory m, Counter c){
		c.jump(jump);
	}
	
	public String toString() {
		return "JMP " + jump;
	}


}
