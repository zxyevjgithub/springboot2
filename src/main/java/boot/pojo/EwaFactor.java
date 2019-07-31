package boot.pojo;

public class EwaFactor {

    Boolean _local_flg;
    Boolean _inter_flg ;
    Boolean _cash ;
    String  _event_code ;
    String _prd_cd;
    String _ac_no;
    Long  _amt;
    String _br;
    String _ci_no;

    public EwaFactor(Boolean _local_flg, Boolean _inter_flg, Boolean _cash, String _event_code, String _prd_cd, String _ac_no, Long _amt, String _br, String _ci_no) {
        this._local_flg = _local_flg;
        this._inter_flg = _inter_flg;
        this._cash = _cash;
        this._event_code = _event_code;
        this._prd_cd = _prd_cd;
        this._ac_no = _ac_no;
        this._amt = _amt;
        this._br = _br;
        this._ci_no = _ci_no;
    }

    public String get_ci_no() {
        return _ci_no;
    }

    public void set_ci_no(String _ci_no) {
        this._ci_no = _ci_no;
    }

    public Long get_amt() {
        return _amt;
    }

    public void set_amt(Long _amt) {
        this._amt = _amt;
    }

    public String get_ac_no() {
        return _ac_no;
    }

    public void set_ac_no(String _ac_no) {
        this._ac_no = _ac_no;
    }



    public String get_br() {
        return _br;
    }

    public void set_br(String _br) {
        this._br = _br;
    }

    public Boolean get_local_flg() {
        return _local_flg;
    }

    public void set_local_flg(Boolean _local_flg) {
        this._local_flg = _local_flg;
    }

    public Boolean get_inter_flg() {
        return _inter_flg;
    }

    public void set_inter_flg(Boolean _inter_flg) {
        this._inter_flg = _inter_flg;
    }

    public Boolean get_cash() {
        return _cash;
    }

    public void set_cash(Boolean _cash) {
        this._cash = _cash;
    }

    public String get_event_code() {
        return _event_code;
    }

    public void set_event_code(String _event_code) {
        this._event_code = _event_code;
    }

    public String get_prd_cd() {
        return _prd_cd;
    }

    public void set_prd_cd(String _prd_cd) {
        this._prd_cd = _prd_cd;
    }

    public String getmapping(){
        if ( this._cash == true ) {
            return "001" ;  // 现金
        }else if ( ( this._inter_flg == true) &&(this._local_flg ==true) ){
            return "110" ;   // 行内同城
        }else if (  ( this._inter_flg == false )  ) {
            return "010" ;  // 行内异地
        }else { return  "000" ;}   // 他行

    }


}
