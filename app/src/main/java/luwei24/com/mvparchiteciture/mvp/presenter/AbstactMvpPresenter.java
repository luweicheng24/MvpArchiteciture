package luwei24.com.mvparchiteciture.mvp.presenter;

import java.util.HashMap;

import luwei24.com.mvparchiteciture.mvp.view.IMvpViewImpl;

/**
 * Author   : luweicheng on 2018/1/19 0019 15:00
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: presenter抽象基类
 **/
public abstract class AbstactMvpPresenter<V extends IMvpViewImpl> {
    protected HashMap<String,String> paramMap; // 参数map
    private V mvpView;
    // 关联View
    public void attachView(V mvpView){
        this.mvpView = mvpView;
        paramMap = new HashMap<>();
    }
    // 与View接触绑定
   public void detachView(){
       this.mvpView = null;
   }
    // 获取View
    public V getMvpView() {
        return mvpView;
    }
}
