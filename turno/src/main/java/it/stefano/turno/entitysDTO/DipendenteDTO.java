package it.stefano.turno.entitysDTO;

import it.stefano.turno.entitys.Mansione;

public class DipendenteDTO {
	private Long id;
	private String nome;
	private String cognome;
	private Mansione mansione;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Mansione getMansione() {
		return mansione;
	}
	public void setMansione(Mansione mansione) {
		this.mansione = mansione;
	}
	
	
}
