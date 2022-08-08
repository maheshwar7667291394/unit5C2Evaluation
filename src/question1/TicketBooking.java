package question1;

public class TicketBooking extends Thread{
	 TicketCounter ticketCounter ;
	 String passengerName;
	int noOfSeatsToBook;
	
	
	
	
	
	public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
		super();
		this.ticketCounter = ticketCounter;
		this.passengerName = passengerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}





	@Override
	public void run() {
		try {
			ticketCounter.bookSeat(passengerName, noOfSeatsToBook);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	

}
