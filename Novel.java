public class Novel{
	
	public Novel(){
	}
	
	private String novelName;
	private String language;
	private String  author;
	private double price;
	private int noOfPages;
	
	
	//getter and setter
	public String getName(){
		return novelName ;
	}
	public void setNovelName(String novelName){
		this.novelName = novelName;
	}
	public String getLanguage(){
		return language ;
	}
	public void setLanguage(String language){
		this.language = language;
	}
	public String getAuthor(){
		return author ;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public void toRead()
	{
		System.out.println("To get motivated");
	}
 
}