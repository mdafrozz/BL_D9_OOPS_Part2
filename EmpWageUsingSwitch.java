package emp_wage_computation;

public class EmpWageUsingSwitch {
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int wagePerHour = 20;

	public static void main(String[] args) {
		int workingHrs = 0;
		int dailyWage = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck)
		{
		case PartTime:
			workingHrs = 4;
			System.out.println("Employee is Present for "+workingHrs+"Hrs");
			break;
		case FullTime:
			workingHrs = 8;
			System.out.println("Employee is Present for "+workingHrs+"Hrs");
			break;
		default:
			workingHrs = 0;
			System.out.println("Employee is Absent");
		}
		dailyWage = workingHrs * wagePerHour;
		System.out.println("Daily Wage is: " + dailyWage);
	}
}
