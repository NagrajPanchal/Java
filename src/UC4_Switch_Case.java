public class UC4_Switch_Case
{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int totalWorkingDays = 0;
        int totalHour = 0;
        int totalDailyWage = 0;
        while (totalHour < 100 && totalWorkingDays < 20) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            totalWorkingDays ++;
            switch (employeeCheck) {
                case 2:
                    totalDailyWage = totalDailyWage + fullTimeHour * wagePerHour;
                    System.out.println("Employee is present full time: " + totalDailyWage);
                    break;
                case 1:
                    totalDailyWage = totalDailyWage + partTimeHour * wagePerHour;
                    System.out.println("Employee is present half time: " + totalDailyWage);
                    break;
                default:
                    System.out.println("Employee is absent: " + totalDailyWage);
            }
            System.out.println("Working Days is: " + totalWorkingDays);

        }

        System.out.println("Employee total wage for month is: " + totalDailyWage);
    }

}
