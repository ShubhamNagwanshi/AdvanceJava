package in.co.crud;

import java.util.Iterator;
import java.util.List;

public class MarksheetTest {
public static void main(String[] args) throws Exception {
	
	testAdd();
	//testUpdate();
//	testDelete();
//	testFindById();
	
	//testSearch();
	
	
}

private static void testSearch() throws Exception {
	MarksheetBean bean = new MarksheetBean();
     
	bean.setName("shu");
//	bean.setRollNo(101);
	
	MarksheetModel model = new MarksheetModel();
	
	List list = model.search(null,1,10);
	
	Iterator it = list.iterator();
	
	while(it.hasNext()) {
	    bean = (MarksheetBean) it.next();
		
		System.out.print(bean.getId());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getRollNo());
		System.out.print("\t"+bean.getPhysics());
		System.out.print("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
	}
	
	
}

private static void testFindById()throws Exception {
	MarksheetModel model = new MarksheetModel();
	
	MarksheetBean bean = model.findById(10);
	
	if (bean !=null) {
		System.out.print(bean.getId());
		System.out.print("\t"+bean.getName());
		System.out.print("\t"+bean.getRollNo());
		System.out.print("\t"+bean.getPhysics());
		System.out.print("\t"+bean.getChemistry());
		System.out.println("\t"+bean.getMaths());
	}else {
		System.out.println("ID does not exist....!!!!");
	}
	
}

private static void testDelete()throws Exception {
	
	MarksheetModel model = new MarksheetModel();
	model.delete(14);
}

private static void testUpdate()throws Exception {
	
	MarksheetBean bean = new MarksheetBean();
	bean.setId(14);
	bean.setName("Rajmauli");
	bean.setRollNo(114);
	bean.setPhysics(26);
	bean.setChemistry(45);
	bean.setMaths(55);
	
	MarksheetModel model = new MarksheetModel();
	model.update(bean);
}

private static void testAdd() throws Exception{
	MarksheetBean bean = new MarksheetBean();
	
	
	bean.setName("mauli");
	bean.setRollNo(114);
	bean.setPhysics(26);
	bean.setChemistry(45);
	bean.setMaths(65);
	
	MarksheetModel model = new MarksheetModel();
	model.add(bean);
	
	
}
}
