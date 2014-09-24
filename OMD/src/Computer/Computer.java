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
	private Counter i;
	private Address counter;
	private Program program;
	
	public Computer(Memory m) {
		this.m = m;
		i = new Counter();
		counter = new Address(m.size());
	}
	public void load(Program program){
		this.program = program;
		
	}
	
	public void run(){
		
/*		i = i.get();
		while ( > 0){
			list.get(k).execute(m);*/
		}
	} 

