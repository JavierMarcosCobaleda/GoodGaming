package model;
// Generated 8 ene 2024 17:43:18 by Hibernate Tools 6.3.1.Final

/**
 * Coleccion generated by hbm2java
 */
public class Coleccion implements java.io.Serializable {

	private ColeccionId id;
	private Videojuegos videojuegos;
	private Usuarios usuarios;
	private Boolean poseido;
	private Boolean deseado;

	public Coleccion() {
	}

	public Coleccion(ColeccionId id, Videojuegos videojuegos, Usuarios usuarios, Boolean poseido, Boolean deseado) {
		this.id = id;
		this.videojuegos = videojuegos;
		this.usuarios = usuarios;
		this.poseido = poseido;
		this.deseado = deseado;
	}

	public ColeccionId getId() {
		return this.id;
	}

	public void setId(ColeccionId id) {
		this.id = id;
	}

	public Videojuegos getVideojuegos() {
		return this.videojuegos;
	}

	public void setVideojuegos(Videojuegos videojuegos) {
		this.videojuegos = videojuegos;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Boolean getPoseido() {
		return this.poseido;
	}

	public void setPoseido(Boolean poseido) {
		this.poseido = poseido;
	}

	public Boolean getDeseado() {
		return this.deseado;
	}

	public void setDeseado(Boolean deseado) {
		this.deseado = deseado;
	}

}
