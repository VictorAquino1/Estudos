/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Banco {
   private Integer numberAccount;
   private String name;
   private Double balance;

   public Banco() {

   }

 
   public Banco(Integer numberAccount, String name, Double balance) {
      this.numberAccount = numberAccount;
      this.name = name;
      this.balance = balance;
   }

   public Double getBalance() {
      return balance;
   }

   public void setBalance(Double balance) {
      this.balance = balance;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getNumberAccount() {
      return numberAccount;
   }

   public void setNumberAccount(Integer numberAccount) {
      this.numberAccount = numberAccount;
   }

   public void saque(Double valor){
      Double saldo = this.balance;
      Double saldoSaque = (saldo - valor)-5;
      setBalance(saldoSaque);
   }
   public void deposito(Double valor){
      Double saldo = this.balance;
      Double saldodep = saldo + valor;
      setBalance(saldodep);
   }
   
   
   
    @Override
    public String toString() {
        return "Account " +numberAccount + ", Holder: " +name +", Balance: $" +balance;
        //return String.format("Account %f, Holder: %s, Balance: $ %.2f", numberAccount,name, balance);
    }

  
}
