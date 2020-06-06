package view;

import model.Diretor;
import model.Funcionario;
import model.Gerente;
import service.ControleDeBonificacoes;

public class TestaPrincipal {

	public static void main(String[] args) {
		
		//Criando uma referencia de Funcinario e setando valores nos seus atributos
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Leonardo");
		funcionario.setCpf("11111111111");
		funcionario.setSalario(500.0);
		
		//Criando uma referencia de Gerente e setando valores nos seus atributos gerente herdou os atributos nome,cpf,salario
		
		Gerente gerente = new Gerente();
		gerente.setNome("Ana");
		gerente.setSenha(1234);
		gerente.setCpf("123A");
		gerente.setSalario(1000.0);
		
		//Criando uma referencia de Diretor que extends de Gerente e setando valores nos seus atributos diretor herdou os atributos 
		//nome,cpf,salario da classe Funcionario e senha da classe gerente que herda funcionario
		
		Diretor diretor = new Diretor();
		gerente.setNome("Luis");
		gerente.setSenha(555);
		gerente.setCpf("123L");
		diretor.setSalario(800.0);
		
		//Aqui verificamos que cada metodo da bonificação reescrito tem sua propria regra de negocio e mostra os valores calculado para cada funcionario
		
		System.out.println(funcionario.getBonificacao());
		System.out.println(gerente.getBonificacao());
		System.out.println(diretor.getBonificacao());
		
		//Aqui verificamos quanto foi gasto com bonificações chamando o metodo registra da classe ControleDeBonificações
		//Fazendo uso do polimorfismo
		
		ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		
		cdb.registra(funcionario);
		cdb.registra(gerente);
		cdb.registra(diretor);
		
		System.out.println(cdb.getTotalDeBonificacoes());
	    
	}

}
