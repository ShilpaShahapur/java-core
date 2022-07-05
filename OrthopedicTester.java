class OrthopedicTester{
	public static void main(String a[]){
		
		Orthopedics ortho = new Orthopedics();
		ortho.setName("Dr.Nitin Bhandari");
		ortho.setSector("Orthopedic Surgeon");
		ortho.setEducationRequired("M.B.B.S");
		
		
		System.out.println(ortho.getName()+" "+ortho.getSector()+" "+ortho.getEducationReq());
		ortho.doctor();
	}
	
	
}