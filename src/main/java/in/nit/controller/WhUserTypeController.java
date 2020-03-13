package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.WhUserType;
import in.nit.service.IWhUserTypeService;

@Controller
@RequestMapping("/whusertype")
public class WhUserTypeController {
	@Autowired
	private IWhUserTypeService service;
	
	@RequestMapping("/register")
	public String showRegPage(WhUserType whUsertype) {
		return "WhUserTypeRegister";
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveWhUserType(@ModelAttribute WhUserType whUsertype,Model model) {
		Integer id=service.saveWhUserType(whUsertype);
		String message="WhUserType'"+id+"'saved";
		model.addAttribute("message", message);
		model.addAttribute("WhUsertype",new WhUserType());
		return "WhUserTypeRegister";
	}
	@RequestMapping("/all")
	public String getAllWhUserType(Model model) {
		List<WhUserType> list = service.getAllWhUserType();
		model.addAttribute("list", list);
		return "WhUserTypeData";
	}
	
	@RequestMapping("/delete")
	public String deleteWhUserType(@RequestParam("sid") Integer id, Model model) {
		service.deleteWhUserType(id);
		String message = "WhUserType'" + id + "'Deleted";
		model.addAttribute("message", message);
		// Fetch new data
		List<WhUserType> list = service.getAllWhUserType();
		model.addAttribute("list", list);
		return "WhUserTypeData";
	}
}
