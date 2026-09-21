
import javax.swing.JOptionPane;
public class principal {
    public static void main(String[] args) {
        double numero, metade, dobro;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um núemero: "));
        if (numero > 10){
            metade = numero / 2;
            JOptionPane.showMessageDialog(null,"A metade é: " + metade);
        }else{ dobro = numero * 2;
        JOptionPane.showMessageDialog(null, "O dobro é: " + dobro);
        }
    }
}
