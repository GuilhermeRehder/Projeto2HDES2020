package newpackage;

import javax.swing.*;

public class Exercicio0707 {

    public static void main(String args[]) {
        double massa = 0, altura = 0;
        String aux = "";

        try {
            aux = JOptionPane.showInputDialog(null, "Entre com o seu peso (em quilogramas): ", "IMC", JOptionPane.PLAIN_MESSAGE);
            aux = aux.replace(",", ".");
            massa = Double.parseDouble(aux);
            
            aux = JOptionPane.showInputDialog(null, "Entre com a sua altura (em metros): ", "IMC", JOptionPane.PLAIN_MESSAGE);
            aux = aux.replace(",", ".");
            altura = Double.parseDouble(aux);

            if (massa <= 0.5 || altura <= 0.1 ) {
                JOptionPane.showMessageDialog(null, "Peso inválido.", "IMC", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                if (massa / (altura * altura) < 18.5) {
                    JOptionPane.showMessageDialog(null, "Seu IMC é: " + (massa / (altura * altura)) + "\nClassificação: Excesso de Magreza. ", "IMC", JOptionPane.INFORMATION_MESSAGE);
                } else if (massa / (altura * altura) <= 25) {
                    JOptionPane.showMessageDialog(null, "Seu IMC é: " + (massa / (altura * altura)) + "\nClassificação: Peso normal. ", "IMC", JOptionPane.INFORMATION_MESSAGE);
                } else if (massa / (altura * altura) <= 30) {
                    JOptionPane.showMessageDialog(null, "Seu IMC é: " + (massa / (altura * altura)) + "\nClassificação: Excesso de peso. ", "IMC", JOptionPane.INFORMATION_MESSAGE);
                } else if (massa / (altura * altura) <= 35) {
                    JOptionPane.showMessageDialog(null, "Seu IMC é: " + (massa / (altura * altura)) + "\nClassificação: Obesidade (Grau I). ", "IMC", JOptionPane.INFORMATION_MESSAGE);
                } else if (massa / (altura * altura) <= 40) {
                    JOptionPane.showMessageDialog(null, "Seu IMC é: " + (massa / (altura * altura)) + "\nClassificação: Obesidade (Grau II). ", "IMC", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Seu IMC é: " + (massa / (altura * altura)) + "\nClassificação: Obesidade (Grau III). ", "IMC", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException  x){
            JOptionPane.showMessageDialog(null, "Entre apenas com números.", "IMC", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
