package com.uisrael.Computadoras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uisrael.Computadoras.modelo.entidades.Usuario;
@Repository//repositorio de dato o acceso a datos par ala entidad usuario
public interface Usuario_Repositorio extends JpaRepository<Usuario, Integer> {
	

}
