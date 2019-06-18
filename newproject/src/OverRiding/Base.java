package OverRiding;

public class Base {
	
	//String browserName;
	
	public 	WebDriver getBrowserInstance(String browserName)
	{
		if (browserName.equals("Chrome"))
			{
					return new Chrome();
			}else if(browserName.equals("InternetExplorer"))
					{
						return new InternetExplorer();
						
					}else if(browserName.equals("FireFox"))
					{
						return new FireFox();
					}else {
						return new FireFox();
					}
}
	}


