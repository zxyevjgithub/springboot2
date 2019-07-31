package boot.include;

public class Bptvchh {

    String ac_date;
    String ac_no;
    String ci_no;

    String vchno;
    String jrnno;
    double amt;
    String tr_br;
    String dr_sign;

    public Bptvchh() {
    }

    @Override
    public String toString() {
        return "Bptvchh{" +
                "ac_date='" + ac_date + '\'' +
                ", ac_no='" + ac_no + '\'' +
                ", ci_no='" + ci_no + '\'' +
                ", vchno='" + vchno + '\'' +
                ", jrnno='" + jrnno + '\'' +
                ", amt=" + amt +
                ", tr_br='" + tr_br + '\'' +
                ", dr_sign='" + dr_sign + '\'' +
                '}';
    }

    public Bptvchh(String ac_date, String ac_no, String ci_no, String vchno, String jrnno, double amt, String tr_br, String dr_sign) {
        this.ac_date = ac_date;
        this.ac_no = ac_no;
        this.ci_no = ci_no;
        this.vchno = vchno;
        this.jrnno = jrnno;
        this.amt = amt;
        this.tr_br = tr_br;
        this.dr_sign = dr_sign;
    }

    public String getDr_sign() {
        return dr_sign;
    }

    public void setDr_sign(String dr_sign) {
        this.dr_sign = dr_sign;
    }

    public String getAc_date() {
        return ac_date;
    }

    public void setAc_date(String ac_date) {
        this.ac_date = ac_date;
    }

    public String getAc_no() {
        return ac_no;
    }

    public void setAc_no(String ac_no) {
        this.ac_no = ac_no;
    }

    public String getCi_no() {
        return ci_no;
    }

    public void setCi_no(String ci_no) {
        this.ci_no = ci_no;
    }

    public String getVchno() {
        return vchno;
    }

    public void setVchno(String vchno) {
        this.vchno = vchno;
    }

    public String getJrnno() {
        return jrnno;
    }

    public void setJrnno(String jrnno) {
        this.jrnno = jrnno;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getTr_br() {
        return tr_br;
    }

    public void setTr_br(String tr_br) {
        this.tr_br = tr_br;
    }
}
