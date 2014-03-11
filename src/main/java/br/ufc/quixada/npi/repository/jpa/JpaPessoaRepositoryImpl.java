package br.ufc.quixada.npi.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.repository.PessoaRepository;

@Repository
public class JpaPessoaRepositoryImpl implements PessoaRepository {

	@PersistenceContext
	private EntityManager em;
	
	public void save(Contato c) {
		if (c.getId() == null) {
			em.persist(c);
		} else {
			em.merge(c);
		}
	}

	public List<Pessoa> findAll() {
		return em.createQuery("from Pessoa", Pessoa.class).getResultList();
	}

	public void save(Pessoa p) {
		// TODO Auto-generated method stub
		
	}

}

