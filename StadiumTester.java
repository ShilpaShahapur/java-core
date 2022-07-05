class StadiumTester{

  public static void main(String a[]){
  
    Stadium stad = new Stadium();
	stad.setId(1);
	stad.setName("Ambedkar");
	stad.setLocation("Vijayapur");
	stad.setContactNo(9900990099L);
	
    System.out.println(stad.getId()+ "  " +stad.getName()+ "   " +stad.getLocation()+ "  " +stad.getContactNo());
	stad.sportsCenter();
  
  }

}