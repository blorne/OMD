/**
 * 
 */
package Computer;
import java.util.*;

/**
 * @author martin
 *
 */
public class LongMemory implements Memory {
	private int size;
	protected ArrayList<Word> list;

	public LongMemory(int size) {
			this.size = size;
			list = new ArrayList<Word>(size);
			for(int k=0; k<size;k++){
				list.add(k, new LongWord(0));
			}
	}
	
	public Word get(int a){
		return list.get(a);
	}
	
	public int size(){
		return size;
	}


}
