package Chapter17.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	public String deQueue(){
		int len=arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		return (arrayQueue.remove(len));
	}
}
public class QueueTest1 {
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
	}
	
}
