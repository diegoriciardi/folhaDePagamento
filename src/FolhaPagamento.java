import javax.swing.JOptionPane;

public class FolhaPagamento {
	public static void main(String[] args) {
		
		Funcionario funcionarios[] = new Funcionario[10];
		
		funcionarios[0] = new Funcionario(123, "Isidro", "Analista", 10500);
		funcionarios[1] = new Funcionario(456, "Diego", "Técnico Suporte", 997.47);
		funcionarios[2] = new Funcionario(456, "Irene", "Tutor(a)", 9997.83);
		funcionarios[3] = new Funcionario(456, "Paulo", "Arquiteto de dados", 4499.63);
		funcionarios[4] = new Funcionario(456, "Ricardo", "Engenheiro de Software", 12997.63);
		funcionarios[5] = new Funcionario(456, "Thiago", "Trader", 2000);
		funcionarios[6] = new Funcionario(456, "Alex", "Gerente", 209437.18);
		funcionarios[7] = new Funcionario(456, "Arthur", "Superintendente", 30145.76);
		funcionarios[8] = new Funcionario(456, "Heloisa", "Técnico Campo", 2700.92);
		funcionarios[9] = new Funcionario(456, "João", "Severino", 1000);
		
		for(int contador = 0; contador <= funcionarios.length-1; contador++) {
			JOptionPane.showMessageDialog(null, funcionarios[contador].exibirInfo());
			System.out.println();
		}
		
	}
}
