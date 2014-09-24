/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class Copy implements Command {
private Operand w;
private Address a;

	public Copy(Operand w, Address a) {
		this.w=w;
		this.a=a;
	}
	
	public void execute(Memory m, Counter c){
		a.getWord(m).copy(w,m);
		c.increase();
	}


}
