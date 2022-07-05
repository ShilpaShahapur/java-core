class WeaponTester{
	public static void main(String a[]){
		
		Weapon wp = new Weapon();
		wp.setName("Armaments");
		wp.setType("Pistol");
		wp.setRange(30);
		wp.setLocation("Japan");
		
		
		System.out.println(wp.getName()+"  "+wp.getType()+"  "+wp.getRange()+"  "+wp.getLocation());
		wp.toShot();
	}
	
	
}