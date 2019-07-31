package boot.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.HashMap;

@Component
@ConfigurationProperties(prefix = "itmnogroup")
public class ItmNoGroup {
    private String name ;

    private   HashMap<String,String> itmnoGroup ;
    private   HashMap<String,Integer> amtptr ;
    private   HashMap<String,String>  factorEventmapping;
    private   HashMap<String,String>  evacmodel;

    public HashMap<String, String> getFactorEventmapping() {
        return factorEventmapping;
    }

    public void setFactorEventmapping(HashMap<String, String> factorEventmapping) {
        this.factorEventmapping = factorEventmapping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getEvacmodel() {
        return evacmodel;
    }

    public void setEvacmodel(HashMap<String, String> evacmodel) {
        this.evacmodel = evacmodel;
    }

    public HashMap<String, String> getItmnoGroup() {
        return itmnoGroup;
    }

    public void setItmnoGroup(HashMap<String, String> itmnoGroup) {
        this.itmnoGroup = itmnoGroup;
    }

    public HashMap<String, Integer> getAmtptr() {
        return amtptr;
    }

    public void setAmtptr(HashMap<String, Integer> amtptr) {
        this.amtptr = amtptr;
    }
}
