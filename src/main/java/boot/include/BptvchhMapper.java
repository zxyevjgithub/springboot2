package boot.include;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BptvchhMapper {

    @Insert("insert into bptvchh (ac_date,ac_no,ci_no,vchno,jrnno,amt,tr_br) " +
     " value( #{ac_date},#{ac_no},#{ci_no} ,#{vchno},#{jrnno},#{amt},#{tr_br})")
    public void addBptvchh() ;
}
