package boot.include;


import java.util.List;

public interface XmtOrderMapper {
     
	 public  Integer       selectcount(XmtOrder order);
	  
     public void           addOrder(XmtOrder order);
     
     public List<XmtOrder>  selectOrder(XmtOrder order);
     
   //  public List<OR0004>  or0004(XmtOrder order);
     
     
     
     
}
