class GitTester{
 
	public static void main(String a[]){
	Git git = new Git();
	git.vcsName="Git";
	git.version="2.36.1";
	git.toStoreProgram();
	
	System.out.println(git.vcsName +" " +git.version);
 
}


}