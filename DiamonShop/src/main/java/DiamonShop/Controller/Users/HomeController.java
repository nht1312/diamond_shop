package DiamonShop.Controller.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dao.SlidesDao;
import DiamonShop.Service.Users.HomeServiceImpl;

@Controller
public class HomeController {
	@Autowired
	HomeServiceImpl HomeService;
	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("users/index");
		mv.addObject("slides", HomeService.GetDataSlide());
		return mv;
	}
	
	@RequestMapping(value = "/product")
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("users/product");
		return mv;
	}
}
