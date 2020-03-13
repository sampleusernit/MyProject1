package in.nit.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.nit.dao.IUomDao;
import in.nit.model.Uom;

@Repository
public class UomDaoImpl implements IUomDao{
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUom(Uom obj) {
		return (Integer) ht.save(obj);
	}
	@Override
	public List<Uom> getAllUom() {
		return ht.loadAll(Uom.class);
	}
	@Override
	public void deleteUom(Integer id) {
		ht.delete(new Uom(id));
		
	}
	@Override
	public Uom getOneUom(Integer id) {
		return ht.get(Uom.class, id);
	}
	@Override
	public void updateUom(Uom ob) {
		ht.update(ob);
	}

}
