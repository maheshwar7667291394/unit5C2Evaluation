package question1;

public class Main {
	public static void main(String[] args) {
		TicketCounter tc=new TicketCounter();
		TicketBooking tb1=new TicketBooking(tc,"maheshwar", 2);
		
		TicketBooking tb2=new TicketBooking(tc,"shambhu", 1);
		
	   TicketBooking tb3=new TicketBooking(tc,"Ramukaka",3);
		tb1.start();
		tb2.start();
		tb3.start();
	}

}
