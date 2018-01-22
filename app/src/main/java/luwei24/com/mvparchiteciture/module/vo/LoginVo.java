package luwei24.com.mvparchiteciture.module.vo;

/**
 * Author   : luweicheng on 2018/1/22 0022 10:47
 * E-mail   ：1769005961@qq.com
 * GitHub   : https://github.com/luweicheng24
 * funcation:  登录返回参数
 **/


public class LoginVo extends CommonVo{

    /**
     * user : {"name":"123","age":"23","sex":"男"}
     */

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * name : 123
         * age : 23
         * sex : 男
         */

        private String name;
        private String age;
        private String sex;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "UserBean{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
    }

    @Override
    public String toString() {
        return "LoginVo{" +
                "user=" + user +
                '}';
    }
}
