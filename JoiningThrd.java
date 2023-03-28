import java.io.*;
class JoiningThrd extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 2; i++)
		{
			try
			{
				Thread.sleep(500);
				System.out.println("Current Thread: "+ Thread.currentThread().getName());						
			}

			catch(Exception ex)
			{
				System.out.println("Exception has" +
								" been caught" + ex);
			}
			System.out.println(i);
		}
	}
}

class JoiningThrd
{
	public static void main (String[] args)
	{
		JoiningThrd t1 = new JoiningThrd();
		JoiningThrd t2 = new JoiningThrd();
		JoiningThrd t3 = new JoiningThrd();

		t1.start();

		try
		{
			System.out.println("Current Thread: "+ Thread.currentThread().getName());	
			t1.join();
		}

		catch(Exception ex)
		{
			System.out.println("Exception has " + "been caught" + ex);						
		}

		t2.start();

		try
		{
			System.out.println("Current Thread: "+ Thread.currentThread().getName());	
			t2.join();
		}

		catch(Exception ex)
		{
			System.out.println("Exception has been" + " caught" + ex);							
		}

		t3.start();
	}
}
