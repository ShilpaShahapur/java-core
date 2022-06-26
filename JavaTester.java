class JavaTester{
 
	public static void main(String a[]){
	Java java = new Java();
	
	java.founder="James Gosling";
	java.type="Platform dependent";
	java.ownedBy="Oracle";
	java.toDevelopApplication();
	
	System.out.println(java.founder +" " +java.type + " " + java.ownedBy);
 
}


}