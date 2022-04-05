import javax.swing.*;

public class Finally {
    public static void main(String[] args) {
        String snum1 = JOptionPane.showInputDialog("Digite o primeiro número!");
        if(snum1 == null){
            System.exit(0);
        }
        String snum2 = JOptionPane.showInputDialog("Digite o segundo número!");

        if(snum2 == null){
            System.exit(0);
        }
        try{
            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);
            JOptionPane.showMessageDialog(null,"Divisão = "+ num1/num2);
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Erro de divisão por 0\n"+ e, "Erro",JOptionPane.WARNING_MESSAGE);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros\n"+ e, "Erro",JOptionPane.WARNING_MESSAGE);

        }
        finally {
            JOptionPane.showMessageDialog(null,"Final de execução");
        }
        System.exit(0);
    }
}
