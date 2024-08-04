package ExerciseSheet;

// Create a class called BankAccount that has the following attributes: account number, balance, and customer name. Write methods to get and set each attribute. Write a method called deposit() that deposits money into the account and a method called withdraw() that withdraws money from the account.
class BankAccount{
    int accountNumber;
    int accountBalance;
    String customerName;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    void deposit(int amount){
        accountBalance+=amount;
        System.out.println("Amount Deposite is "+amount);
        System.out.println("New Account Balance is "+accountBalance);
    }
    void withdraw(int amount){
        accountBalance-=amount;
        System.out.println("Amount Withdraw is "+amount);
        System.out.println("New Account Balance is "+accountBalance);
    }
    

}
public class Question2 {
    public static void main(String[] args) {
    BankAccount b1 = new BankAccount();
    b1.setAccountNumber(180055);
    b1.setAccountBalance(123000);
    b1.setCustomerName("Abhishek");
    b1.deposit(1200);
    b1.withdraw(900);
    }
}
