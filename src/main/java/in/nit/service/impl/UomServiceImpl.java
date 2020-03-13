package in.nit.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IUomDao;
import in.nit.model.Uom;
import in.nit.service.IUomService;

@Service
public class UomServiceImpl implements IUomService {
	
	@Autowired
	private IUomDao dao;

	@Transactional
	public Integer saveUom(Uom obj) {
		return dao.saveUom(obj);
	}

	@Override
	public List<Uom> getAllUom() {
		List<Uom> list=dao.getAllUom();
		return list;
	}

	@Transactional
	public void deleteUom(Integer id) {
		dao.deleteUom(id);	
	}

	@Transactional
	public Uom getOneUom(Integer id) {
		return dao.getOneUom(id);
	}

	@Transactional
	public void updateUom(Uom ob) {
		dao.updateUom(ob);
	}
}
