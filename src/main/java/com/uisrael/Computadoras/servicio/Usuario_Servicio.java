package com.uisrael.Computadoras.servicio;

import java.util.List;

import com.uisrael.Computadoras.modelo.entidades.Usuario;
//metodos para ingresar listar etc
public interface Usuario_Servicio {
	public void ingresar_usuario(Usuario nuevoUsuario);
	public List<Usuario> listar_usuario();
	public Usuario buscarUsuario(int idusuario);

}
