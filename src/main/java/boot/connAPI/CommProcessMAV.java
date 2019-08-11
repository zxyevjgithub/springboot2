package boot.connAPI;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public interface CommProcessMAV {
    public ModelAndView process(HttpServletRequest req);
}
