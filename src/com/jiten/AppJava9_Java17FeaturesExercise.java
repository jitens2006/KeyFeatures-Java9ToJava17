package com.jiten;

import java.util.List;
import java.util.Map;

public class AppJava9_Java17FeaturesExercise {

	public static void main(String args[]) {

		boolean isPermEmployee;

		// Java 10 Feature: Local Variable Type Inference

		// Java 9 : Immutable Collection Classes using Static Method
		var gradePercentageMapping = Map.of("5", 25, "4", 15, "3", 10, "2", 0, "1", 0);

		for (Employee employee : getListOfEmployees()) {
			isPermEmployee = checkEmployeeType(employee);
			if (isPermEmployee) {

				// Java 11: Utility methods in String
				boolean isRatingBlank = employee.getRating().trim().isBlank();

				if (!isRatingBlank) {
					int raisePercentage = switch (employee.getRating()) {
					case "5" -> gradePercentageMapping.get("5");
					case "4" -> gradePercentageMapping.get("4");
					case "3" -> gradePercentageMapping.get("3");
					case "2", "1" -> gradePercentageMapping.get("2");
					default -> 0;
					};
					// Java join() method included in
					String joinFirstNameLastName = String.join(",", employee.getFirstName(), employee.getLastName());
					System.out.println("Raise for emp " + joinFirstNameLastName + ":" + raisePercentage);

				}
			}
		}
	}

	// Enhanced instanceof
	private static boolean checkEmployeeType(Employee emp) {
		if (emp instanceof PermanentEmployee perm) {
			System.out.println(perm.getFirstName() + " : is permanent employee");
			return true;
		} else if (emp instanceof Contractor contractor) {
			System.out.println(contractor.getFirstName() + " : is contract employee");
			return false;
		}
		return false;
	}

	private static List<Employee> getListOfEmployees() {

		// Text Block - Java 15
		String address = """
				      House No.X036, XXX Society, Sec. XYZ,
				      Gurgaon, Haryana
				      122011
				""";
		Employee emp1 = new PermanentEmployee("Ram", "Kumar", "Perm", "133697", address, "3");

		Employee emp2 = new PermanentEmployee("Shyam", "Sunder", "Perm", "133690", "Delhi", "4");
		Employee emp3 = new PermanentEmployee("Sathish", "Singh", "Perm", "133697", "Delhi", "4");
		Employee emp4 = new Contractor("Sathish", "Singh", "Perm", "133697", "Delhi", "NA");
		return List.of(emp1, emp2, emp3, emp4);
	}
}
