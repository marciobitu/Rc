package br.ufc.quixada.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.repository.ContatoRepository;
import br.ufc.quixada.npi.repository.PessoaRepository;

	@Service
	public class PessoaServiceImpl implements PessoaService {

		@Autowired
		private PessoaRepository pessoaRepository;

		public PessoaServiceImpl() {
		}
		
		@Transactional
		public void insere() {
			pessoaRepository.save(new Pessoa("João", "Carvalho"));
			pessoaRepository.save(new Pessoa("Maria", "França"));
			pessoaRepository.save(new Pessoa("bitu", "França"));
		}

		public List<Pessoa> findAll() {
			List<Pessoa> p = pessoaRepository.findAll();
			return p;
		}

	}



