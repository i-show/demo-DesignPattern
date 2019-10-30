package com.ishow.noah.manager;

import android.util.Log;

import com.ishow.noah.AppApplication;
import com.ishow.noah.BuildConfig;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;


/**
 * 推送管理
 */
public class PushManager {
    private static final String TAG = "PushManager";
    /**
     * 资源路径
     */
    private static final String RESOURCE_PACKAGE_NAME = "com.ishow.noah";
    private static final String APP_KEY = "5db936e33fc195e81a0000c6";
    private static final String MESSAGE_SECRET = "fefa4e750eff08dba8ce2003410f465b";

    private static PushManager sInstance;

    private PushManager() {
    }

    public static PushManager getInstance() {
        if (sInstance == null) {
            synchronized (PushManager.class) {
                if (sInstance == null) {
                    sInstance = new PushManager();
                }
            }
        }
        return sInstance;
    }

    public void init(AppApplication application) {
        /*
         * 初始化common库
         * 参数1:上下文，不能为空
         * 参数2:【友盟+】 AppKey
         * 参数3:【友盟+】 Channel
         * 参数4:设备类型，UMConfigure.DEVICE_TYPE_PHONE为手机、UMConfigure.DEVICE_TYPE_BOX为盒子，默认为手机
         * 参数5:Push推送业务的secret
         */
        UMConfigure.setLogEnabled(BuildConfig.DEBUG);
        UMConfigure.init(application, APP_KEY, "Umeng", UMConfigure.DEVICE_TYPE_PHONE, MESSAGE_SECRET);

        PushAgent pushAgent = PushAgent.getInstance(application);
        // 配置资源包名
        pushAgent.setResourcePackageName(RESOURCE_PACKAGE_NAME);
        // 不显示前台通知
        //pushAgent.setNotificaitonOnForeground(true);
        // 修复通知只显示一条的问题- 友盟默认只显示一条
        pushAgent.setDisplayNotificationNumber(5);
        //注册推送服务 每次调用register都会回调该接口
        pushAgent.register(new IUmengRegisterCallback() {
            @Override
            public void onSuccess(String deviceToken) {
                Log.i(TAG,"注册成功：deviceToken：-------->  " + deviceToken);
            }

            @Override
            public void onFailure(String s, String s1) {
                Log.e(TAG,"注册失败：-------->  " + "s:" + s + ",s1:" + s1);
            }
        });
    }
}
