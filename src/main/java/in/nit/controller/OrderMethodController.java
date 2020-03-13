package in.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.nit.model.OrderMethod;
import in.nit.service.IOrderMethodService;

@Controller
@RequestMapping("/ordermethod")
public class OrderMethodController {
	
	@RequestMapping("/register")
	public String showRegPage(OrderMethod orderMethod) {
		return "OrderMethodRegister";
	}
	
	@Autowired
	private IOrderMethodService service;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveOrder(@ModelAttribute OrderMethod orderMethod, Model model) {
		Integer id = service.saveOrderMethod(orderMethod);
		String message = "OrderMethod'" + id + "'saved";
		model.addAttribute("message", message);
		model.addAttribute("orderMethod",new OrderMethod());
		return "OrderMethodRegister";
	}
	@RequestMapping("/all")
	public String getAllOrderMethod(Model model) {
		List<OrderMethod> list = service.getAllOrderMethod();
		model.addAttribute("list", list);
		return "OrderMethodData";
	}
	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid") Integer id, Model model) {
		service.deleteOrderMethod(id);
		String message = "Order'" + id + "'Deleted";
		model.addAttribute("message", message);
		// Fetch new data
		List<OrderMethod> list = service.getAllOrderMethod();
		model.addAttribute("list", list);
		return "OrderMethodData";
	}

	@RequestMapping("/edit")
	public String ShowEditPage(@RequestParam("sid") Integer id, Model model) {
		OrderMethod om=service.getOneOrderMethod(id);
		model.addAttribute("OrderMethod", om);
		return "OrderMethodEdit";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateOrder(@ModelAttribute OrderMethod orderMethod, Model model) {
		service.updateOrderMethod(orderMethod);
		String message="OrderMethod '"+orderMethod.getOrderId()+"' updated";
		model.addAttribute("message", message);
		// Fetch new data
		List<OrderMethod> list = service.getAllOrderMethod();
		model.addAttribute("list", list);
		return "OrderMethodData";
	}
	
	@RequestMapping("/view")
	public String showOneShipment(@RequestParam("sid") Integer id, Model model) {
		OrderMethod om=service.getOneOrderMethod(id);
		model.addAttribute("ob", om);
		return "OrderMethodView";
	}
}
