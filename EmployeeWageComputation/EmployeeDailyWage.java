package emp_wage_computation;

public class EmployeeDailyWage {
	public static void main(String[] args) {
		int fullTime = 1;
	int wagePerHour = 20;
	
	int workingHrs = 0;
	int dailyWage = 0;
	
	double empCheck = Math.floor(Math.random() * 10) % 2;
	
	if(empCheck == fullTime)
	{			workingHrs = 8;
	System.out.println("Employee is Present");
}
	else
	{	workingHrs = 0;
	System.out.println("Employee is Absent");
	}		
	dailyWage = workingHrs * wagePerHour;
	System.out.println("Employee Daily Wage is: " + dailyWage);

}
}
