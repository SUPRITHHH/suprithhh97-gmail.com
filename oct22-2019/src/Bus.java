
public class Bus {
    
	int seats;
	String color;
	
	Bus(int seats,String Color){
		this.seats=seats;
		this.color=color;
	}
	
	Bus(){
		this(40);
	}
	
	Bus(int seats){
		this(seats,"red");
	}
	
	void getDetails() {
		System.out.println("Welcome to red bus ,seat capacity is "+seats);
	}
}
