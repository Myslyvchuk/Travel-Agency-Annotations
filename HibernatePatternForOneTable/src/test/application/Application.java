package test.application;

import test.entity.TestTable;
import test.service.TestTableService;

public class Application {

	public static void main(String[] args) {

		TestTable testTable = new TestTable();
		testTable.setName("�����");
		testTable.setSurname("����������");
		
		TestTableService ts = new TestTableService();
		
		ts.addTestTable(testTable);
	}

}
