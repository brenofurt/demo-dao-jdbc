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
		System.out.println();
		
		System.out.println("==== Testando findAll =====\n");
		List<Department> list = new ArrayList<>(departmentDao.findAll());
		for(Department d : list) {
			System.out.println(d);
		}
		System.out.println();
		
		System.out.println("==== Testando insert =====\n");
		Department dep2 = new Department(null, "Camping");
		departmentDao.insert(dep2);
		System.out.println("Inserted!");
		System.out.println();
		
		
		System.out.println("==== Testando update =====\n");
		Department dep3 = new Department(6, "Games");
		departmentDao.update(dep3);
		System.out.println("Updated");
		System.out.println("");
		
		System.out.println("==== Testando deleteById =====\n");
		int id2 = 12;
		departmentDao.deleteById(id2);
		System.out.println("Deleted!");
	}

}
