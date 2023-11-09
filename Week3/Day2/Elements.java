package Week3.Day2;

public class Elements extends Button {
	
	public String Element(String str) {
		
		String str1 = "Element method";
		return str + " "+ str1;
		
	}

	public static void main(String[] args) {
		
		Elements elmObj = new Elements();
		
		//class Element: Button -> Elements
		elmObj.Element("Welcome to");
		System.out.println("");
		
		//Class Button: WebElement-> Button 
		elmObj.submit(); 
		
		//from superclass WebElement: WebElement-> Button -> Elements
		elmObj.click();
		elmObj.setText("Calling from subclass Button");
		System.out.println("");
		
		// class CheckBoxButton: WebElement -> Button -> CheckBoxButton
	 	CheckBoxButton chkObj = new CheckBoxButton();
		chkObj.clickCheckButton();
		System.out.println("");
		
		//Class RadioButton -> WebElement -> Button -> RadioButton
		RadioButton rdObj = new RadioButton();
		rdObj.selectRadioButton();
		System.out.println("");
		
		//class webElement:
		elmObj.click();		
		elmObj.setText("calling from element subclass");
		System.out.println("");
		
	}

}
