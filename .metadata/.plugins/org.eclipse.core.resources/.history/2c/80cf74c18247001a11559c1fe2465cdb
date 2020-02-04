package com.main.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.actor.Customer;
import com.main.actor.Employee;
import com.main.brokers.AdminBroker;
import com.main.brokers.CustomerBroker;

@RestController
@RequestMapping("/adminrest")
public class AdminRestControl {

	@PostMapping("/getCustomer/{cusId}")
	public Customer getCustomerById(@PathVariable("cusId") int cusId)
	{
		AdminBroker ab = new AdminBroker();
		Customer cus = ab.getCustomer(cusId);
		
		return cus;
	}
	
	@PostMapping("/getEmployee/{empID}")
	public Employee getEmployeeById(@PathVariable("empID") int empID)
	{
		AdminBroker ab = new AdminBroker();
		Employee emp = ab.getEmployee(empID);
		
		return emp;
	}
	
	@PostMapping("/insertEmployeeManager/{email}/{pass}/{street}/{fn}/{ln}/{hn}/{un}/{pc}/{city}/{provice}/{country}/{phone}/{birthdate}")
	public void insertEmployeeManager(@PathVariable("email") String email_login, @PathVariable("pass") String pass, @PathVariable("street") String street, 
								@PathVariable("fn") String firstName, @PathVariable("ln") String lastName, @PathVariable("houseNum") String houseNum,
								@PathVariable("unitNum") String unitNum, @PathVariable("postal_code") String postalCode, @PathVariable("city") String city,
								@PathVariable("province") String province, @PathVariable("country") String country, @PathVariable("phoneNum") String phoneNumber,
								@PathVariable("birthdate") int dateOfBirth)
	{
		AdminBroker ab = new AdminBroker();
		Employee emp = new Employee(0, "M", lastName, firstName, "16 Ave", houseNum, unitNum, city, province, postalCode, email_login, pass, country, phoneNumber, 29022000, true);
		ab.insertEmployee(emp);
	
	}
	
	@PostMapping("/insertEmployeeRegular/{email}/{pass}/{street}/{fn}/{ln}/{hn}/{un}/{pc}/{city}/{provice}/{country}/{phone}/{birthdate}")
	public void insertEmployeeRegular(@PathVariable("email") String email_login, @PathVariable("pass") String pass, @PathVariable("street") String street, 
								@PathVariable("fn") String firstName, @PathVariable("ln") String lastName, @PathVariable("houseNum") String houseNum,
								@PathVariable("unitNum") String unitNum, @PathVariable("postal_code") String postalCode, @PathVariable("city") String city,
								@PathVariable("province") String province, @PathVariable("country") String country, @PathVariable("phoneNum") String phoneNumber,
								@PathVariable("birthdate") int dateOfBirth)
	{
		AdminBroker ab = new AdminBroker();
		Employee emp = new Employee(0, "R", lastName, firstName, "16 Ave", houseNum, unitNum, city, province, postalCode, email_login, pass, country, phoneNumber, 29022000, true);
		ab.insertEmployee(emp);
	
	}
	
	@PostMapping("/insertEmployeeAdmin/{email}/{pass}/{street}/{fn}/{ln}/{hn}/{un}/{pc}/{city}/{provice}/{country}/{phone}/{birthdate}")
	public void insertEmployeeAdmin(@PathVariable("email") String email_login, @PathVariable("pass") String pass, @PathVariable("street") String street, 
								@PathVariable("fn") String firstName, @PathVariable("ln") String lastName, @PathVariable("houseNum") String houseNum,
								@PathVariable("unitNum") String unitNum, @PathVariable("postal_code") String postalCode, @PathVariable("city") String city,
								@PathVariable("province") String province, @PathVariable("country") String country, @PathVariable("phoneNum") String phoneNumber,
								@PathVariable("birthdate") int dateOfBirth)
	{
		AdminBroker ab = new AdminBroker();
		Employee emp = new Employee(0, "A", lastName, firstName, "16 Ave", houseNum, unitNum, city, province, postalCode, email_login, pass, country, phoneNumber, 29022000, true);
		ab.insertEmployee(emp);
	
	}
	
