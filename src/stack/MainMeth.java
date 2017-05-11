package stack;

public class MainMeth {

	public static void main(String[] args) {
		Stack mystack = new Stack(10);
		mystack.push(150);
		System.out.println("StackTopIs = " + mystack.peek());

		mystack.push(250);
		System.out.println("StackTopIs = " + mystack.peek());
		
		mystack.push(350);
		System.out.println("StackTopIs = " + mystack.peek());
		
		mystack.push(450);
		System.out.println("StackTopIs = " + mystack.peek());
		
		mystack.pop();
		System.out.println("StackTopIs = " + mystack.peek());
		
		mystack.pop();
		System.out.println("StackTopIs = " + mystack.peek());
		
		mystack.pop();
		System.out.println("StackTopIs = " + mystack.peek());
		
		mystack.pop();
		System.out.println("StackTopIs = " + mystack.peek());
	}

}
