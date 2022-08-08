package question1;

public class TicketCounter {
	int availableSeats = 3;
	void bookSeat(String name, int numberOfSeats) throws Exception {
		if(numberOfSeats<=availableSeats) {
			this.availableSeats=availableSeats-numberOfSeats;
			System.out.println("numberOfSeats boked is :"+numberOfSeats);
		}
		else {
			NoSeatAvailableException ex=new NoSeatAvailableException("NoSeatAvailableException");
			throw ex;
		}
		
	}

}
