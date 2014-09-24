package Computer;


public interface Word extends Operand{
	
	public Number value();
	public Word getWord(Memory m);
	public void add(Operand a, Operand b, Memory m);
	public void mul(Operand a, Operand b, Memory m);
	public void copy(Operand a, Memory m);
	public boolean equals(Operand a, Memory m);

}
