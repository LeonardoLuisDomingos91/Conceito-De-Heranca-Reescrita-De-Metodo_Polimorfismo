package service;

import herancaReescritaPolimorfismoCaelum.Funcionario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	// esse método espera um Funcionario como argumento como gerente é um funcionario e Diretor tambem é um funcionario 
	// e os dois implementaram o método getBonificações é possivel fazer o uso do polimorfismo
	
    public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }

}
