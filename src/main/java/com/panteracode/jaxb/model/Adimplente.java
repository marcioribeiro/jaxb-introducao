package com.panteracode.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Adimplentes")
@XmlType(name="Adimplente",propOrder={"quantidade","clientes"})
public class Adimplente {
	@XmlElementWrapper(name="Clientes")
	@XmlElement(name="Pessoa")
	private List<Pessoa> clientes;
	
	@XmlElement(name="quantidade")
	private Integer quantidade;
	
	
	public void setClientes(List<Pessoa> clientes) {
		this.clientes = clientes;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
}
