package teste;

import java.util.ArrayList;
import java.util.List;

public class Queue implements QueueTAD{

	private ArrayList<Integer> lista = new ArrayList<Integer>();
			
		
	@Override
	public void enqueue(Integer d) { //coloca
		lista.add(d);
		
	}

	@Override
	public Integer dequeue() {//tira
		
		return lista.remove(index);
	}

	@Override
	public Comparable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void enqueue(Comparable d) {
		// TODO Auto-generated method stub
		
	}

}
