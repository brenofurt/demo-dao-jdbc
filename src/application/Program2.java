package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Testando findById =====\n");
		int id = 1;
		Department department = departmentDao.findById(id);
		System.out.println(department);
		
		System.out.println("==== Testando findAll =====\n");
		List<Department> list = new ArrayList<>(departmentDao.findAll());
		for(Department d : list) {
			System.out.println(d);
		}

	}

}
