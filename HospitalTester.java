class HospitalTester{
   
   public static void main(String[] args){
   
     Hospital4 hos = new Hospital4();
	 
	 PatientDTO dto = new PatientDTO();
	 dto.setGender(Gender.MALE);
	 dto.setId(1);
	 dto.setName("Saran");
	 dto.setAddress("Bangalore");
	 dto.setContactNo(8899775544L);
	 dto.setAge(46);
	 
	 PatientDTO dto1 = new PatientDTO();
	 dto1.setGender(Gender.MALE);
	 dto1.setId(2);
	 dto1.setName("Karan");
	 dto1.setAddress("Gadag");
	 dto1.setContactNo(9988677999L);
	 dto1.setAge(60);
	 
	 PatientDTO dto2 = new PatientDTO();
	 dto2.setId(3);
	 dto2.setName("Varun");
	 dto2.setAddress("Rajajinagar");
	 dto2.setGender(Gender.female);
	 dto2.setContactNo(7788996655L);
	 dto2.setAge(35);
	 
	 PatientDTO dto3 = new PatientDTO();
	 dto3.setId(4);
	 dto3.setName("Priya");
	 dto3.setAddress("Mysure");
	 dto3.setGender(Gender.female);
	 dto3.setContactNo(6644557788L);
	 dto3.setAge(22);

     PatientDTO dto4 = new PatientDTO();
     dto4.setId(5)	 ;
	 dto4.setName("Kartik");
	 dto4.setAddress("Bellary");
	 dto4.setGender(Gender.MALE);
	 dto4.setContactNo(9988556677L);
	 dto4.setAge(19);
	 
	 PatientDTO dto5 = new PatientDTO();
	 dto5.setGender(Gender.female);
	 dto5.setId(6);
	 dto5.setName("Siri");
	 dto5.setAddress("Vijayapur");
	 dto5.setContactNo(5656342312L);
	 dto5.setAge(68);
	 
	 hos.createPatient(dto);
	 hos.createPatient(dto1);
	 hos.createPatient(dto2);
	 hos.createPatient(dto3);
	 hos.createPatient(dto4);
	 hos.createPatient(dto5);
	 
	 hos.getPatientDetails();
   }
}