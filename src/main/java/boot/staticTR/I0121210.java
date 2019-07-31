package boot.staticTR;

import com.alibaba.fastjson.JSONAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.lang.model.element.NestingKind;
import java.math.BigDecimal;
// 用于解包前端json
//@Component

public class I0121210 implements JSONAware {
    private IAccount iAccount;
    private ICino iCino;
    private BigDecimal rate;
    private String dd_ac;

    @Override
    public String toString() {
        return "I0121210{" +
                "iAccount=" + iAccount +
                ", iCino=" + iCino +
                ", rate=" + rate +
                ", dd_ac='" + dd_ac + '\'' +
                '}';
    }

    @Override
    public String toJSONString() {
        return this.toString();
    }

          class IAccount {

        private String ac_no;
        private String prd_cd;
        private String ccy;
        private BigDecimal prin;
        private BigDecimal _int;
        private BigDecimal cr_amt;
        private BigDecimal dr_amt;

        @Override
        public String toString() {
            return "IAccount{" +
                    "ac_no='" + ac_no + '\'' +
                    ", prd_cd='" + prd_cd + '\'' +
                    ", ccy='" + ccy + '\'' +
                    ", prin=" + prin +
                    ", _int=" + _int +
                    ", cr_amt=" + cr_amt +
                    ", dr_amt=" + dr_amt +
                    '}';
        }

        public String getAc_no() {
            return ac_no;
        }

        public void setAc_no(String ac_no) {
            this.ac_no = ac_no;
        }

        public String getPrd_cd() {
            return prd_cd;
        }

        public void setPrd_cd(String prd_cd) {
            this.prd_cd = prd_cd;
        }

        public String getCcy() {
            return ccy;
        }

        public void setCcy(String ccy) {
            this.ccy = ccy;
        }

        public BigDecimal getPrin() {
            return prin;
        }

        public void setPrin(BigDecimal prin) {
            this.prin = prin;
        }

        public BigDecimal get_int() {
            return _int;
        }

        public void set_int(BigDecimal _int) {
            this._int = _int;
        }

        public BigDecimal getCr_amt() {
            return cr_amt;
        }

        public void setCr_amt(BigDecimal cr_amt) {
            this.cr_amt = cr_amt;
        }

        public BigDecimal getDr_amt() {
            return dr_amt;
        }

        public void setDr_amt(BigDecimal dr_amt) {
            this.dr_amt = dr_amt;
        }
    }

    static  class ICino {
        private long ci_no;
        private String ci_ename;

        public long getCi_no() {
            return ci_no;
        }

        public void setCi_no(long ci_no) {
            this.ci_no = ci_no;
        }

        public String getCi_ename() {
            return ci_ename;
        }

        public void setCi_ename(String ci_ename) {
            this.ci_ename = ci_ename;
        }
    }


    public IAccount getiAccount() {
        return iAccount;
    }

    public void setiAccount(IAccount iAccount) {
        this.iAccount = iAccount;
    }

    public ICino getiCino() {
        return iCino;
    }

    public void setiCino(ICino iCino) {
        this.iCino = iCino;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getDd_ac() {
        return dd_ac;
    }

    public void setDd_ac(String dd_ac) {
        this.dd_ac = dd_ac;
    }
}
