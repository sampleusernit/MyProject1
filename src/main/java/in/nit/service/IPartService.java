package in.nit.service;

import java.util.List;

import in.nit.model.Part;

public interface IPartService {
	Integer savePart(Part obj);
	List<Part> getAllPart();
	void deletePart(Integer id);
	
	Part getOnePart(Integer id);
	void updatePart(Part ob);

}
