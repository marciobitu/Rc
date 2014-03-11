package br.ufc.quixada.npi.ui;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.model.Pessoa;
import br.ufc.quixada.npi.service.ContatoService;
import br.ufc.quixada.npi.service.PessoaService;

public class Main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ContatoService cs = (ContatoService)ctx.getBean("contatoServiceImpl");
		PessoaService ps = (PessoaService)ctx.getBean("pessoaServiceImpl");
		try {
			ps.insere();
			cs.insere();
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}
		
		List<Contato> l = cs.findAll();
		List<Pessoa> p =  ps.findAll();
				
		for (Contato c : l) {
	    	System.out.println(c);
	    }
		
		for (Pessoa pes : p) {
	    	System.out.println(pes);
	    }
		ctx.close();
	}
	
}
