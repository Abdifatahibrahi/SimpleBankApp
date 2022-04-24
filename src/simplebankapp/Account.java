
package simplebankapp;


public class Account {
    
    private String AccountNumber;
    private String Accountholder;
    private String OpenDate;
    private Double balance;
    
    
    public Account(String accountNum,String accountHol,String Date,Double accBalance){
        
        this.AccountNumber = accountNum;
        this.Accountholder = accountHol;
        this.OpenDate = Date;
        this.balance = accBalance;   
    }
    
    public void withdraw(double amount){
        this.balance = this.balance - amount;  
    }
    
    public void Deposit(double amount){
        this.balance = this.balance + amount;  
    }

    public void Transfer(Account a,double amount){
        this.withdraw(amount); 
        a.Deposit(amount);
    }
    
    
    
}
