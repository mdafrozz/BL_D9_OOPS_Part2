/**
 * 
 */
package emp_wage_builder;

/**
 * @author MD_AFROZ
 *
 */
public class CompanyEmployeeWage {
	String company;
	int maxWorkingDay, maxWorkingHour, wagePerHour, totalWorkingHour;

	int totalSalary;

	public CompanyEmployeeWage(String company, int maxWorkingDay, int maxWorkingHour, int wagePerHour) {
		this.company = company;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
		this.wagePerHour = wagePerHour;
	}

	@Override
	public String toString() {
		return "Employee company name : " + company + "\nEmployee monthly wage : " + totalSalary + 
				 "\nEmployee total working hours : " + totalWorkingHour + " Hours\n"
				+ "------------------------------------";
	}
}
