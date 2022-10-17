package universidade;

public class ConsultaBanco {

	public static void main(String[] args) {
		
		Carro a1 = new Carro();
		a1.setMarca("Chevrolet");
		a1.setAnoFabricacao("2015");
		a1.setNome("Onix");
		
		Carro a2 = new Carro();
		a2.setMarca("Fiat");
		a2.setAnoFabricacao("2013");
		a2.setNome("Palio");
		
		CarroController con = new CarroController();
		
		con.salvar(a2);
	}

}
