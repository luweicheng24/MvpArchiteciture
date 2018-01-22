package luwei24.com.mvparchiteciture.mvp.net;

import java.util.HashMap;

import luwei24.com.mvparchiteciture.module.vo.LoginVo;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * Author   : luweicheng on 2018/1/19 0019 16:20
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: Retrofit接口类
 **/


public interface ApiService {
//    retrofit 的get请求
    @GET("/login")
    Call<LoginVo> loginGet(@QueryMap HashMap<String,String> paramMap);
// retrofit的post请求
    @FormUrlEncoded
    @POST("/login")
    Call<LoginVo> loginPost(@FieldMap HashMap<String,String> paramMap);
}
