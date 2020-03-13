package in.nit.service;

import java.util.List;

import in.nit.model.Uom;

public interface IUomService {
	Integer saveUom(Uom obj);
	List<Uom> getAllUom();
	void deleteUom(Integer id);

	Uom getOneUom(Integer id);
	void updateUom(Uom ob);
}
