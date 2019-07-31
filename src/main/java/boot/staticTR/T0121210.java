package boot.staticTR;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.Date;

// 交易描述  交易不能设计成多例，否则并发太多内存会被撑爆，可以这样设计。
//  多线程

public class T0121210 implements Cloneable {
    public  static  final   String tr_code = "0121210";
    public  static  final   String tr_name =  "full redemption";
    public  static  Date eff_date ;
    public  static  Date end_date ;
    public  static  final  String run_mode = "D";


    public  String  process( String  inPut){
        //前端交易组包
        I0121210 input0121210 = JSONObject.parseObject(  inPut,I0121210.class);
        System.out.println( input0121210.toJSONString());

        I0121210.IAccount iAccount = input0121210.getiAccount();
        System.out.println( iAccount);
        iAccount.setAc_no("741000231001");
        BigDecimal bigDecimal = new BigDecimal(0.999);


        input0121210.setRate(bigDecimal);

        return   "aaaa" ;

    }

}
