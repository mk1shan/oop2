public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number,double Balance,String Email,String Name,String PhoneNumber){
        this.Number=Number;
        this.Balance=Balance;
        this.Email=Email;
        this.Name=Name;
        this.PhoneNumber=PhoneNumber;
    }

   public void DepositMoney(double DepositMoney){
        this.Balance+=DepositMoney;
       System.out.println("Deposit is succes ,new balance is "+this.Balance);
   }

   public void withdraw(double withdrawalMoney){
     if(this.Balance-withdrawalMoney <0){
         System.out.println("withdraw unsuccesful,"+this.getBalance()+"is left");
     }
     else{
         this.Balance-= withdrawalMoney;
         System.out.println("withdrwa succesful,current balance is "+this.Balance);
     }
   }
    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
