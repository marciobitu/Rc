package br.ufc.quixada.npi.repository;

import java.util.List;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Pessoa;

public interface ContatoRepository {

	public abstract void save(Contato c);

	public abstract List<Contato> findAll();
	
}