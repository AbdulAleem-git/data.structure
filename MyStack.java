package data.structure;

import java.util.EmptyStackException;

public class MyStack<T> {
	private static class StackNode<T>{
		private T data;
		private StackNode<T> next;
		public StackNode(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	private StackNode<T> top;
	
	public T pop() {
		if(top == null)
			throw new EmptyStackException();
		T item = top.data;
		top = top.next;
		return item;
		
	}
	public void push(T data) {
		StackNode <T> st = new StackNode<T>(data);
		st.next = top ;
		top  = st;
	}
	public T peek() {
		if(top == null )
			throw new EmptyStackException();
		return top.data;
		
	}
}
