class NewspaperTester{

   public static void main(String a[]){

   Newspaper news = new Newspaper();
   news.setName("Vijayavani");
   news.setLangauge("Kannada");
   news.setPrice(3);
   news.setNoOfPages(8);
   
   
   System.out.println(news.getName()+ "  " +news.getLanguage()+ "  " +news.getPrice()+ "  " +news.getNoOfPages());
   news.toGetKnowledge();
   }
}