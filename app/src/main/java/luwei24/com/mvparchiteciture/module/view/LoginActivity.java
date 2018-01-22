package luwei24.com.mvparchiteciture.module.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import luwei24.com.mvparchiteciture.R;
import luwei24.com.mvparchiteciture.module.presenter.LoginPresenter;
import luwei24.com.mvparchiteciture.module.vo.CommonVo;
import luwei24.com.mvparchiteciture.module.vo.LoginVo;
import luwei24.com.mvparchiteciture.mvp.fault.ErrorInfo;
import luwei24.com.mvparchiteciture.mvp.view.AbstractMvpActivity;

public class LoginActivity extends AbstractMvpActivity<LoginPresenter> {
    private EditText et_name, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name = (EditText) findViewById(R.id.et_name);
        et_password = (EditText) findViewById(R.id.et_passsword);
    }

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter();
    }

    public void login(View view) {
        if (TextUtils.isEmpty(et_name.getText()) && TextUtils.isEmpty(et_password.getText())) {
            presenter.requestLogin(et_name.getText().toString(), et_password.getText().toString());
        } else {
            Toast.makeText(this, "用户名或者密码为空", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void requesting() {
        System.out.println("数据请求中");
    }

    @Override
    public void success(CommonVo data) {
        ((LoginVo) data).toString();
        Toast.makeText(this, "登录成功"+((LoginVo) data).toString(), Toast.LENGTH_SHORT).show();

        System.out.println("loginactivity" + ((LoginVo) data).toString());
    }

    @Override
    public void fail(ErrorInfo errorInfo) {
        Toast.makeText(this, "登录失败"+errorInfo.toString(), Toast.LENGTH_SHORT).show();
        System.out.println("loginactivity" + errorInfo.toString());

    }


}
