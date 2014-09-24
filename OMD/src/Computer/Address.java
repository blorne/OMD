/**
 * 
 */
package Computer;


/**
 * @author martin
 *
 */
public class Address implements Operand{
	private int index;
	/**
	 * 
	 */
	public Address(int index) {
		this.index = index;
	}

	
	public Word getWord(Memory m){
		return m.get(index);
	}
	
	public String toString() {
		return "[" + index + "] ";
	}
	
	public boolean equals(Operand a, Memory m){
		return a.getWord(m).equals(m.get(index));
	}


}
