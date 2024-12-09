package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() { //aqui o retorno é do tipo da interface que na verdade é um sellerdaoJDBC
		return new SellerDaoJDBC();
	}
}
