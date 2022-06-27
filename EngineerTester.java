class EngineerTester{

 public static void main(String[] args){
   Engineer eng = new Engineer();
     eng.collegeName="BLDE Engineering college";
	 eng.duration="4 years";
     eng.address="Vijayapur";
    
	 
   eng.problemSolving();
   System.out.println(eng.collegeName + " "+ eng.duration +" "+ eng.address);

   MechEng mech = new MechEng();
   mech.solvingMechanicalProblems();
   
   ElectEng elect =  new ElectEng();
   elect.solvingElectricalProblems();
   
   ChemicalEng chemi = new ChemicalEng();
   chemi.solvingChemicalProblems();
   
   CsEng cs = new CsEng();
   cs.SolvingComputerScienceProblems();
   
   EEEng eee = new EEEng();
   eee.SolvingElectricalProblems();
   }
}