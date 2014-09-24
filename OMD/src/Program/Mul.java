/**
 * 
 */
package Program;

import Computer.*;

/**
 * @author martin
 *
 */
public class Mul extends Expression {

	
	public Mul(Operand a, Operand b, Address ad) {
		super(a, b, ad);
		
	}
	public void execute(Memory m, Counter c){
		op(a, b, m);
		c.increase();
	}
	
	public void op(Operand a, Operand b, Memory m){
		ad.getWord(m).mul(a, b, m);
	}

}
