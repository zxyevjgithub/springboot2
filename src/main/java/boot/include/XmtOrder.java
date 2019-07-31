package boot.include;

import java.io.Serializable;

public class XmtOrder implements Serializable{
   private long order_id;
   private long cus_id;
   private long event_id;
   private String order_sts;
   private String   time_stmp;
   
   

public XmtOrder(long cus_id) {
	super();
	this.cus_id = cus_id;
}
public XmtOrder() {
	super();
}
public XmtOrder(long order_id, long cus_id, long event_id, String order_sts) {
	super();
	this.order_id = order_id;
	this.cus_id = cus_id;
	this.event_id = event_id;
	this.order_sts = order_sts;
}
public XmtOrder(long order_id, long cus_id, long event_id, String order_sts, String time_stmp) {
	super();
	this.order_id = order_id;
	this.cus_id = cus_id;
	this.event_id = event_id;
	this.order_sts = order_sts;
	this.time_stmp = time_stmp;
}
@Override
public String toString() {
	return "XmtOrder [order_id=" + order_id + ", cus_id=" + cus_id + ", event_id=" + event_id + ", order_sts="
			+ order_sts + ", time_stmp=" + time_stmp + "]";
}
public long getOrder_id() {
	return order_id;
}
public void setOrder_id(long order_id) {
	this.order_id = order_id;
}
public long getCus_id() {
	return cus_id;
}
public void setCus_id(long cus_id) {
	this.cus_id = cus_id;
}
public long getEvent_id() {
	return event_id;
}
public void setEvent_id(long event_id) {
	this.event_id = event_id;
}
public String getOrder_sts() {
	return order_sts;
}
public void setOrder_sts(String order_sts) {
	this.order_sts = order_sts;
}
   
    
   
  
   
   
   
   
   
}
