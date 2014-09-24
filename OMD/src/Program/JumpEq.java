/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class JumpEq implements Command {
	private Address a;
	private int hop;
	private Word w; 
	public JumpEq(int hop, Address a, Word w) {
		this.hop = hop;
		this.a = a;
		this.w = w;
	}
	public void execute(Memory m, Counter c){
		if(a.equals(w, m))
			c.jump(hop);
		else
			c.increase();
	}
	
	public String toString() {
		return "JEQ " + hop + " " + a.toString() + w.toString();
	}


}
