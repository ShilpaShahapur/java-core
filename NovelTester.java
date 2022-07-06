class NovelTester{

	public static void main(String a[]){
	
	Novel nov = new Novel();
	nov.setNovelName("Believe in Yourself");
	nov.setLanguage("English");
	nov.setAuthor("Dr Joseph Murphy");
	nov.setPrice(70);
	
	System.out.println(nov.getName()+ " " + nov.getLanguage()+ " " + nov.getAuthor()+ " " + nov.getPrice());
	nov.toRead();
	
	}

}

