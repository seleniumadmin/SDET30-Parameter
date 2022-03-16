package parameter;

import org.testng.annotations.Test;

public class ReadDataFromSystemTest {
	@Test
	public void readDataTest() {
		String BROWSER=System.getProperty("browser");
		System.out.println(BROWSER);
		
		String URL=System.getProperty("url");
		System.out.println(URL);
		


}
	}
