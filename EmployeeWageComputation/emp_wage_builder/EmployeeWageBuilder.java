/**
 * 
 */
package emp_wage_builder;

/**
 * @author MD_AFROZ
 *
 */
public class EmployeeWageBuilder {
	
	final int PRESENT = 1;
	final int PART_TIME = 2;
	final int WORKING_HOUR = 8;

	CompanyEmployeeWage[] companies;
	int lastIndex;

	public EmployeeWageBuilder() {
		this.companies = new CompanyEmployeeWage[10];
	}

	public void addCompany(CompanyEmployeeWage company) {
		try {
			companies[lastIndex++] = company;
		} catch (Exception e) {
			System.out.println("You can not add more company to the array as the size of an array is 5.");
		}
	}

	public int getWorkingHour(int empPresent) {
		switch (empPresent) {
		case PRESENT:
			return WORKING_HOUR;

		case PART_TIME:
			return WORKING_HOUR / 2;

		}
		return 0;
	}

	public void calculateEmpWage() {
		for (int i = 0; i < companies.length; i++) {
			if (companies[i] != null) {
				calculateEmpWage(companies[i]);
				System.out.println(companies[i]);
			}
		}
	}

	public void calculateEmpWage(CompanyEmployeeWage company) {
		int totalWorkingHour = 0;
		int day = 0;

		while (day < company.maxWorkingDay && totalWorkingHour < company.maxWorkingHour) {
			int isPresent;
			int remainingWorkingHour = company.maxWorkingHour - totalWorkingHour;
			if (remainingWorkingHour < WORKING_HOUR && !(remainingWorkingHour < (WORKING_HOUR / 2))) {
				isPresent = PART_TIME;
			} else if (remainingWorkingHour < (WORKING_HOUR / 2)) {
				break;
			} else {
				isPresent = (int) (Math.random() * 3);
			}

			totalWorkingHour = totalWorkingHour + getWorkingHour(isPresent);
			day++;
		}
		company.totalWorkingHour = totalWorkingHour;
		company.totalSalary = totalWorkingHour * company.wagePerHour;

	}

	public static void main(String[] args) {

		CompanyEmployeeWage dmart = new CompanyEmployeeWage("DMart", 20, 60, 25);

		CompanyEmployeeWage ril = new CompanyEmployeeWage("Reliance", 22, 80, 35);

		CompanyEmployeeWage npl = new CompanyEmployeeWage("NPL", 20, 48, 22);

		CompanyEmployeeWage techM = new CompanyEmployeeWage("Tech Mahindra", 25, 80, 40);

		CompanyEmployeeWage wipro = new CompanyEmployeeWage("Wipro", 20, 48, 22);

		CompanyEmployeeWage lenovo = new CompanyEmployeeWage("Lenovo", 25, 80, 40);

		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.addCompany(dmart);
		empWageBuilder.addCompany(ril);
		empWageBuilder.addCompany(npl);
		empWageBuilder.addCompany(techM);
		empWageBuilder.addCompany(wipro);
		empWageBuilder.addCompany(lenovo);

		empWageBuilder.calculateEmpWage();

	}

}
