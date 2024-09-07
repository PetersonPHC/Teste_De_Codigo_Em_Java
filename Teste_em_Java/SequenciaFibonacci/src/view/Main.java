package view;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int numeroInserido = Integer
                .parseInt(JOptionPane.showInputDialog(null, "insira o valor desejado ", "ENTRADA", -1));

        if (pertenceAFibonacci(numeroInserido)) {
            JOptionPane.showMessageDialog(
                    null, "O número inserido PERTENCE à sequência de Fibonacci.", "RESULTADO", -1);
        } else {
            JOptionPane.showMessageDialog(
                    null, "O número inserido NÃO PERTENCE à sequência de Fibonacci.", "RESULTADO", -1);
        }

    }

    public static boolean pertenceAFibonacci(int numero) {
        int numero1 = 0;
        int numero2 = 1;

        if (numero == numero1 || numero == numero2) {
            return true;
        }

        int proximo = numero1 + numero2;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }

            numero1 = numero2;
            numero2 = proximo;
            proximo = numero1 + numero2;
        }
        return false;
    }
}