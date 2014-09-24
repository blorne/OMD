/**
 * 
 */
package Computer;

/**
 * @author martin
 *
 */
public class LongWord implements Word {
private long value;
	/**
	 * 
	 */
	public LongWord(long value) {
		this.value=value;
	}
	public Number value(){ 
		return value;
	}
	public LongWord getWord(Memory m){
		return this;
	}
	public void add(Operand a, Operand b, Memory m){
		value = a.getWord(m).value().longValue() + b.getWord(m).value().longValue();
		
	}
	public void mul(Operand a, Operand b, Memory m){
		value = a.getWord(m).value().longValue() * b.getWord(m).value().longValue();
		
	}
	
	public void copy(Operand a, Memory m){
		value = a.getWord(m).value().longValue();
		
	}
	
	public boolean equals(Operand a, Memory m){
			return a.getWord(m).value().longValue() == value;
	}
}
