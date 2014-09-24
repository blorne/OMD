/**
 * 
 */
package Computer;

/**
 * @author martin
 *
 */
public class Counter {
private int value;
	/**
	 * 
	 */
	public Counter() {
		value = 0;
	}
	public void increase(){
		value++;
	}
	public void jump(int i){
		value = i;
	}
	public int get() {
		return value;
	}

}
