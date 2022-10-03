// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        double numMonths = numYears*12;

        double monthRate   = annualRate/1200;
        monthRate %= 1200;
        double topMonthpay =Math.pow(monthRate+1, numMonths) * monthRate;
        double bottomMonthpay =Math.pow(monthRate+1, numMonths) -1;
        double topbottomMonthpay = topMonthpay/bottomMonthpay;
        double monthPay = topbottomMonthpay * principal;


        System.out.println("Principal:         "+ "$"+ principal);
        System.out.println("Annual Rate:       "+ annualRate + "%");
        System.out.println("Number of Years:   "+ numYears);
        System.out.println("Monthly Payment:   "+"$"+ monthPay);


    }
}

