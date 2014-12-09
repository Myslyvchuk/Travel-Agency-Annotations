package test.dao;

import test.dao.DaoFactory;

public class DaoFactory {

	private TestTableDAO testTableDAO = null;

	private static DaoFactory instance = null;

	private DaoFactory() {

		this.testTableDAO = new TestTableDAO();
	}

	public static synchronized DaoFactory getInstance() {
		if (instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}

	public TestTableDAO getTestTableDAO() {
		return testTableDAO;
	}
	

}
