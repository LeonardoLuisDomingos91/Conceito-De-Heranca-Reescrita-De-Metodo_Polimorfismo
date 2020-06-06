package herancaReescritaPolimorfismoCaelum;

public class Diretor extends Gerente{
	
	//Diretor herdou o método getBonificações do gerente e reescreveu com sua propria regra de negocio
	@Override
	public double getBonificacao() {
		 return this.salario * 0.10;
    }

}
