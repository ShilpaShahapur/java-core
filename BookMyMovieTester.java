class BookMyMovieTester{

public static void main(String a[])
{
	
	String movies[] = {"Om" , "Gaalipata", "A"  , "Upendra", "H2O" , "Rakta Kanneeru", "Suryavamshi", "Yajamana"};
	String snacks[] = {"Lays", "PopCorn", "French Fires", "Chocolate", "Pepsi", "Veg Role"};
	BookMyMovie bookMyShow = new BookMyMovie("Navarang", 200,movies);
	bookMyShow.showTime(20,"Devi","Om");
	bookMyShow.buySnacks("PopCorn",10);
}


}