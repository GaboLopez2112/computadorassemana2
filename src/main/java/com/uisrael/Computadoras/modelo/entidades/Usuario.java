package com.uisrael.Computadoras.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
/*Entity es una anotacion que pertenece a jpa. he indica que esta clase va aser una entidad en una bd*/
@Entity
@Data//Data sirve para generar automaticamentes getters y setter
@Table(name="tb_usuario") //dar un nombre por primera ves a ala tabla en este caso se llamara Usuario//tener en cuenta que la clase creada abajo no es lo mismo que dar el nombre a una tabla, necesariamente esta anotacion es para crear el nombre de la tabla
//(name="tb_usuario") se le el nombre a la anotacion @Table con el parametro "name"
public class Usuario implements Serializable{    /*(implements Serializable SIRVE PARA ENCRIPTARLOS DATOS DE UNA TABLA)*/
	private static final long serialVersionUID= 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//clave primario se va a genrar automaticamente 1:1
	@Column(name="id_usu") //column marca al atributo como una columna en db
	private int idusuario;
	@Column(name="nombre_usu")
	private String nombre;
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
}
