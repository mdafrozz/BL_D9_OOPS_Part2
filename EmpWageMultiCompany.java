/**
 * 
 */
package emp_wage_computation;

/**
 * @author MD_AFROZ
 *
 */
public class EmpWageMultiCompany {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	public static  void computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) 
	{

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case PART_TIME:
				empHrs = 4;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs; // empHrs + 1
			System.out.println("Day " + totalWorkingDays + " Working Hrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Employee Wage of " + company + " is: " + totalEmpWage);
		
	}

	public static void main(String[] args) {
		
		computeEmpWage("Accenture", 20, 2, 10);
		computeEmpWage("Infosys", 10, 4, 20);
		computeEmpWage("Wipro", 50, 6, 40);

	}

}
