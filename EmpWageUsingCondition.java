package emp_wage_computation;

public class EmpWageUsingCondition {
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int wagePerHour = 20;
	public static final int NumOfWorkingDays = 20;
	public static final int HrsInMonth = 100;

	public static void main(String[] args) {
		int workingHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0, dailyWage=0;
		
		while(totalEmpHrs <= HrsInMonth && totalWorkingDays < NumOfWorkingDays) {
			totalWorkingDays++;
			
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck)
			{
			case PartTime:
				workingHrs = 4;
				System.out.println("Employee is Present");
				break;
			case FullTime:
				workingHrs = 8;
				System.out.println("Employee is Present");
				break;
			default:
				workingHrs = 0;
				System.out.println("Employee is Absent");
			}
			totalEmpHrs += workingHrs;
			dailyWage = workingHrs * wagePerHour;
			System.out.println("Day:" + totalWorkingDays + " Worked Hrs:" + workingHrs
					+" Daily Wage is:"+dailyWage);
			
		}

		int totalEmpWage = totalEmpHrs * wagePerHour;
		System.out.println("TOtal Employee Wage is: " + totalEmpWage);
	}
}
