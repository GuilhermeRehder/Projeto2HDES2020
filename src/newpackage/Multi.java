package newpackage;

import javax.swing.*;

public class Multi {
    public static void main (String args[]) {
        double num1 = 0, num2 = 0, resul = 0;
        String aux = "";
        
        aux = JOptionPane.showInputDialog(null, "Entre com um valor: ");
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Entre com um segundo valor: ");
        num2 = Double.parseDouble(aux);
        
        //resul = num1 + num2;
        resul = PrimeiroMetodo.multiValor(num1, num2);
        
        JOptionPane.showMessageDialog(null, "Resultado da multiplicação dos dois valores é: " + resul);
    }
}
