
public class Hello {
	int b;

	void show() {
	
		int a;
		System.out.println("b");
		
	}
	
	void display() {
		System.out.println("i am in display");
		Hello h = new Hello();
		h.show();
		System.out.println("i am Nikhil");	
	}
	
	public static void main(String[] args) {
		System.out.println("i am in main");
		Hello h = new Hello();
		h.display();
		System.out.println("Thanks for visit");
	}
}
