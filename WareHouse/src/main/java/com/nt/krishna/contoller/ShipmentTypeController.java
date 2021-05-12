package com.nt.krishna.contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.krishna.model.ShipmentType;
import com.nt.krishna.service.IShipmentTypeService;


@Controller
@RequestMapping("/st")
public class ShipmentTypeController {
	@Autowired
  private IShipmentTypeService service;
	@GetMapping("/register")
	public String register() {
		 return "ShipmentTypeRegister"; 
	//return "index";
	} 
	
	 // 2 .on click submit (save ShipmentType Data)
	@PostMapping("/save")
	public String  ControlShipmentType(
			@ModelAttribute ShipmentType st,Model model) {
		System.out.println(st.toString());
		System.out.println(model.getClass().getName());    //comment
		Integer id=service.SaveShipmentType(st);
		String msg="ShipmentType created    "+id+ "      is created";
		
		model.addAttribute("msg", msg);
		return "ShipmentTypeRegister";
	}
	              
	//3.ShipmentType Fetch Data
	@GetMapping("/all")
	public String fetchShipmentType(Model model) {
		//using service obj
		List<ShipmentType> list=service.getAllShipmentTypes();
		//placing data in model obj
		model.addAttribute("list", list);
		return "ShipmentTypedata";
		
	}
	//4.deleting shipmentType 
	@GetMapping("/delete")
	public String deleteShipmentType(@RequestParam(name = "id") Integer id,
			                                                                            Model model,RedirectAttributes rd  ) {
		String msg=service.deleteShipmentTypeById(id);
		model.addAttribute("msg",msg);
		rd.addFlashAttribute("msg", msg);
		return  "redirect:all";
	}
	//5.edit operation
	@GetMapping("/edit")
	public String editShipmentType(@RequestParam Integer id,Model model) {
		System.out.println("///////////////////");  //trace method
		ShipmentType st=service.editShipmentType(id);
		System.out.println(st.toString());
		model.addAttribute("shipmentType", st);
		
		return "ShipmentTypeEdit";
	}
}
