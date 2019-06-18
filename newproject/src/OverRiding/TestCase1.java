package OverRiding;

public class TestCase1 extends Base{
	
	String browserName = "FireFox";

	public static void main(String[] args) {
		
		TestCase1 t = new TestCase1();
		t.initBrowser();
		

	}
	
	public void initBrowser()
	{
		WebDriver driver = getBrowserInstance(browserName);
		driver.display();
		driver.show();
	}
} 
