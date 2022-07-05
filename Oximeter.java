class Oximeter{


	public Oximeter(){
	}
	private String name;
	private String type;
	private int developedIn;
	private double price;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name=name;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public int getDevelopedIn(){
		 return developedIn;
	 }
	 public void setDevelopedIn(int developedIn){
		 this.developedIn=developedIn;
	 }
	 
	 public double getPrice(){
		 return price;
	 }
	 public void setPrice(double price){
		 this.price=price;
	 }
	 
	 
  public void toCheckPluse(){
	  System.out.println("To Check The Patient Pluse");
  }
	
}