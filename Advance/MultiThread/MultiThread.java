public class MultiThread
{
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++)
		{
		    Thread1 t1 = new Thread1();
		    t1.start();                                  // start will execute the run method in thread1
		    Thread t2 = new Thread(new Thread2());
		    t2.start();
		}
	}
}


/* o/p

Thread1 is running
Thread2 is running
Thread2 is running
Thread2 is running
Thread1 is running
Thread1 is running
Thread1 is running
Thread1 is running
Thread2 is running
Thread2 is running
Thread2 is running
Thread1 is running
Thread1 is running
Thread2 is running
Thread1 is running
Thread1 is running
Thread2 is running
Thread2 is running
Thread2 is running
Thread1 is running


Note: Eveytime the o/p will change 
whenever thread finds ideal CPU it is going to occupied the CPU and going tu run its executes and then another thread will gonna come

*/
