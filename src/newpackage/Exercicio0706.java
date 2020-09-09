package newpackage;

import javax.swing.*;

public class Exercicio0706 {

    public static void main(String args[]) {
        double salario = 0;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog(null, "Entre com o seu salário: ", "INSS", JOptionPane.PLAIN_MESSAGE);
            aux = aux.replace(",", ".");
            salario = Double.parseDouble(aux);

            if (salario < 465) {
                JOptionPane.showMessageDialog(null, "Alíquota não aplicada neste valor.", "INSS", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else if (salario <= 965.67) {
                JOptionPane.showMessageDialog(null, "Salário: " + salario + "\nAlíquota aplicável: 8.0\nValor do desconto: " + salario * 0.08 + "\nValor líquido após o desconto: " + (salario * 0.92), "INSS", JOptionPane.INFORMATION_MESSAGE);
            } else if (salario <= 1609.45) {
                JOptionPane.showMessageDialog(null, "Salário: " + salario + "\nAlíquota aplicável: 9.0\nValor do desconto: " + salario * 0.09 + "\nValor líquido após o desconto: " + (salario * 0.91), "INSS", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if ((salario * 0.11) < 354.47) {
                    JOptionPane.showMessageDialog(null, "Salário: " + salario + "\nAlíquota aplicável: 11.0\nValor do desconto: " + salario * 0.11 + "\nValor líquido após o desconto: " + (salario * 0.89), "INSS", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Salário: " + salario + "\nAlíquota aplicável: 11.0\nValor do desconto: 354.47\nValor líquido após o desconto: " + (salario - 354.47), "INSS", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException  x){
            JOptionPane.showMessageDialog(null, "Entre apenas com números.", "INSS", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
