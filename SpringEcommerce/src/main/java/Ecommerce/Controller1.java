package Ecommerce;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.plp.Plp;

@Controller
public class Controller1 {
	@Autowired
	RegisterDao dao;

	@RequestMapping("/register")
	public String showform(Model m) {
		return "register";
	}

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public String save(@ModelAttribute("cus") CustomerDetails cus) {
		dao.save(cus);
		return "Login2";
	}

	@RequestMapping("/Login2")
	public String showform1() {
		return "Login2";
	}

	@RequestMapping("/login")
	public String viewemp(@RequestParam("FirstName") String FirstName, @RequestParam("email") String email,
			HttpServletRequest request) {
		System.out.println(FirstName + " " + email);
		List<CustomerDetails> list = dao.getcustomers(FirstName, email);
		if (list.size()>0) {
			HttpSession session = request.getSession();
			session.setAttribute("username", email);
			session.setAttribute("FirstName", FirstName);
			String msg = "Login successFull";
			System.out.println(msg);
			return "homepage";
		} else {
			String msg = "invalid credentials";
			return "Login2";
		}

	}

	@RequestMapping("/homepage")
	public String show(Model m) {
	String s = "hi controller";
		System.out.println(s);
		return "homepage";
}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/homepage";
	}

	@RequestMapping("/plp")
	public String viewemp(Model m,HttpServletRequest request) {
		List<Plp> list = dao.getproducts();
		m.addAttribute("list", list);
		return "plplist";
	}
	//homepage
//	@RequestMapping(value = "/homepage")
//	public String homepage(Model m, HttpServletRequest request) {
//		String parameter = request.getParameter("id");
//		int id = Integer.parseInt(parameter);
//		List<Plp> h = dao.gethome(id);
//		System.out.println("home"+h);
//		m.addAttribute("command", h);
//		return "homepage";
//	}

//pdpwomen
	@RequestMapping(value = "/pdp")
	public String edit(Model m, HttpServletRequest request) {
		String parameter = request.getParameter("id");
		int id = Integer.parseInt(parameter);
		List<Plp> emp = dao.getProductById(id);
		System.out.println("pdp" + emp);
		m.addAttribute("command", emp);
		return "pdpwomen";
	}

	// pdpmen
	@RequestMapping(value = "/pdp1")
	public String shirtmen(Model m, HttpServletRequest request) {
		String parameter = request.getParameter("id");
		int id = Integer.parseInt(parameter);
		List<Plp> emp = dao.getProductByIdshirt(id);
		System.out.println("pdp1" + emp);
		m.addAttribute("command", emp);
		return "pdpshirt";
	}

//carttableinsert
	@RequestMapping(value = "/cart")
	public String cartTable(HttpServletRequest request) {
		System.out.println("hello");
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("username");
		System.out.println("username" + username);
		if (username != null) {
			String id1 = request.getParameter("id");
			int id = Integer.parseInt(id1);
			String image = request.getParameter("image");
			String name = request.getParameter("name");
			String cost = request.getParameter("cost");
			String description = request.getParameter("description");
			System.out.println("cart +"+image);
			int emp1 = dao.insertintocart(id, image, name, cost, description, username);
			System.out.println("cart" + emp1);
			return "redirect:/homepage";
		} else {
			return "Login2";
		}

	}

	@RequestMapping(value = "/cartlist")
	public String cartlist1(Model m, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("username");
		List<Plp> emp1 = dao.getProductByIdcart(username);
		m.addAttribute("cartli", emp1);
		if (username != null) {
			return "cartlist";
		} else {
			return "Login2";
		}
	}

//ordertable
	@RequestMapping(value = "/order")
	public String orderTable(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("username");
		if (username != null) {
			String id1 = request.getParameter("id");
			int id = Integer.parseInt(id1);
			String image = request.getParameter("image");
			String name = request.getParameter("name");
			String cost = request.getParameter("cost");
			int cost1 = Integer.parseInt(cost);
			String description = request.getParameter("description");
			int emp2 = dao.insertIntoorderById1(id, image, name, cost1, description, username);
			System.out.println("order" + emp2);
			return "redirect:/plp";
		} else {
			return "Login2";
		}
	}

	@RequestMapping(value = "/orderlist")
	public String orderlist1(Model m, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("username");
		List<Plp> emp2 = dao.getProductByIdorder(username);
		System.out.println("order" + emp2);
		if (username != null) {
			m.addAttribute("emp2", emp2);
			return "orderlist";
		} else {

			return "Login2";
		}
	}

//	// plptshirst
//	public String viewmen(Model m) {
//		List<Plp> listmen = dao.gettshirt();
//		System.out.println("tshirt" + listmen);
//		m.addAttribute("listmen", listmen);
//		return "plptshirt";
//	}

	@RequestMapping("/plpmen")
	public String viewshirt(Model m) {
		List<Plp> listtshi = dao.getshirt();
		System.out.println(listtshi);
		m.addAttribute("listtshi", listtshi);
		return "plpmen";

	}
	@RequestMapping("/plptop")
	public String viewtop(Model m) {
		List<Plp> top = dao.gettop();
		System.out.println(top);
		m.addAttribute("top",top);
		return "plptop";

	}
	@RequestMapping(value = "/pdptop")
	public String top(Model m, HttpServletRequest request) {
		String parameter = request.getParameter("id");
		int id = Integer.parseInt(parameter);
		List<Plp> emp = dao.getProductByIdtop(id);
		System.out.println("pdptop" + emp);
		m.addAttribute("top", emp);
		return "pdptop";
	}
//kitchen
	@RequestMapping("/plpkit")
	public String kit(Model m) {
		List<Plp> top = dao.getkit();
		System.out.println(top);
		m.addAttribute("kit",top);
		return "plpkit";

	}
	@RequestMapping(value = "/pdpkit")
	public String kit(Model m, HttpServletRequest request) {
		String parameter = request.getParameter("id");
		int id = Integer.parseInt(parameter);
		List<Plp> emp = dao.getProductByIdkit(id);
		System.out.println("pdpkit" + emp);
		m.addAttribute("kit", emp);
		return "pdpkit";
	}

	// Order confirmation page
	@RequestMapping(value = "/confirmation")
	public String confirmation(Model m, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("username");
		String parameter = request.getParameter("id");
		int id = Integer.parseInt(parameter);
		List<Plp> emp = dao.getcheck(id, username);
		m.addAttribute("command", emp);
		return "orderConformation";
	}

//checkout
	@RequestMapping(value = "/checkout")
	public String checkconfirmation(Model m, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("username");
		String id1 = request.getParameter("id");
		int id = Integer.parseInt(id1);
		System.out.println("Id="+id);
		List<Plp> emp = dao.getcheck(id, username);
		System.out.println("check" + emp);
		m.addAttribute("command", emp);
		int delete = dao.delete(id);

		return "orderConformation";
	}

}
