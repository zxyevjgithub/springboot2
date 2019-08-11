package boot.connAPI;


import boot.Service.AccountModel;
import boot.accountEngin.ThreadImpl;
import boot.include.User;
import boot.pojo.EwaFactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/AC")
public class ACcontroller {


    @Autowired
    ThreadImpl threadimpl;

    @RequestMapping("/{tr_code}")
    public  @ResponseBody  String process(@PathVariable String tr_code) throws Exception {

        System.out.println("MAIN CONTROL BEGIN");

        EwaFactor ewaFactor = new  EwaFactor(true,false,false,"ZZ",
                "CAAC","741000041002",2200l,"4310800","74100050");

        AccountModel accountModel = new AccountModel(ewaFactor);
        threadimpl.exxcute( accountModel);

        System.out.println("MAIN CONTROL END");

        ArrayList<User> objects = new ArrayList();
        objects.add(new User());
        objects.add(new User());
        objects.add(new User());
        objects.add(new User());
        System.out.println( objects.size());


        return "sdfsfs";

    }




}
