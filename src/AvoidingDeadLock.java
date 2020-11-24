
public class AvoidingDeadLock {
	public static void main(String[] args) {
		String resource1 = "sandeep";
		String resource2 = "world";
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("t1 acquired resource1");
					synchronized(resource2) {
						System.out.println("t1 acquired resource2");
					}
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("t2 acquired resource1");
					synchronized(resource2) {
						System.out.println("t2 acquired resource2");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
