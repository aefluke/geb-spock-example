
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	waiting {
	    timeout = 6
	    retryInterval = 0.5
	    slow { timeout = 12 }
	    reallyslow { timeout = 24 }
	}
	
		
	driver = {
	WebDriver driver = new ChromeDriver();
	}
	atCheckWaiting = true





// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://www.google.com.tr"