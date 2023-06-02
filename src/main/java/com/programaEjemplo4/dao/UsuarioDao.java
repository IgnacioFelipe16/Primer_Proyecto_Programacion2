package com.programaEjemplo4.dao;
import java.util.List;

import com.programaEjemplo4.model.Usuario;

import jakarta.transaction.Transactional;

@Transactional								//Mejora la comunicación con la base de datos. Fue necesario inyectar una dependencia en pom.xml
public interface UsuarioDao {
	//EN ESTA INTERFACE SE DEFINEN LOS MÉTODOS (pero no se implementan)
	
	List<Usuario> obtenerUsuarios();

}
