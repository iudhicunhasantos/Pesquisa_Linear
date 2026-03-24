
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
        i = 0;
        while ((i < nelementos) && (flag != 1)) {
            if (Vetpesquisar[i].equalsIgnoreCase(Eprocurado)) {
                JOptionPane.showMessageDialog(null, "O valor encontrado foi encontrado na posição " + i);
                flag = 1;
            }
            ++i;
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(null, "O nome não foi encontrado");
        }
    }

}
