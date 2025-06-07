package lambda;

public class lamda {
	
	public static void main(String[] args) {
	        // Lambda expression for Runnable
	        Runnable task = () -> {
	            for (int i = 1; i <= 5; i++) {
	                System.out.println("Count: " + i);
	                try {
	                    Thread.sleep(500); // Pause for 0.5 seconds
	                } catch (InterruptedException e) {
	                    System.out.println("Task interrupted.");
	                }
	            }
	        };

	        // Start the task in a new thread
	        Thread thread = new Thread(task);
	        thread.start();

	    }
}



