import javax.swing.*;
public class Main {
    public static void main(String[] args) {
       int choice = JOptionPane.showConfirmDialog(null, "Fressword Nierator - gerador de senhas. \n\t Deseja gerar uma?", "Fressword Nierator - A password generator", 0);
       if (choice == 0) {
           JOptionPane.showMessageDialog(null, "sua senha: " + Randomizer.main(args));
       } else {
           JOptionPane.showMessageDialog(null, "Obrigado por usar Fressword Nierator!");
       }
    }
    }