package FirstEx;

public class XYZ extends Thread {
	
	public void run() {
		System.out.println("Welcome to Java Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ xyz = new XYZ();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		xyz.start();
		
		

	}

}
