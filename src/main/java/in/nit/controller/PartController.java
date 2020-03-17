package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.Part;
import in.nit.service.IPartService;

@Controller
@RequestMapping("/part")
public class PartController {
	
	@RequestMapping("/register")
	public String showPart(Part part) {
		return "PartRegister";
	}
	
	@Autowired
	private IPartService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String savePart(@ModelAttribute Part part,Model model) {
		Integer id=service.savePart(part);
		String message="Part "+id+ "saved";
		model.addAttribute("message",message);
		model.addAttribute("part",new Part());
		return "PartData";
	}
	
	@RequestMapping("/all")
	public String getAllPart(Model model) {
		List<Part> list = service.getAllPart();
		model.addAttribute("list", list);
		return "PartData";
	}
	
	@RequestMapping("/delete")
	public String deletePart(@RequestParam("sid") Integer id, Model model) {
		service.deletePart(id);
		String message = "Part'" + id + "'Deleted";
		model.addAttribute("message", message);
		// Fetch new data
		List<Part> list = service.getAllPart();
		model.addAttribute("list", list);
		return "PartData";
	}
	
	@RequestMapping("/edit")
	public String ShowEditPage(@RequestParam("sid") Integer id, Model model) {
		Part p=service.getOnePart(id);
		model.addAttribute("Part", p);
		return "PartEdit";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateOrder(@ModelAttribute Part part, Model model) {
		service.updatePart(part);
		String message="Part '"+part.getPartId()+"' updated";
		model.addAttribute("message", message);
		// Fetch new data
		List<Part> list = service.getAllPart();
		model.addAttribute("list", list);
		return "PartData";
	}
	
	@RequestMapping("/view")
	public String showOneShipment(@RequestParam("sid") Integer id, Model model) {
		Part p=service.getOnePart(id);
		model.addAttribute("ob", p);
		return "PartView";
	}

	
}
