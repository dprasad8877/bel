public class ThreadDemo {
	
	public static void main(String[] args) {
		MyThread t = new MyThread(); // creating thread 1
		MyThread t1 = new MyThread(); // creating thread 1
		
		t.start();  // starting the thread
		t1.start(); // starting the thread
//		t.run();
//		t1.run();
	}

	
}

class MyThread extends Thread {
	
	public void run(){
		for(int i =0;i<10;i++)
		{
			System.out.println(i);
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}