package com.programaEjemplo4.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.programaEjemplo4.model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
	

@Repository									//Le agrega las caracterÍsiticas necesarias para trabajar con una base de datos.
@Transactional								//Mejora la comunicación con la base de datos. Fue necesario inyectar una dependencia en pom.xml
public class UsuarioDaoImp implements UsuarioDao{
	//ACÁ SE IMPLEMENTAN LOS MÉTODOS DE LA INTERFACE UsuarioDao. Obligatoriamente se deben implementar todos los métodos de la interface.
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Usuario> obtenerUsuarios() {
		String query="from Usuario";
		return entityManager.createQuery(query).getResultList();
	}

}
