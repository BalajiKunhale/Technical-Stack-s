package Batch21.codingques;

import java.lang.reflect.Method;
import java.nio.file.DirectoryStream.Filter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CodingQuestionOnEmployee {
	
	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee(1, "anil",  32, "Male", "HR",     2015, 25000.0);
		Employee e2 = new Employee(2, "anila", 30, "Female","Sales", 2016, 15000.0);
		Employee e3 = new Employee(3, "Sunil", 27, "Male",  "Development", 2015, 32500.0);
		Employee e4 = new Employee(4, "ajit",  34, "Male",  "Sales",  2013, 12000.0);
		Employee e5 = new Employee(5, "Sujit", 28, "Male",   "HR",    2012, 27000.0);
		Employee e6 = new Employee(6, "Radha", 25, "Female", "Sales", 2018, 20000.0);
		Employee e7 = new Employee(7, "anita", 30, "Female", "Development", 2016, 35000.0);
		Employee e8 = new Employee(8, "Arun",  32, "Male",   "Development", 2015, 45000.0);
		
		
		 List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		 
	   //01. How many male & female employees are there in organization		 
		 Map<String, Long> genderMap = employees.stream()
		 .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		 
		 System.out.println(genderMap);  //  {Female=3, Male=5}
		 
		 
		 
		//02. What is the average age of  male & female employees in organization
		 Map<String, Double> averageAgeMap = employees.stream()
		 .collect(Collectors.groupingBy(Employee::getGender,
				  Collectors.averagingInt(Employee::getAge)));
		 
		 System.out.println(averageAgeMap); // {Female=28.333333333333332, Male=30.6}
		 
		 
		 
		 //03. print the names of all department in the organisation
		    List<String> deptList = employees.stream()  // pass employee data to stream
				    .map(Employee::getDept)
				    .distinct()   //  for unique 
				    .collect(Collectors.toList());  // to store in list

		    System.out.println(deptList); // [HR, Sales, Development]
		 
		
		    
		  // 04.  get details of highest paid employee in organization
		    Optional<Employee> highestPaidEmp = employees.stream()
		    .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		 
		    highestPaidEmp.ifPresent(e ->System.out.println(e));
		                    // Employee [empid=8, name=Arun, age=32, gender=Male, dept=Development, yrOfJoining=2015, salary=45000.0]

		 
		    
		  // 05. get highest paid salary in organization
		    Optional<Double> highestPaidSal = employees.stream()
		    .map(Employee::getSalary)
		    .sorted(Comparator.reverseOrder())
		    .distinct()
		    .findFirst();
		    
		    highestPaidSal.ifPresent(sal-> System.out.println(sal));// 45000.0
		    
		    
		  // 06. get 2nd highest paid salary in organization
		          Double SecondhighestSal = employees.stream()
				    .map(Employee::getSalary)
				    .sorted(Comparator.reverseOrder())
				    .distinct()
				    .skip(1)
				    .findFirst()
				    .get();
		    System.out.println(SecondhighestSal);   // 35000.0
		    
		    
		  
		  // 07. get the names of all employee who have join after 2016
		    employees.stream()
		    .filter(e->e.getYrOfJoining()>=2016)
		    .map(e->e.getName())
		    .forEach(System.out::println);
		    
		    
		    
		  // 08. count the number of employee in each dept
		    Map<String, Long> DeptEmpCount = employees.stream()
		    .collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
		    
		    System.out.println(DeptEmpCount);   //  {Sales=3, Development=3, HR=2}
		    
		    
		    
			// 09.  average age of  each Dept
		    Map<String, Double> deptWiseAvgSal = employees.stream()
		    .collect(Collectors.groupingBy( Employee::getDept, 
		    		 Collectors.averagingDouble(Employee::getSalary)));
		    
		    System.out.println(deptWiseAvgSal);
                               //  {Sales=15666.666666666666, Development=37500.0, HR=26000.0}

		    
		    
		    // 10. How many male & female employee are there in sales Team
		    Map<String, Long> SalesMFCount = employees.stream()
		    .filter(e->e.getDept().equals("Sales"))
		    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting() ));
		    
		    System.out.println(SalesMFCount);
		    
		    
		    
		    
		    // 11. Get the details of Youngest mail employee in Development dept
		    Optional<Employee> youngestEmp = employees.stream()
		    .filter(e->e.getGender().equals("Male") && e.getDept().equals("Development"))
		    .min(Comparator.comparing(Employee::getAge));
		    
		    youngestEmp.ifPresent(yemp->System.out.println(yemp));
		    
		    
		    
		  // 12. get details of Eldest female employee in the Sales Dept.
		    
		    
		    
		  // 13. who has the most working experience in the organization
		    Optional<Employee> mostExperiencedEmp = employees.stream()
		    .collect(Collectors.minBy(Comparator.comparing (Employee::getYrOfJoining)));
		    
		    mostExperiencedEmp.ifPresent (ee-> System.out.println(ee));
		   //System.out.println(mostExperiencedEmp.get());
		    
		    
		    
		  // 14. Who is the oldest employee the organization
		    Optional<Employee> maxAge = employees.stream()
		    .max(Comparator.comparing (Employee::getAge));
		    System.out.println(maxAge.get());
		    
		    
		    
		  // 15. separate the employees who are younger or equal to 25 years
		    Map<Boolean, List<Employee>> listEmp = employees.stream()
		    .collect(Collectors.partitioningBy (em -> em.getAge() <=28));
		     System.out.println(listEmp);
		     
		    List<Employee> youngerEmpList = listEmp.get(true);
		    List<Employee> olderEmpList = listEmp.get(false);
		    
		    System.out.println(youngerEmpList);
		    System.out.println(olderEmpList);
		    
		    
		  
		    // 16. What is the average salary and total salary of the whole organization
		    // Method-2
		    String avgAndTotal = employees.stream()
		    .collect(Collectors.teeing(  
		    		Collectors.averagingDouble(Employee::getSalary),
		    		Collectors.summingDouble(Employee::getSalary),
		    		(avg1,total)-> avg1 + ":" +total));
		    
		    System.out.println(avgAndTotal);    //  26437.5:211500.0
		    
		    //Method-1
		    Double AvgSal =  employees.stream()
		    .collect(Collectors.averagingDouble (Employee::getSalary));
		    Double totalSal = employees.stream()
		    .collect(Collectors.summingDouble (Employee::getSalary));
		    System.out.println("AverageSalary: "+AvgSal + "total Saalry: "+totalSal);
		    		
		    		
		    
		    
		  // 17. what is average age of the employess in the oragnization
		    Double avgAge = employees.stream()
		    .collect(Collectors.averagingDouble (Employee::getAge));
		     
		    System.out.println("Average Age: "+ avgAge);
		    
		    
	
		    
		  // 18 what is average age of male and female employees in the organization.
		    
		    
		    
	}

}
