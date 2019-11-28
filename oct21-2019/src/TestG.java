
public class TestG {

	public static void main(String[] args) {
		
		System.out.println("********ThirdGen*************");
		ThirdGen t1 = new ThirdGen();
		   t1.call();
		   t1.camera();
		   t1.msg();
		   t1.games();
		System.out.println("*********FirstGen*************");
		 FirstGen f1 = new FirstGen();
		   f1.call();
		   f1.msg();
		 System.out.println("*********SecondGen**************");  
		 SecondGen s1 = new SecondGen();
		   s1.call();
		   s1.msg();
		   s1.games();
	}
}
