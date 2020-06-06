package herancaReescritaPolimorfismoCaelum;

public class Gerente extends Funcionario{
	
	private int senha;
    private int numeroDeFuncionariosGerenciados;
        
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
	
	public boolean autenticaCpf(String cpf) {
        if (this.cpf == cpf) {
            System.out.println("CPF Permitido!");
            return true;
        } else {
            System.out.println("CPF Negado!");
            return false;
        }
    }
	
	//Gerente herdou o método getBonificações do gerente e reescreveu com sua propria regra de negocio
	@Override
	public double getBonificacao() {
		 return this.salario * 0.15;
    }

}
