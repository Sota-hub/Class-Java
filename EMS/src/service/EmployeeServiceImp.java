package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOMySQLImp;
import dto.Employee;
import exception.EmployeeNotFoundException;

public class EmployeeServiceImp implements EmployeeService{
	
	public EmployeeDAO empDAO = new EmployeeDAOMySQLImp();

	@Override
	public List<Employee> showAllEmployees() {
		return empDAO.showAllEmployees();
	}

	@Override
	public void addEmployee(Employee e) {
		empDAO.addEmployee(e);
	}

	@Override
	public void deleteEmployee(int id) {
		empDAO.deleteEmployee(id);
		
	}

	@Override
	public void updateEmployee(Employee e) {
		empDAO.updateEmployee(e);
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		return empDAO.findEmployee(e);
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}