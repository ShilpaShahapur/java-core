class Institute{

  int id;
  static String location;
  long contactNo;
  String type;
 
  public Institute(int id,String type,long contactNo){
  System.out.println("Institute object is created");
  this.id=id;
  this.type=type;
  this.contactNo=contactNo;
  }
  
  public static void main(String[] args){
	  
	  Institute instit = new Institute(1,"Engineering",98864767799L);
	  System.out.println("The institute id is " +instit.id);
	  System.out.println("The institute type is "+instit.type);
	  System.out.println("The ContectNo of the Institute is  " +instit.contactNo);
	  
	  Institute instit1 = new Institute(2,"Medical",9899663889L);
	  System.out.println("institute id is " +instit1.id);
	  System.out.println("type of the institute is "+instit1.type);
	  System.out.println("contact no of institute is " +instit1.contactNo);
	  
	  
  }
}  
  