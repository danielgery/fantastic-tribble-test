package teste;

import java.util.ArrayList;
import java.util.List;

public class Queue<T extends Comparable<T>> implements QueueTAD<T> {

    private ArrayList<T> elements = new ArrayList<T>();

    @Override
    public void enqueue(T d) {
        this.elements.add(d);
    }

    @Override
    public T dequeue() {
        T aux = this.elements.get(0);
        this.elements.remove(0);
        return aux;
    }

    @Override
    public T first() {
        return this.elements.get(0);
    }

    @Override
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override
    public int size() {
        return this.elements.size();
    }

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}


}