package StackPackage;

public class TheStackClass {
	private int top = 0;
	private int stackAsArray[];
	
	public int getSize() {
		return top;
	}
	public int getArraySize() {
		return stackAsArray.length;
	}

	public static TheStackClass create() {
		TheStackClass th1 = new TheStackClass();
		return th1;
	}

	public static TheStackClass create(int size) {
		TheStackClass th1 = new TheStackClass(size);
		return th1;
	}

	public TheStackClass(int size)
	{
		if(size>0)
		{
		stackAsArray=new int[size];
		}
		
		else
		{
			System.out.println("Invalid stack size passed, the default stack size is considered");
			stackAsArray=new int[100];
			
		}
	}
	
   public TheStackClass()
	{
		stackAsArray=new int[100];
	}

	public void push(int data) {
		if(top <stackAsArray.length)
		{
		stackAsArray[top] = data;
		top++;
		}
		else
		{
			System.out.println("Sorry!, you are trying to exceed the size of the array");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("YOU MUST FIRST INSERT ELEMENTS IN THE STACK TO PERFORM POP OPERATION");
			return 0;
		} 
		top--;
		int itempopped = stackAsArray[top];
		return itempopped;
	}

	public boolean isEmpty() {
		return top == 0;
	}
}
