public class Lab04100pt {
    public static void main(String[] args)
    {
        System.out.println("Lab0490pt, Student Version\n");

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

        double totalPay = numMonths * monthPay;
        double totalInterest = totalPay - principal;

        double newMonthPay = monthPay *100;
        double roundMonthPay =Math.round(newMonthPay);
        int changeMonthPay =(int)(roundMonthPay);
        double divMonthPay =changeMonthPay/100.0;

        double newtotalPay = totalPay *100;
        double roundtotalPay =Math.round(newtotalPay);
        int changetotalPay =(int)(roundtotalPay);
        double divtotalPay =changetotalPay/100.0;

        double newtotalInterest = totalInterest *100;
        double roundtotalInterest =Math.round(newtotalInterest);
        int changetotalInterest =(int)(roundtotalInterest);
        double divtotalInterest =changetotalInterest/100.0;


        System.out.println("Principal:         "+ "$"+ principal);
        System.out.println("Annual Rate:       "+ annualRate + "%");
        System.out.println("Number of Years:   "+ numYears);
        System.out.println("Monthly Payment:   "+"$"+ divMonthPay);
        System.out.println("Total Payments:    "+"$"+ divtotalPay);
        System.out.println("Total Interest:    "+"$"+ divtotalInterest);


    }
}
