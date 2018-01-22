package luwei24.com.mvparchiteciture.module.model;

import java.util.HashMap;

import luwei24.com.mvparchiteciture.module.vo.LoginVo;
import luwei24.com.mvparchiteciture.mvp.net.HttpCallBack;
import luwei24.com.mvparchiteciture.mvp.net.ApiClient;
import retrofit2.Call;

/**
 * Author   : luweicheng on 2018/1/22 0022 11:05
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: LoginModel
 **/


public class LoginModel {
   //   登录
    public void login(HashMap<String,String> paraMap, HttpCallBack customCallBack){
        Call<LoginVo> call = ApiClient.getApiService().loginGet(paraMap);
        call.enqueue(customCallBack);
    }
}
