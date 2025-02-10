//QUESTION 2:
// Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rate of interest etc,print details of every banks.

public class BankQuestionTwo {
    public void getDetails(){
        System.out.println("Bank Details from parent");
    }

}
class SBI extends BankQuestionTwo{
    @Override
    public void getDetails() {
        System.out.println("Name of bank: SBI");
        System.out.println("Rate of interest- 3.50%-7.25% p.a.");
        System.out.println("Customer Support- 011 4040");
        System.out.println("Website- www.onlinesbi.com");

    }
}
class BOI extends BankQuestionTwo{
    @Override
    public void getDetails() {
        System.out.println("Name of bank: BOI");
        System.out.println("Rate of interest- 3.00% - 7.30% p.a.");
        System.out.println("Customer Support- 011 4041");
        System.out.println("Website- www.bankofindia.com");
    }
}

class ICICI extends BankQuestionTwo{
    @Override
    public void getDetails() {
        System.out.println("Name of bank: ICICI");
        System.out.println("Rate of interest- 3.00% - 7.20% p.a.");
        System.out.println("Customer Support- 011 4042");
        System.out.println("Website- www.icicibank.com");
    }
}
