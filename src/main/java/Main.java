
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int i, flag;
        int nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de pessoas a ser cadastradas:"));
        String Vetpesquisar[] = new String[nelementos];
        for (i = 0; i < nelementos; i++) {
            Vetpesquisar[i] = JOptionPane.showInputDialog("Digite o nome para cadastro:");
        }
        String Eprocurado = JOptionPane.showInputDialog("Digite o nome a ser procurado:");
        flag = 0;
        for (i = 0; i < nelementos; i++) {
            if (Vetpesquisar[i].equalsIgnoreCase(Eprocurado)) {
                JOptionPane.showMessageDialog(null, "O valor procurado foi encontrado na posição " + i);
                flag = 1;
            }
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "o nome não foi encontrado");
        }
    }
}
