package Thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA Ta = new ThreadA();
		ThreadA Tb = new ThreadA();
		Ta.setName("Avishkar");
		Ta.start();
		Tb.setName("Gaikwad");
		Tb.start();

	}

}
