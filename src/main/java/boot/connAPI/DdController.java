package boot.connAPI;


import boot.Service.AccountModel;
import boot.include.User;
import boot.include.UserMapper;
import boot.pojo.EwaFactor;
import boot.pojo.ItmNoGroup;
import boot.util.SpringU;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

@RestController

@RequestMapping("/DD")
public class DdController {
    //@Autowired
    //T0121210 t0121210; //注册交易实体
    @Autowired
    ItmNoGroup aaa;

    @Autowired
    AccountModel accountModel;

    @Autowired
    SpringU springU;

    @Autowired
    UserMapper userMapper;


    @RequestMapping("/")
    public @ResponseBody  String root(){
           return "error" ;
    }


    @RequestMapping(value = "/{tr_code}",method = RequestMethod.POST)
    public @ResponseBody  String process(@PathVariable String tr_code, HttpServletRequest req) throws Exception {
           String tmpnamei = "i"+tr_code;
           String tmpnameI = "I" + tr_code;
           System.out.println(tmpnamei);


        List<User> users = userMapper.selectUser();


        Class<?> forName = null;
        try {
            forName = Class.forName("boot.staticTR." + tmpnameI);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
          //springU.getBean(tmpnamei, forName);//获取交易输入区数据结构
        //System.out.println(   springU.getBean(tmpnamei, forName)      );
        //根据前端交易码，自动装配


             StringBuffer jb = new StringBuffer();
             String line = null;
             try {
                 BufferedReader reader = req.getReader();
             while ((line = reader.readLine()) != null)
                jb.append(line);
             } catch (Exception e) { /*report an error*/ }

            System.out.println(  jb);


             //google 的GSON解析，不能自动解析内层嵌套
             Gson gson = new Gson();
            Object o;  // 如何转型？
            o =   gson.fromJson(jb.toString(), forName);
             System.out.println(o.toString());
          // ali fastjson  可以自动解析内层嵌套， 牛逼！

        //得到了input数据包
        JSONAware jsonObject = JSONObject.parseObject(jb.toString());

        // 可以取出节点对象 ，后面如果要转array 就在继续转array
        //JSONObject iAccount = jsonObject.getJSONObject("IAccount");

        // new 交易主处理
        String  tmt = "T" + tr_code;
        Object obj =  Class.forName("boot.staticTR."+tmt).newInstance();
        System.out.println(  Class.forName("boot.staticTR."+tmt).newInstance() );

        Annotation[] declaredAnnotations = Class.forName("boot.staticTR." + tmt).getDeclaredAnnotations();
        System.out.println(  declaredAnnotations );
        Class<? extends Class> aClass = Class.forName("boot.staticTR." + tmt).getClass();
        System.out.println( aClass);
        //反射获取方法
        Method process1 = Class.forName("boot.staticTR." + tmt).getMethod("process", String.class);
        String  ot_pgm_back  = (String) process1.invoke(obj, jb.toString());

        System.out.println( "TRcation back = " +  ot_pgm_back);
        // 程序只有一个怎么保证
        //String process = t0121210.process(jb.toString() );

       // AccountModel accountModel = new AccountModel();
          EwaFactor ewaFactor = new  EwaFactor(true,false,false,"ZZ",
                  "CAAC","741000041002",2200l,"4310800","74100050");
        accountModel.genVwa(ewaFactor,aaa);


//        JsonReader reader = new JsonReader(new StringReader(jb.toString()));
//         try {
//             reader.beginObject();
//                while (reader.hasNext() ){
//                    String tmp = reader.nextName();
//                    if(tmp.equals("IAccount")){
//                        reader.beginObject();
//                        while ( reader.hasNext()){
//                            if ( reader.nextString().equals("ac_no") ){
//                                System.out.println("sfsdfsdfs");
//                            }
//                            if ( reader.nextString().equals("prd_cd") ){
//                                System.out.println("sfsdfsdfs");
//                            }
//                            if ( reader.nextString().equals("ccy") ){
//                                System.out.println("sfsdfsdfs");
//                            }
//                        }
//                        reader.endObject();
//                    }
//                    if(tmp.equals("ICino")){}
//
//
//                }
//
//
//
//             reader.endObject();
//         }catch ( RuntimeException e){
//
//             e.printStackTrace();
//         }








        //String msg = tr.pprocess();
        return "SFSFS";
    }

}



