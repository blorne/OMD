/**
 * 
 */
package Computer;
import Program.*;

import java.util.*;
/**
 * @author martin
 *
 */
public class Computer {
	private Memory m;
	private Counter pc;
	private Program program;
	
	public Computer(Memory m) {
		this.m = m;
		pc = new Counter();
	}
	public void load(Program program){
		this.program = program;
	}
	
	public void run(){
		while (pc.get() >= 0){
			program.get(pc.get()).execute(m,pc);
		}
	} 
}
