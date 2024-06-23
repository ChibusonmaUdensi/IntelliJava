package org.harry;

public class Account {
   private int accountNumber;
   private int balance;
   private String pin;
   private String name;

   public Account(int accountNumber, String pin, String name) {
       this.accountNumber = accountNumber;
       this.pin = pin;
       this.name = name;

   }
   public Account() {

   }

    public String getAccountName(){
       return name;

    }
    public double checkBalance(String pin){
       validatePin(pin);
       return balance;
   }

   private void validatePin(String pin){
      if(!this.pin.equals(pin)) throw new IllegalArgumentException("Pin is not valid");

   }

    public int deposit(int amount) {
        if (amount > 0) {
           balance += amount;
        }
        return balance;
    }

    public void withdraw(int amount, String pin) {
       validatePin(pin);
       if(amount > 0){
           if (amount < balance) {
               balance -= amount;
           }else {
               throw new RuntimeException("balance must be greater than amount");
           }
       }else throw new RuntimeException("amount must be greater than zero");

    }
    public int getAccountNumber() {
       return accountNumber;
    }
}
