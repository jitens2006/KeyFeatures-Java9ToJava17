# Java 9 to Java 17 Key Features using Sample Exercise

This repository contains a programming exercise which is solved using Major features introduced from Java 9 till Java 17.

## Programming Exercise

In company, we have 2 types of Employee - Permanent and Contractor. We need to evaluate percentage hike for each employee based on his performance rating. For each rating(1 to 5, 5 being highest, there is predetermined percentage hike. Only Permanent employees are available for hike. Contractor are not eligible for any hike and needs to be skipped.  
 

1.**Java 9 : Immutable Collection Classes using Static Method of**

    File Name: AppJava9_Java17FeaturesExercise.java Line No. 66  
    return List.of(emp1, emp2, emp3, emp4);

2.** Java 15: Text Block **

	   File Name: AppJava9_Java17FeaturesExercise.java Line No. 56
      String address = """
				          House No.X036, XXX Society, Sec. XYZ,
				          Gurgaon, Haryana
				          1220XX
				          """;

3.** Java 11: New Utility Methods in String**

    File Name: AppJava9_Java17FeaturesExercise.java Line No. 22
    boolean isRatingBlank = employee.getRating().trim().isBlank()

4.**Java 10: Local Variable(var) type Inference **

	 File Name: AppJava9_Java17FeaturesExercise.java Line No. 15   
    var gradePercentageMapping = Map.of("5", 25, "4", 15, "3", 10, "2", 0, "1", 0);

5.**Java 17: Enhanced instanceof **

    File Name: AppJava9_Java17FeaturesExercise.java Line No. 43
    
    if (emp instanceof PermanentEmployee perm) {
			System.out.println(perm.getFirstName() + " : is permanent employee");
			return true;
	} else if (emp instanceof Contractor contractor) {
			System.out.println(contractor.getFirstName() + " : is contract employee");
			return false;
	}

6.** Java 17: Sealed Classes or Interfaces **

	File Name: Employee
    public sealed interface Employee permits PermanentEmployee, Contractor {
    public String getFirstName();
    }

7.** Java 17: Record Classes **

    Given a list of integers, write a Java 8 program to find the maximum and 
    minimum        numbers in the list.
    
     public record PermanentEmployee(String firstName, String lastName, String type, String id, String address, String rating) 
     implements Employee {
	  }