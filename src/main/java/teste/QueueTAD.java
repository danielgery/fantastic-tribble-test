package teste;

public interface QueueTAD extends Comparable<Integer> {
	public void enqueue(Integer d);
	public Integer dequeue();
	public Integer first();
	public boolean isEmpty();
	public int size();
}
