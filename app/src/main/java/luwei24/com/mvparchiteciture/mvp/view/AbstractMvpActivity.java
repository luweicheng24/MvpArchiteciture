package luwei24.com.mvparchiteciture.mvp.view;

import android.support.v7.app.AppCompatActivity;

import luwei24.com.mvparchiteciture.mvp.presenter.AbstactMvpPresenter;

/**
 * Author   : luweicheng on 2018/1/19 0019 15:26
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: Activity的抽象基类
 **/
public abstract class AbstractMvpActivity<P extends AbstactMvpPresenter> extends AppCompatActivity implements IMvpViewImpl {
    protected  P presenter;
    @Override
    protected void onResume() {
        super.onResume();
        presenter = createPresenter();
        if(presenter==null){
            throw new RuntimeException("present is null");
        }
        presenter.attachView(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(presenter!=null){
            presenter.detachView();
        }
    }

    // 子类创建具体的Presenter
    protected abstract P createPresenter();
}
