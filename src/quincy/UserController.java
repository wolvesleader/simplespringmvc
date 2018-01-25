package quincy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 * 怎么找到对应的controller 
 * 怎么找到controller中的具体的方法
 * @author quincy
 *
 */
@Controller
public class UserController{

	@RequestMapping(value ="index",method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response, User user12, Person person, String keywords){
		System.out.println(user12);
		return "helloword";
	}


}
