package boot.include;

import java.util.List;

public interface XmtEventMapper {
	  public  XmtEvent selectEVTone(XmtEvent xmtevent) throws Exception;
	  public  List<XmtEvent>  selectEvent() throws Exception;
	  public  void updateMaxPeople(XmtEvent xmtevent) throws Exception;
}
