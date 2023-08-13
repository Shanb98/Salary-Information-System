import java.util.*;
class Assignment_SIS{
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("|                        SALARY INFORMATION SYSTEM                       |");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("        [1] Calculate Income Tax");
        System.out.println("        [2] Calculate Annual Bonus");
        System.out.println("        [1] Calculate Loan Amount");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Option to Continue > ");
        int r = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.println("");

        if(r==1){
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|                        Calculate Income Tax                            |");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("");


            System.out.print("Input Employee Name   - ");
            String str = scanner.nextLine();
            System.out.print("Input Employee Salary - ");
            double a = scanner.nextDouble();

            if (a<= 100000){
                System.out.println("You Have to Pay Income Tax per Month: " + 0 );
            }
            else if(a> 100000 && a<=141667 ){
                System.out.println("Your Income Tax is: " + ((a-100000)*0.06) );
            }
            else if(a> 141667 && a<=183333 ){
                System.out.println("Your Income Tax is: " + ((41667 * 0.06)+(a-141667)*0.12) );
            }
            else if(a> 183333 && a<=225000 ){
                System.out.println("Your Income Tax is: " + ((41667 * 0.06)+(41667 * 0.12)+(a-183333)*0.18) );
            }
            else if(a> 225000 && a<=266667 ){
                System.out.println("Your Income Tax is: " + ((41667 * 0.06)+(41667 * 0.12)+(41667 * 0.18)+(a-183333)*0.24) );
            }
            else if(a> 266667 && a<=308333 ){
                System.out.println("Your Income Tax is: " + ((41667 * 0.06)+(41667 * 0.12)+(41667 * 0.18)+(41667 * 0.24)+(a-266667)*0.3) );
            }
            else if(a>308333){
                System.out.println("Your Income Tax is: " + ((41667 * 0.06)+(41667 * 0.12)+(41667 * 0.18)+(41667 * 0.24)+(41667 * 0.3)+(a-308333)*0.36) );
            }
            else {
                System.out.println("Enter a Valid Number");
            }
        }
        if(r==2){
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("|                        Calculate Annual Bouns                          |");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("");


            System.out.print("Input Employee Name   - ");
            String str1 = scanner.nextLine();
            System.out.print("Input Employee Salary - ");
            double b = scanner.nextDouble();

            if (b<=100000){
                System.out.print("Annual Bouns   - " + 5000 );
            }
            else if (b>100000 && b<=199999){
                System.out.print("Annual Bouns   - " + (b*0.1) );
            }
            else if (b>200000 && b<=299999){
                System.out.print("Annual Bouns   - " + (b*0.15) );
            }
            else if (b>300000 && b<=399999){
                System.out.print("Annual Bouns   - " + (b*0.2) );
            }
            else if (b>=400000){
                System.out.print("Annual Bouns   - " + (b*0.35) );
            }

        }
        if(r==3){
            System.out.println("-----------------------------------------------------");
            System.out.println("|              EMPLOYEE LOAN CALCULATOR              |");
            System.out.println("-----------------------------------------------------");



            System.out.print("Enter employee name: ");
            String employeeName = scanner.nextLine();

            System.out.print("Enter monthly salary (in Rs.): ");
            int monthlySalary = scanner.nextInt();

            System.out.print("Enter number of years (max 5 years): ");
            int numYears = scanner.nextInt();

            // Check if the employee is eligible for a loan
            if (monthlySalary < 50000) {
                System.out.println("Employee is not eligible for a loan.");
                return;
            }

            if (numYears > 5) {
                System.out.println("Maximum number of years allowed is 5.");
                return;
            }

            else{
                double annualInterestRate = 0.15;
                double monthlyInterestRate = annualInterestRate / 12;
                int numMonths = numYears * 12;

                double monthlyInstallment = (monthlySalary * 0.6) / 12;
                double loanAmount = Math.round(monthlyInstallment * (1 - 1 / Math.pow(1 + monthlyInterestRate, numMonths)) / monthlyInterestRate / 1000) * 1000;

                System.out.println("You can get Loan Amount : " + loanAmount);

            }
        }



    }
}
