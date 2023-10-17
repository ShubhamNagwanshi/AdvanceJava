package in.co.bundle;

import java.util.ResourceBundle;

public class TestBundle {
public static void main(String[] args) {
	
	ResourceBundle rb = ResourceBundle.getBundle("in.co.bundle.app_ja_jp");
	
	String driver = rb.getString("greeting");
	System.out.println(driver);
}
}
