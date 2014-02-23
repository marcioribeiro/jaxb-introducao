package com.panteracode.jaxb.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.panteracode.jaxb.model.Adimplente;
import com.panteracode.jaxb.model.Pessoa;

public class GerarXMlClientes {

	public static void main(String[] args) throws JAXBException{
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		Adimplente adimplentes = new Adimplente();
		
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Primeira pessoa");
		p1.setEndereco("Endereço primeira pessoa");
		p1.setFone("(11)1111-1111");
		p1.setEmail("p1@p1.com");
		pessoas.add(p1);

		Pessoa p2 = new Pessoa();
		p2.setNome("Segunda pessoa");
		p2.setEndereco("Endereço segunda pessoa");
		p2.setFone("(22)2222-2222");
		p2.setEmail("p2@p2.com");
		pessoas.add(p2);		
		
		adimplentes.setQuantidade(pessoas.size());
		adimplentes.setClientes(pessoas);
		
		JAXBContext context = JAXBContext.newInstance(Adimplente.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		mar.marshal(adimplentes, new File("clientes.xml"));
	}
}

