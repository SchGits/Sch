package sch.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sch.dao.EDao;
import sch.vo.EmpLoyee;
import sch.vo.WorkHistory;
@Controller
public class Ehandler {

	@Autowired
	EDao dao;
	
	@RequestMapping("Eall")
	public ModelAndView Eall() {
		ModelAndView view=new ModelAndView();
		List<EmpLoyee> eall = dao.Eall();
		System.out.println(eall);
//		List<WorkHistory> wall = dao.Wall();
		view.addObject("eall", eall);
//		view.addObject("wall", wall);
		view.setViewName("mian");
		return view;
	}
	
	
	@RequestMapping("DD")
	public ModelAndView DD(Integer eno) {
		EmpLoyee dd = dao.DD(eno);
		ModelAndView view=new ModelAndView();
		view.addObject("dd", dd);
		view.setViewName("diaodong");
		return view;
	}
	
	@RequestMapping("QQ")
	public String QQ(WorkHistory workHistory) {
		dao.QQ(workHistory);
		return "redirect:Eall.sch";
	}
	
	
	
	
	
	
	
}
