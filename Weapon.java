class Weapon{


	public Weapon(){
	}
  private String name;
  private String type;
  private double range;
  private String location;

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
	 
	 public double getRange(){
		 return range;
	 }
	 public void setRange(double range){
		 this.range=range;
	 }
	 
	 public String getLocation(){
		 return location;
	 }
	 public void setLocation(String location){
		 this.location=location;
	 }
	 
	 
  public void toShot(){
	  System.out.println("To kill The cirminal");
  }
	
}