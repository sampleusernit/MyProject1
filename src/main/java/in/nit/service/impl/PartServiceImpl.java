package in.nit.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nit.dao.IPartDao;
import in.nit.model.Part;
import in.nit.service.IPartService;

@Service
public class PartServiceImpl implements IPartService {
	
	@Autowired
	private IPartDao dao;

	@Transactional
	public Integer savePart(Part obj) {
		return dao.savePart(obj);
	}

	@Override
	public List<Part> getAllPart() {
		List<Part> list=dao.getAllPart();
		return list;
	}

	@Transactional
	public void deletePart(Integer id) {
		dao.deletePart(id);
	}

	@Transactional
	public Part getOnePart(Integer id) {
		return dao.getOnePart(id);
	}

	@Transactional
	public void updatePart(Part ob) {
		dao.updatePart(ob);
		
	}

}
