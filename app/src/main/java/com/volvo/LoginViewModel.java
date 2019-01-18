package com.volvo;

import android.util.Log;

import androidx.lifecycle.ViewModel;


public interface LoginViewModel {


  interface Inouts {
    String login(String email, String password);
  }

  interface Outputs {
    boolean loginStatus();
  }


  class VModel extends ViewModel implements Inouts, Outputs {


    public VModel() {


    }

    @Override
    public String login(String email, String password) {
      Log.e("登陆", "用户邮箱: " + email + ";密码：" + password);

      return "用户邮箱: " + email + ";密码：" + password;
    }

    @Override
    public boolean loginStatus() {
      return false;
    }
  }

}
