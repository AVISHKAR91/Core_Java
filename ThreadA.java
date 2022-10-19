package Thread;

import java.util.Iterator;

public class ThreadA extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Starting" + getName());
		for(int i=1; i<=10; i++)
		{
			System.out.println(getName() + ":" + i);
		}
		
		System.out.println("Stopping" + getName());
		
	}

}
