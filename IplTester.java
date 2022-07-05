class IplTester{

    public static void main(String a[]){
	
	 Ipl ip = new Ipl();
	 ip.setNoOfPlayers(30);
	 ip.setNoOfMatches(25);
	 ip.setLocation("Banglore");
	 
	 System.out.println(ip.getNoOfPlayers()+ " " +ip.getNoOfMatches()+ " " +ip.getLocation());
	 ip.toWinCup();
	
	}

}