package com.fly.wheelview;

import android.app.Dialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by fly on 2017/8/25.
 */

public class WhileViewUtil {
    /**
     * 弹出视图的提示框
     *
     * @param context
     * @param view
     * @return
     */
    public static Dialog getDialog(Context context, View view, int i, boolean isCancelable) {
        final Dialog dialog = new Dialog(context, R.style.MyDialogStyleBottom);
        dialog.setCancelable(isCancelable);
        dialog.getWindow().setContentView(view);
        dialog.getWindow().setGravity(i);
        WindowManager.LayoutParams p = dialog.getWindow().getAttributes(); // 获取对话框当前的参数值
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        int mWidth = dm.widthPixels;
        //(int) (ApplicationEx.getInstance().getDeviceWidth() * 0.8);
        p.width = mWidth;
        p.height = WindowManager.LayoutParams.WRAP_CONTENT;
        return dialog;
    }
}
