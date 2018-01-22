package luwei24.com.mvparchiteciture.mvp.interfaces;

import luwei24.com.mvparchiteciture.module.vo.CommonVo;
import luwei24.com.mvparchiteciture.mvp.fault.ErrorInfo;

/**
 * Author   : luweicheng on 2018/1/22 0022 13:42
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation:
 **/


public interface ResponseResultListener<T extends CommonVo> {
    //      正确返回数据（res_code！=1）
    void success(T t);
    //      返回数据有错
    void error(ErrorInfo errorInfo);
}
