package com.uisrael.Computadoras;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.Computadoras.modelo.entidades.Usuario;
import com.uisrael.Computadoras.servicio.Usuario_Servicio;

@SpringBootTest
class ComputadorasApplicationTests {
	@Autowired //creamos variable para consumir la interfaz
	private Usuario_Servicio servicio;
	@Test
	void contextLoads() {
		//insertar nueva comnptadora al db esto solo es prueba
	Usuario nuevoUsuario = new Usuario();
	nuevoUsuario.setNombre("Prueba 3");
	//servicio.ingresar_usuario(nuevoUsuario);
	nuevoUsuario.setFecha_nacimiento(new Date());
	servicio.ingresar_usuario(nuevoUsuario);
	//Listar
	/*List<Usuario> resultado = servicio.listar_usuario();
	for(Usuario usuario:resultado)
	{
		System.out.println(usuario.getIdusuario()+usuario.getNombre());
	}*/
	}
	

}
