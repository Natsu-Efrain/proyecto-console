package com.consolecode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.consolecode.model.Persona;
import com.consolecode.repository.IPersonaRepository;
import com.consolecode.service.IPersonaService;
@Service
public class IPersonaServiceImpl implements IPersonaService {

	@Autowired
	IPersonaRepository repo;
	
	
	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Persona registrar(Persona persona) {
		// TODO Auto-generated method stub
		return repo.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		// TODO Auto-generated method stub
		return repo.save(persona);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Persona ListarPorID(Integer codigo) {
		// TODO Auto-generated method stub
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public Page<Persona> listPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return repo.findAll(pageable);
	}

}
