package com.uisrael.Computadoras.servicio.implementacion;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.Computadoras.modelo.entidades.Usuario;
import com.uisrael.Computadoras.repository.Usuario_Repositorio;
import com.uisrael.Computadoras.servicio.Usuario_Servicio;
@Service
@Component
public class Usuario_ServicioImpl implements Usuario_Servicio {
	@Autowired //implementar la interfaz usuario repositorio
	private Usuario_Repositorio repositorioUsuario;
	@Override
	public void ingresar_usuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		try {
			repositorioUsuario.save(nuevoUsuario);
			
		} catch (Exception e) {
			throw e;
		}
	}
	//metodo listar
	@Override
	public List<Usuario> listar_usuario() {
		
		return repositorioUsuario.findAll();
	}
	//metodo buscar por id
	@Override
	public Usuario buscarUsuario(int idusuario) {
		Optional<Usuario> contenedorOptional = repositorioUsuario.findById(idusuario);
		if(contenedorOptional.isPresent()) 
		{
			return contenedorOptional.get();
		}
		else
		{
			
			throw new NoSuchElementException("NO SE ENCONTRO NINGUN USUARIO CON ESE ID");
		}
				
	}

}
