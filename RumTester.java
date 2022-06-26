class RumTester{

	public static void main(String a[]){
	OldMonk old = new OldMonk();
	
	old.price=440;
	old.alcoholContent="42.7%";
	old.quantity="750ml";
	old.mfgDate= "3 May 2022";
	old.expiry="Best before 2 years";
	old.toGetKick();
	System.out.println(old.price +" "+ old.alcoholContent +" " + old.quantity +" "+ old.mfgDate +" "+ old.expiry);
	}

}