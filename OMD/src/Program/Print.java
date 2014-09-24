/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class Print implements Command {
	private Address a;

	public void execute(Memory m, Counter c){
		System.out.println(a.getWord(m).value());
		c.increase();
	}
	public Print(Address a) {
		this.a = a;
	}
	
	public String toString() {
		return "PRT " + a;
	}

}
