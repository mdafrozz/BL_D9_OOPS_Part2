/**
 * 
 */
package emp_wage_computation;

/**
 * @author MD_AFROZ
 *
 */

public class SaveTotalWageByCompany {

	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public SaveTotalWageByCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage() {
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
			System.out.println("Day " + totalWorkingDays +"\t Emp Hrs: " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company " + company + " is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		SaveTotalWageByCompany dMart = new SaveTotalWageByCompany("DMart", 20, 2, 10);
		SaveTotalWageByCompany npl = new SaveTotalWageByCompany("NPL", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		System.out.println("<-------------------------------------------->");
		npl.computeEmpWage();
		System.out.println(npl);
	}
}
