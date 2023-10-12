package in.co.user;

import java.text.SimpleDateFormat;

public class TestUser {
public static void main(String[] args) throws Exception {
	testAdd();
//	testUpdate();
}

private static void testUpdate() throws Exception {
	
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	UserBean bean = new UserBean();
	
	bean.setFirstName("Shubham");
	bean.setLastName("Nagwanshi");
	bean.setLoginId("shubham@gmail.com");
	bean.setPassword("5678");
	bean.setDob(sdf.parse("1998-08-12"));
	bean.setAddress("Indore");
	bean.setId(1);
	
	UserModel model = new UserModel();
	
	model.update(bean);
}

private static void testAdd() throws Exception{
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	UserBean bean = new UserBean();
	
	bean.setFirstName("Gopal");
	bean.setLastName("Malviya");
	bean.setLoginId("gopal@gmail.com");
	bean.setPassword("1234");
	bean.setDob(sdf.parse("2000-12-08"));
	bean.setAddress("Khargone");
	
	UserModel model = new UserModel();
	
	model.add(bean);
	
}
}
