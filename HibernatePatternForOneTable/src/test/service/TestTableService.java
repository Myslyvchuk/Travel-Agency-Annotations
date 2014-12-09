package test.service;

import java.util.List;

import test.dao.DaoFactory;
import test.entity.TestTable;

public class TestTableService {
	public void addTestTable(TestTable testTable) {
		DaoFactory.getInstance().getTestTableDAO().addElement(testTable);
	}
	public void updateTestTable(TestTable testTable) {
		DaoFactory.getInstance().getTestTableDAO().updateElement(testTable);
	}
	public TestTable getTestTableById(Long testTableId) {
        return DaoFactory.getInstance().getTestTableDAO().getElementByID(testTableId);
    }

    public List<TestTable> getAllTestTable() {
        return DaoFactory.getInstance().getTestTableDAO().getAllElements();
    }

    public void deleteBooking(TestTable testTable) {
        DaoFactory.getInstance().getTestTableDAO().deleteElement(testTable);
    }

}
