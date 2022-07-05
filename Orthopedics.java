class Orthopedics{


	public Orthopedics(){
	}
	private String name;
	private String sector;
	private String employmentField;
	private String educationRequired;

     public String getName(){
	  return name;
     }
     public void setName(String name){ 
	   this.name=name;
	 }
	 
	 public String getSector(){
		 return sector;
	 }
	 public void setSector(String sector){
		 this.sector=sector;
	 }
	 
	 public String getEducationRequired(){
		 return educationRequired;
	 }
	 public void setEducationReq(String educationRequired){
		 this.educationRequired=educationRequired;
	 }
	 
	 
  public void doctor(){
	  System.out.println("Condition involving musculoskeletal system ");
  }
	
}