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
	
	public void op(Operand a, Operand b, Memory m){
		ad.getWord(m).mul(a, b, m);
	}
	
	public String toString() {
		return "MUL " + a.toString() + b.toString() + ad.toString();
	}

}
