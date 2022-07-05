class Newspaper{

	public Newspaper(){
	
	}

	private String name;
	private String langauge;
	private double price;
	private int noOfPages;
	

	public String getName(){
	return name;
	}
	
	public void setName(String name){
	this.name = name;
	
	}
	public String getLanguage(){
	return langauge;
	}
	public void setLangauge(String langauge){
	this.langauge =langauge;
	}
	public double getPrice(){
	return price;
	
	}
	public void setPrice(double price){
	this.price =price;
	}
	public int getNoOfPages(){
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages){
		this.noOfPages = noOfPages;
	}
	public void toGetKnowledge()
	{
		System.out.println("To Get Information");
	}
	
}