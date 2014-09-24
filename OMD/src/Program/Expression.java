package Program;

import Computer.*;

public abstract class Expression implements Command {
	protected Address ad;
	protected Operand a;
	protected Operand b;
	/**
	 * 
	 */
	public Expression(Operand a, Operand b, Address ad) {
		this.a = a;
		this.b = b;
		this.ad = ad;
		
	}
	public void execute(Memory m, Counter c){
		op(a, b, m);
		c.increase();
	}
	
public abstract void op(Operand a, Operand b, Memory m);

}
