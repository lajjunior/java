package universidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CarroController {
	EntityManagerFactory emf;
	EntityManager em;
	
	public CarroController() {
		emf = Persistence.createEntityManagerFactory("carro");
		em = emf.createEntityManager();
	}
	
	public void salvar(Carro _carro) {
		em.getTransaction().begin();
		em.merge(_carro);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Carro _carro) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("DELETE carros FROM carros where id = 2");
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
	public void selecionar(Carro _carro) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("DELETE carros FROM carros where  ="+_carro.getNome());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
}
