package service;


import boot.include.Bptvchh;
import boot.include.BptvchhMapper;
import boot.pojo.EwaFactor;
import boot.pojo.ItmNoGroup;
import boot.util.SpringU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.beans.VetoableChangeListener;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;

// 填写会计因子，生成会计流水

//@Component
public class AccountModel implements Callable<String> {



//    @Autowired
//    SpringU springU;
//
//    @Autowired
//    BptvchhMapper bptvchhMapper;

    private EwaFactor ewaFactor;

    public AccountModel(EwaFactor ewaFactor) {
        this.ewaFactor = ewaFactor;
    }

    private    void genVwa(  ) throws Exception {

        //ItmNoGroup itmandamt = (ItmNoGroup)Class.forName("boot.pojo.ItmNoGroup").newInstance();
        //Object itmnogroup = springU.getBean("itmnogroup");

        ItmNoGroup itmnogroup = (ItmNoGroup)SpringU.getBean("itmNoGroup");

        HashMap<String,Integer> amtptr = itmnogroup.getAmtptr();
         HashMap<String,String> itmnoGroup = itmnogroup.getItmnoGroup();
         HashMap<String,String> evacmodel = itmnogroup.getEvacmodel();
         HashMap<String,String>  factoreventmap = itmnogroup.getFactorEventmapping();

        String mappingev  = ewaFactor.getmapping();
        String modelno = null;
        // 确定用哪套流水
        for (String  key : factoreventmap.keySet() ) {
            if ( key.equals( ewaFactor.getmapping() )){
                modelno =  factoreventmap.get(key);
                System.out.println(modelno);
            }
        }
        // 确定具体的 抽象传票
        String vch_area = null;
        for (String  key : evacmodel.keySet() ) {
            if (  key.equals( modelno ) ) {
                vch_area =  evacmodel.get(key);
                System.out.println( vch_area );
            }
        }

        // 传票域 按照 / 拆分
        String[] split = vch_area.split("/");
        System.out.println( split );
        // 放入模板框架  2  6 位中
         for( int i= 0; i < split.length -1; i ++){


                 Boolean writesucces = writeVch(split[i], split[i].length());

             if ( split[i].length()  == 6 ){}



         }

    }

    // 将流水写入库表


    private Boolean writeVch(String area , int len  ){
        Bptvchh bptvchh = new Bptvchh();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String formatdate = sdf.format(new Date());
        System.out.println( formatdate);
        bptvchh.setAc_date( formatdate);
        bptvchh.setCi_no( ewaFactor.get_ci_no());
        if (len ==2){
            if(area.substring(0,1).equals("D") ){
                System.out.println("D IS ");
                bptvchh.setDr_sign("D");
            }
            if(area.substring(0,1).equals("C") ){}
            if(area.substring(1,2).equals("N") ){
                bptvchh.setAc_no( ewaFactor.get_ac_no() );
            }
            // gen single vch 在多交易并发的情况下，如何生成不传位的流水号
            // 必须要AI 起单独线程，与应用脱离，防止应用阻塞
            bptvchh.setJrnno("0000001");
            bptvchh.setVchno("0000001");
            bptvchh.setAmt( ewaFactor.get_amt() );

            System.out.println( bptvchh.toString());
            BptvchhMapper bptvchhMapper = (BptvchhMapper)SpringU.getBean("bptvchhMapper");


            bptvchhMapper.addBptvchh(bptvchh);


        }
        return true;

    }

    @Override
    public String call() throws Exception {
        this.genVwa();
        return null;
    }


    // AI 清算



}