	@PostMapping("/insertCustomer/{ln}/{fn}/{street}/{hn}/{un}/{city}/{province}/{postalcode}/{country}/{phoneNumber}/{email}/{password}/{birthdate}")
	public void insertCustomer(@PathVariable("ln")String lastName,@PathVariable("fn")String firstName,@PathVariable("street") String street, 
								@PathVariable("hn")String houseNumber,@PathVariable("un")String unitNumber,@PathVariable("city")String city, @PathVariable("province") String province
								,@PathVariable("postalcode") String postalCode,@PathVariable("country") String country,@PathVariable("phoneNumber") String phoneNumber,
								@PathVariable("email")String email,@PathVariable("password") String password,@PathVariable("birthdate") int dateOfBirth)
	{
		
			Customer cus = new Customer(0, "C", lastName, firstName, street, houseNumber, unitNumber, city, province, postalCode, country, phoneNumber, email, password, 1234 , true);
			CustomerBroker cb = new CustomerBroker();
			cb.insertCustomer(cus);
	}
	
	@PostMapping("/updateEmployee/{empID}/{email}/{pass}/{street}/{fn}/{ln}/{hn}/{un}/{pc}/{city}/{provice}/{country}/{phone}/{birthdate}/{role}")
	public void updateEmployee(@PathVariable("empID") int empID, @PathVariable("email") String email_login, @PathVariable("pass") String pass, @PathVariable("street") String street,
								@PathVariable("fn") String firstName, @PathVariable("ln") String lastName, @PathVariable("houseNum") String houseNum,
								@PathVariable("unitNum") String unitNum, @PathVariable("postal_code") String postalCode, @PathVariable("city") String city,
								@PathVariable("province") String province, @PathVariable("country") String country, @PathVariable("phoneNum") String phoneNumber,
								@PathVariable("birthdate") int dateOfBirth, @PathVariable("role") String role)
	{
		AdminBroker ab = new AdminBroker();
		Employee emp = ab.getEmployee(empID);
		emp.setEmail(email_login);
		emp.setPassword(pass);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setHouseNumber(houseNum);
		emp.setUnitNumber(unitNum);
		emp.setPostalCode(postalCode);
		emp.setCity(city);
		emp.setProvince(province);
		emp.setCountry(country);
		emp.setPhoneNumber(phoneNumber);
		emp.setStreet(street);
		emp.setRole(role);
		ab.updateEmployee(emp);
	
	}
	
	@PostMapping("/updateCustomer/{cusID}/{email}/{pass}/{street}/{fn}/{ln}/{hn}/{un}/{pc}/{city}/{provice}/{country}/{phone}/{birthdate}")
	public void updateCustomer(@PathVariable("cusID") int cusID, @PathVariable("email") String email_login, @PathVariable("pass") String pass, @PathVariable("street") String street,
								@PathVariable("fn") String firstName, @PathVariable("ln") String lastName, @PathVariable("houseNum") String houseNum,
								@PathVariable("unitNum") String unitNum, @PathVariable("postal_code") String postalCode, @PathVariable("city") String city,
								@PathVariable("province") String province, @PathVariable("country") String country, @PathVariable("phoneNum") String phoneNumber,
								@PathVariable("birthdate") int dateOfBirth)
	{
		AdminBroker ab = new AdminBroker();
		Customer cus = ab.getCustomer(cusID);
		cus.setEmail(email_login);
		cus.setPassword(pass);
		cus.setFirstName(firstName);
		cus.setLastName(lastName);
		cus.setHouseNumber(houseNum);
		cus.setUnitNumber(unitNum);
		cus.setPostalCode(postalCode);
		cus.setCity(city);
		cus.setProvince(province);
		cus.setCountry(country);
		cus.setPhoneNumber(phoneNumber);
		cus.setStreet(street);
		ab.updateCustomer(cus);
	
	}
	
	@PostMapping("/getCustomer/{customer}")
	public void deleteCustomer(@PathVariable("customer") Customer cus)
	{
		AdminBroker ab = new AdminBroker();
		ab.deleteCustomer(cus);
	}
	
	@PostMapping("/getCustomer/{employee}")
	public void deleteEmployee(@PathVariable("employee") Employee emp)
	{
		AdminBroker ab = new AdminBroker();
		ab.deleteEmployee(emp);;
	}
	
	/////////////////SET TO ACTIVE OT INACTIVE//////////////////////
	@PostMapping("/deactiveCustomerByID/{cusID}")
	public void deactivateCustomerById(@PathVariable("cusId") int cusID)
	{
		AdminBroker ab = new AdminBroker();
		Customer cus = ab.getCustomer(cusID);
		cus.setState(false);
		CustomerBroker cb = new CustomerBroker();
		cb.updateCustomerInfo(cus);
	
	}
}
