package org.modelo.persona;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Persona implements Serializable{
	private Integer id;
	private String nombre;
	private String telefono;
	
	//SUPER CLASS
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	//FIELDS DE TODOS
	public Persona(Integer id, String nombre, String telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	@Id
	@GeneratedValue
	
	//GETTERS AND SETTERS DE TODOS

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	


}
