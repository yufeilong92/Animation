package com.example.administrator.zhbj.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/6/22.
 */
public class CacheUtils {
    /**
     * 方法
     * @param contect
     * @param key
     * @param value
     */
    public  static  void saveString(Context contect, String key, String value){
        //[☆]获取编辑器
        SharedPreferences sharedPreferences=contect.getSharedPreferences("config.xml",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        //[☆]提交
        edit.commit();
    }

    /**
     * 获取变量值
     * @param context
     * @param key
     * @return
     */
    public  static String getstring (Context context ,String key){
        //[☆]获取编辑器
        SharedPreferences sharedPreferences = context.getSharedPreferences("config.xml",Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,"");
    }
}
