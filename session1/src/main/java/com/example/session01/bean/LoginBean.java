package com.example.session01.bean;

public class LoginBean {
    /**
     * phuong thuc dang nhap
     * @param us la ten dang nhap
     * @param ps la mat khau
     * @return true neu dang nhap thanh cong <br/>
     * false neu dang nhap that bai
     */

    public boolean login(String us, String ps) {
        if (us.equalsIgnoreCase("ty")&& ps.equalsIgnoreCase("123"))
            return true;
        return false;
    }
}
