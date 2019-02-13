package com.volvo.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;

import com.volvo.R;

/**
 * 对话框
 * 详情点击这里 {@link VoDialogBuilder}
 *
 * @see VoDialogBuilder
 */
public class VoDialog extends Dialog {

  private Context mContext;
  boolean mCancelable = true;

  public VoDialog(@NonNull Context context) {
    this(context, R.style.Vo_Dialog);
  }

  public VoDialog(@NonNull Context context, int themeResId) {
    super(context, themeResId);
    this.mContext = context;
    init();
  }

  private void init() {
    setCancelable(true);
  }

  @Override
  public void setCancelable(boolean flag) {
    super.setCancelable(flag);
    this.mCancelable = flag;
  }


}
