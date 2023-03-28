import java.io.*;
import java.util.*;

public class anidip extends Thread {
	// initiated run method for Thread
	public void run()
	{
		System.out.println("Thread Started Running...");
	}
	public static void main(String[] args)
	{
		anidip g1 = new anidip();

		// Invoking Thread using start() method
		g1.start();
	}
}
