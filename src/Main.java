public class Main {
    public static void main(String[] args) {
       double cardbalance = 5000;
       double intrest = 5000*.17;

       double firstintrest = cardbalance + intrest;
       double month1 = firstintrest * cardbalance;
       double secondintrest = firstintrest * .17;
       double month2 = cardbalance + secondintrest;


       System.out.println("your month 1 payment is " + firstintrest + " and your month 2 payment is " + month2);


    }
}