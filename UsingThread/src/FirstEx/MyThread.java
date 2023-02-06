package FirstEx;

public class MyThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ankit");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	
	MyThread t = new MyThread();
	
	Thread thread = new Thread(t);
	
	thread.start();
	
}
}
