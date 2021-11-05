import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.text.BadLocationException;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter account number: ");
        Integer numberAccount = sc.nextInt();
        
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        
        System.out.println("Is there na initial deposit (y/n)? ");
        char ansDeposit = sc.next().charAt(0);
        
        Double balance = 0.0;
        
        if(ansDeposit == 'y'){
            System.out.println("Enter initial deposit value: ");
            balance = sc.nextDouble();
            
        } else {

        }
        
        Banco conta1 = new Banco(numberAccount, name, balance);
        System.out.println("Account data: ");
        System.out.println(conta1);
        
        System.out.println("Enter a deposit value: ");
        Double valor = sc.nextDouble();
        
        conta1.deposito(valor);
        System.out.println("Update account data: ");
        System.out.println(conta1);
        
        System.out.println("Enter a withdraw value: ");
        Double valor1 = sc.nextDouble();
        
        conta1.saque(valor1);
        System.out.println("Update account data: ");
        System.out.println(conta1);
        
        
       
    }
}
