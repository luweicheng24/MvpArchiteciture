package luwei24.com.mvparchiteciture.mvp.net;

import android.util.Log;

import luwei24.com.mvparchiteciture.module.vo.LoginVo;
import luwei24.com.mvparchiteciture.mvp.fault.ErrorInfo;
import luwei24.com.mvparchiteciture.mvp.interfaces.ResponseResultListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Author   : luweicheng on 2018/1/22 0022 11:14
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation:  数据请求的回调过滤
 **/


public class HttpCallBack implements Callback {
    public static final int NET_ERROR = 10086;

    public HttpCallBack(ResponseResultListener resultListener) {
        this.resultListener = resultListener;
    }

    @Override
    public void onResponse(Call call, Response response) {
        LoginVo vo = (LoginVo) response.body();
//            根据code过滤数据
        if (resultListener != null) {
            resultListener.success(vo);
        } else {
            resultListener.error(new ErrorInfo(vo.getRes_code(), vo.getRes_msg()));
        }

    }

    @Override
    public void onFailure(Call call, Throwable t) {
        resultListener.error(new ErrorInfo(NET_ERROR, "网络异常"));
        Log.e("net-error", "onFailure: " + t.getMessage());
    }


    private ResponseResultListener resultListener;

    public void setResultListener(ResponseResultListener resultListener) {
        this.resultListener = resultListener;
    }
}
