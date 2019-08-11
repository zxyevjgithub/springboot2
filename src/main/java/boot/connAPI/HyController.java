package boot.connAPI;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@Transactional
public class HyController implements CommProcessMAV,CommProcessJSON{


        @Override
        @RequestMapping(value = "/hy")
        public ModelAndView process (HttpServletRequest req  ) {
            System.out.println("this is hy");
            ModelAndView mav = new ModelAndView("hy");
            return mav;
        }

        @RequestMapping(value = "/hy/{tr_code}",method = RequestMethod.GET)
        public ModelAndView process_inq(HttpServletRequest req , @PathVariable(value = "tr_code")  String tr_code ) {

            System.out.println("this is hy  inq");

            ModelAndView mav = new ModelAndView("hy"+tr_code);
            return mav;
        }


        @Override
        public String processs() {
            return null;
        }






}
