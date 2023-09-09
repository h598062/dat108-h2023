package no.hvl.dat108.f06c;

public class TraadSomKanStoppes extends Thread {
	
	boolean fortsette = true;
	
	public TraadSomKanStoppes(String navn) {
		super(navn);
	}
	
	public void stopp() {
		fortsette = false;
	}
	
	@Override
	public void run() {
		while(fortsette) {
			System.out.println("Hei");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(getName() + " avsluttes");
	}
}




