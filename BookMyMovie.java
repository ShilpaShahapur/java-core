class BookMyMovie
{
	String theatreName;
	String movies[];
	int noOfTickets; //defalut
	static int ticketPrice = 600;
	int totalNoOfTickets;
	int totalTicketPrice;
	String snacks[];
	int totalSnacks =1000;
	static int snackPrice = 40;
	int snackQuantity;
	
	public BookMyMovie(String theatreName, int totalNoOfTickets ,String movies[]){
	this.theatreName = theatreName;
	this.totalNoOfTickets = totalNoOfTickets;
	this.movies = movies;
	System.out.println("BookMyMovie Object is created");
	
	}
	
	
	public int showTime(int noOfTickets, String bookedBy ,String movieName)
	{
		int totalTicketPrice = 0;
	System.out.println("Inside showTime().....");
	System.out.println("Arg 1 : No Of Tickets "+ noOfTickets);
	System.out.println("Arg 2 : Booked By "+ bookedBy);
	System.out.println("Arg 3 : Movie Name "+ movieName);

	
	for(int index = 0 ; index < movies.length ; index++){
	if (movieName == movies[index]){
	System.out.println("Movie name matched");
	
	if(noOfTickets < totalNoOfTickets){
	totalTicketPrice = noOfTickets*ticketPrice;
	totalNoOfTickets = totalNoOfTickets - noOfTickets;
	System.out.println("For The Movie : "+movieName +  "No Of Tickets are That are remaining : "+ totalNoOfTickets + "Total Price is "+ totalTicketPrice);
	}
	else{
	System.out.println("Isht Ticket illa...");
	}
	
	}
	else
	{
	System.out.println("The Movie Not available");
	}
}
	return totalTicketPrice;
}
	public int buySnacks(String snackName , int snackQuantity){
	int totalSnackPrice =0;
	//logic for getting snacksPrice
	System.out.println("Arg 1 : Snack Name  "+ snackName);
	System.out.println("Arg 2 : Snack Quantity  "+ snackQuantity);
	
	for(int i=0;i<snacks.length;i++)
	{
		if(snacks[i] == snackName){
			System.out.println("The snack is available");
			
		if (snackQuantity<totalSnacks)
		{
			totalSnackPrice=snackQuantity*snackPrice;
			totalSnacks=totalSnacks-snackQuantity;
			
			System.out.println("For "+ snackName + " No Of Snacks are remaining are : "+  totalSnacks + " Total price Of Snack is : " + totalSnackPrice);
		}
		else{
			System.out.println("Snack kali agide...");
		}
		}
		else{
			System.out.println("The Snack is not available");
		}
			
	}
	return totalSnackPrice;
	}

}

