package luwei24.com.mvparchiteciture.mvp.net;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author   : luweicheng on 2018/1/22 0022 09:41
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: Api客户端
 **/


public class ApiClient {
    private ApiClient(){}
    public static ApiClient client;
    private static  ApiService apiService;

    static {
         Retrofit retrofit = new Retrofit
                 .Builder()
                 .baseUrl("http://192.168.1.35:8081/")
                 .client(new OkHttpClient())
                 .addConverterFactory( GsonConverterFactory.create())
                 .build();
         apiService = retrofit.create(ApiService.class);
     }

      public static ApiService getApiService(){
          if(client==null){
              synchronized (ApiClient.class){
                  if(client==null){
                      client = new ApiClient();
                  }
              }
          }
          return apiService;
      }

}
