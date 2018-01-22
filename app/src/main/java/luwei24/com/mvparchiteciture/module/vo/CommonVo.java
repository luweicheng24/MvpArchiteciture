package luwei24.com.mvparchiteciture.module.vo;

/**
 * Author   : luweicheng on 2018/1/19 0019 14:46
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: 服务器返回的公共参数
 **/


public class CommonVo{
    private int res_code;
    private String res_msg;

    public int getRes_code() {
        return res_code;
    }

    public void setRes_code(int res_code) {
        this.res_code = res_code;
    }

    public String getRes_msg() {
        return res_msg;
    }

    public void setRes_msg(String res_msg) {
        this.res_msg = res_msg;
    }
}
