import javax.swing.JFrame;

public class helloworld extends Thread {
	@Override 
	public void run() {
		
	}
public class Clock extends JFrame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public static void main(String[] args) {
	helloworld obj= new helloworld();
	System.out.println("Hello ");
	int x=3,y=2;
	System.out.println(x);
	System.out.println(y);
	x=x+y; 
	y=x-y;
	x=x-y;
	System.out.println(x);
	System.out.println(y);
	System.out.println(obj.tong(x, y));
}
public  static int tong(int x,int y) {
	return x+y;
	
}
}
