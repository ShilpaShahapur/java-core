class BigBasket{


	public BigBasket(){
	}
	private String ownedBy;
    private String type;
	private String location;

     public String getOwnedBy(){
	  return ownedBy;
     }
     public void setOwnedBy(String ownedBy){ 
	   this.ownedBy=ownedBy;
	 }
	 
	 public String getType(){
		 return type;
	 }
	 public void setType(String type){
		 this.type=type;
	 }
	 
	 public String getLocation(){
		 return location;
	 }
	 public void setLocation(String location){
		 this.location=location;
	 }
	 
	 
  public void toBuy(){
	  System.out.println("To buy Things");
  }
	
}