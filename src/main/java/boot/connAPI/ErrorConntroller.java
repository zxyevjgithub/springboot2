package boot.connAPI;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

// CONTROLLER 增强
@ControllerAdvice
public class ErrorConntroller {



    @ExceptionHandler(RuntimeException.class)
    public ModelAndView runErrExcep(Exception e, HttpServletRequest req)  throws Exception
    {
        ModelAndView error1 = new ModelAndView("error1");
        error1.addObject("url",req.getRequestURL());
        error1.addObject("err",e);
        return  error1;
    }
}
