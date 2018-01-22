package luwei24.com.mvparchiteciture.module.presenter;

import luwei24.com.mvparchiteciture.module.model.LoginModel;
import luwei24.com.mvparchiteciture.module.vo.LoginVo;
import luwei24.com.mvparchiteciture.mvp.net.HttpCallBack;
import luwei24.com.mvparchiteciture.mvp.fault.ErrorInfo;
import luwei24.com.mvparchiteciture.mvp.interfaces.ResponseResultListener;
import luwei24.com.mvparchiteciture.mvp.presenter.AbstactMvpPresenter;
import luwei24.com.mvparchiteciture.mvp.view.IMvpViewImpl;

/**
 * Author   : luweicheng on 2018/1/19 0019 15:43
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: login的presenter
 **/


public class LoginPresenter extends AbstactMvpPresenter<IMvpViewImpl> {
        private IMvpViewImpl view;
        private LoginModel loginModel;
        public LoginPresenter(){
            loginModel = new LoginModel();
        }

        public void requestLogin(String name,String password){
          view =  getMvpView();
          if(view != null){
            view.requesting();
          }
           paramMap.put("name",name);
           paramMap.put("password",password);
           loginModel.login(paramMap,new HttpCallBack(new ResponseResultListener<LoginVo>() {

               @Override
               public void success(LoginVo loginVo) {
                 view.success(loginVo);
               }

               @Override
               public void error(ErrorInfo errorInfo) {
                   System.out.println(errorInfo.toString());
               }
           }));

      }

}
