package emp_wage_computation;

public class EmployeeMonthlyWage {
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int wagePerHour = 20;
	public static final int NumOfWorkingDays = 20;

	public static void main(String[] args) {
		int workingHrs = 0, dailyWage = 0, monthlyWage = 0;
		
		for(int day = 0; day < NumOfWorkingDays; day++)
		{
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck)
			{
			case PartTime:
				workingHrs = 4;
				System.out.println("Employee is Present "+workingHrs+"Hrs Daily");
				break;
			case FullTime:
				workingHrs = 8;
				System.out.println("Employee is Present "+workingHrs+"Hrs Daily");
				break;
			default:
				workingHrs = 0;
				System.out.println("Employee is Absent");
			}
			dailyWage = workingHrs * wagePerHour;
			monthlyWage = dailyWage * NumOfWorkingDays;
			System.out.println("Daily Wage is: " + dailyWage);
		}
		System.out.println("Monthly Wage is: " + monthlyWage);

	}
}
