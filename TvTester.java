class TvTester{
	public static void main(String a[]){
		
		TvChannel tv = new TvChannel();
		tv.setChannelName("Colors");
		tv.setType("Entertainment");
		tv.setStartedIn(2006);
		tv.setLanguage("Hindi");
		
		
		System.out.println(tv.getChannelName()+"  "+tv.getType()+" "+tv.getStartedIn()+" "+tv.getLanguage());
		tv.toWatch();
	}
	
	
}