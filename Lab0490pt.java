public class Lab0490pt{


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


            System.out.println("Principal:         "+"$"+ principal);
            System.out.println("Annual Rate:       "+ annualRate + "%");
            System.out.println("Number of Years:   "+ numYears);
            System.out.println("Monthly Payment:   "+"$"+ monthPay);
            System.out.println("Total Payments:    "+"$"+ totalPay);
            System.out.println("Total Interest:    "+"$"+ totalInterest);


    }
}
