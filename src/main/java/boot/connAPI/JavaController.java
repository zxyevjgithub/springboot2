package boot.connAPI;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController

public class JavaController implements CommProcessMAV,CommProcessJSON{

    @Override
    @RequestMapping(value = "/java",method = RequestMethod.GET)
    public ModelAndView process(HttpServletRequest req) {
        System.out.println("this is java");
        ModelAndView mav = new ModelAndView("java");
        return mav;
    }


    @Override
    public String processs() {
        return null;
    }
}
