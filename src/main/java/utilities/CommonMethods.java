package utilities;

import org.openqa.selenium.WebElement;

public class CommonMethods {
	public static void enterText(WebElement elem, String str) {
		elem.clear();
		elem.sendKeys(str);
	}
	
	public static void clickElem(WebElement elem) {
		elem.click();
	}
}