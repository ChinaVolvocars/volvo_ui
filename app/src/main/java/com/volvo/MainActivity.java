package com.volvo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView tv = findViewById(R.id.tv);
    TextView tv2 = findViewById(R.id.tv2);
    LoginViewModel.VModel viewModel = new LoginViewModel.VModel();
    String login = viewModel.login("msi@gmail.com", "123456");
    tv.setText(login);

    LoginViewModel.VModel vModel = ViewModelProviders.of(this).get(LoginViewModel.VModel.class);
    String login1 = vModel.login("speed@gmail.com", "789654");
    tv2.setText(login1);
  }
}
