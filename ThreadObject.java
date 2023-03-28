import java.io.*;
import java.util.*;

public class ThrdObject implements Runnable {
	public void run()
	{
		System.out.println(
			"Thread is created and running successfully...");
	}
	public static void main(String[] args)
	{
		Runnable r1 = new ThrdObject();
		Thread t1 = new Thread(r1, "My Thread");
		t1.start();
		String str = t1.getName();
		System.out.println(str);
	}
}
