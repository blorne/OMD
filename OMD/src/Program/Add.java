/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class Add extends Expression{

	public Add(Operand a, Operand b, Address ad) {
		super(a, b, ad);
		
	}
	public void execute(Memory m, Counter c){
		op(a, b, m);
		c.increase();
	}
	
	public void op(Operand a, Operand b, Memory m){
		ad.getWord(m).add(a, b, m);
	}
	
	public String toString() {
		return "ADD " + a.toString() + b.toString() + ad.toString();
	}


}
