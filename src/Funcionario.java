
public class Funcionario {

	private int numeroRegistro;
	private String nome;
	private String cargo;
	private double salarioBruto;
	
	public Funcionario(int numeroRegistro, String nome, String cargo, double salarioBruto) {
		setNumeroRegistro(numeroRegistro);
		setNome(nome);
		setCargo(cargo);
		setSalarioBruto(salarioBruto);
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double calcularImposto() {
		if(getSalarioBruto() <= 1000) {
			return 0;
		}else if(getSalarioBruto() <= 2000) {
			return 5;
		}else if(getSalarioBruto() <= 4500) {
			return 10;			
		}else {
			return 15;
		}
	}
	
	public String exibirInfo() {
		return "Nome: " + getNome() + "\n" +
			   "Cargo: " + getCargo() + "\n" +
			   "Salario Bruto: " + getSalarioBruto() + "\n" +
			   "Imposto: " + calcularImposto() + " %\n" + 
			   "Salário líquido: " + (salarioBruto = salarioBruto - salarioBruto * (calcularImposto() / 100));
	}
	
	
}
