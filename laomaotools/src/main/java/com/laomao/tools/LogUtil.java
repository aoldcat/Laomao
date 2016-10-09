package com.laomao.tools;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by laomao on 16/10/9.
 */

public class LogUtil {
    public static boolean logdebug=true;


    public static void setLogdebug(boolean logdebug) {
        LogUtil.logdebug = logdebug;
    }


    public static void showLog(String msg) {
        if (logdebug) {
            Log.i("laomao", msg);
        }
    }
    public static void showLog(String TAG, String msg) {
        if (logdebug) {
            Log.i(TAG,  msg);
        }
    }

    public static void showToast(final Context mContext, final String content) {
        Toast toast = Toast.makeText(mContext, content,
                Toast.LENGTH_SHORT);
        View view=toast.getView();
        try {
            if(view instanceof LinearLayout){
                LinearLayout linearLayout = (LinearLayout)view ;
                TextView messageTextView = (TextView) linearLayout.getChildAt(0);
                messageTextView.setTextSize(12);
            }else if(view instanceof RelativeLayout){
                RelativeLayout relativeLayout = (RelativeLayout)view ;
                TextView messageTextView = (TextView) relativeLayout.getChildAt(0);
                messageTextView.setTextSize(12);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        toast.show();
    }

    public static void showToast(final Context mContext, final String content,String up) {
        Toast toast = Toast.makeText(mContext, content,Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }

    public static void setTextViewContent(final AppCompatActivity activity,
                                          final TextView textView, final String content) {
        activity.runOnUiThread(new Runnable() {

            @Override
            public void run() {
                if (textView != null) {
                    textView.setText(content);
                }

            }
        });
    }
}
