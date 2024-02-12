package model;
// Generated 8 ene 2024 17:43:18 by Hibernate Tools 6.3.1.Final

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Javier Marcos Cobaleda
 */
/**
 * Videojuegos generated by hbm2java
 */
public class Videojuegos implements java.io.Serializable {

	private Integer id;
	private String titulo;
	private String genero;
	private String plataforma;
	private String consola;
	private Date fechaSalida;
	private String edicion;
	private int valoracion;
	private Set coleccions = new HashSet(0);
        /**
         * Constructor sin parámetros
         */
	public Videojuegos() {
	}
        /**
         * Constructor con parámetros
         * @param titulo
         * @param genero
         * @param plataforma
         * @param consola
         * @param fechaSalida
         * @param edicion
         * @param valoracion
         * @param coleccions 
         */
	public Videojuegos(String titulo, String genero, String plataforma, String consola, Date fechaSalida,
			String edicion, int valoracion, Set coleccions) {
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.consola = consola;
		this.fechaSalida = fechaSalida;
		this.edicion = edicion;
		this.valoracion = valoracion;
		this.coleccions = coleccions;
	}
        //Getters y setters
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getConsola() {
		return this.consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public Date getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getEdicion() {
		return this.edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Set getColeccions() {
		return this.coleccions;
	}

	public void setColeccions(Set coleccions) {
		this.coleccions = coleccions;
	}

}
