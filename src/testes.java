import javax.swing.*;
import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        String resposta = JOptionPane.showInputDialog("teste: ");
        if (resposta != null) {
            System.out.println("finish");
        } else {
            System.out.println(resposta);
        }
    }

}
