package thread;

class TotalEarning extends Thread{
	int total=0;

	public void run() {

		synchronized (this) {
			for (int i = 1; i <=10; i++) {
				total=total+100;
				
			}
			this.notify();
		}
	}

}


public class InterThreadCommunication154 {
	public static void main(String[] args) throws InterruptedException {
		TotalEarning t1=new TotalEarning();
		t1.start();
		//System.out.println("Total = "+t1.total);
		
		synchronized (t1) {
			t1.wait();
			System.out.println("Total = "+t1.total);

			
		}
	}
}
