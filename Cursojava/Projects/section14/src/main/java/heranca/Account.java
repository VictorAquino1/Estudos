package heranca;

/**
 * Hello world!
 *
 */
public class Account {
    private Integer number;
    private String holder;
    protected Double balance;


    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }


    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;

    }
    public void deposit(double amount){
        balance += amount;

    }



}
