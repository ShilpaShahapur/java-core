class SeleniumTester
{
	public static void main(String a[]){
	TestingTool tool = new TestingTool();
	tool.testingToolName= "Selenium";
	tool.version= 4;
	tool.toTesting();
	
	System.out.println(tool.testingToolName +" "+ tool.version);
	}


}