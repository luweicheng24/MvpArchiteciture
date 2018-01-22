package luwei24.com.mvparchiteciture.mvp.view;

import luwei24.com.mvparchiteciture.module.vo.CommonVo;
import luwei24.com.mvparchiteciture.mvp.fault.ErrorInfo;

/**
 * Author   : luweicheng on 2018/1/19 0019 15:12
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation: View 接口
 **/


public interface IMvpViewImpl<T extends CommonVo>  {

     void requesting(); // 数据请求开始
     void success(T data); // 请求成功
     void fail(ErrorInfo errorInfo); // 请求失败

}
