package com.consolecode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consolecode.model.Pais;
import com.consolecode.repository.IPaisRepository;
import com.consolecode.service.IPaisService;
@Service
public class IPaisServiceImpl implements IPaisService{

	@Autowired
	IPaisRepository repo;
	
	@Override
	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Pais registrar(Pais pais) {
		// TODO Auto-generated method stub
		return repo.save(pais);
	}

	@Override
	public Pais actualizar(Pais pais) {
		// TODO Auto-generated method stub
		return repo.save(pais);
	}

	@Override
	public void eliminar(Integer codigo) {
		// TODO Auto-generated method stub
		repo.deleteById(codigo);
		
	}

	@Override
	public Pais ListarPorID(Integer codigo) {
		// TODO Auto-generated method stub
		return repo.findById(codigo).orElse(null);
	}

}
