package com.zj.example.clip;

import android.app.Activity;
import android.os.Bundle;

/**
 * android:clipChildren表示是否限制子View在其范围内
 *
 * android:clipChildren属性的分析
 * 该属性默认值为android:clipChildren="true"
 * 单从字面意思理解clipChildren的意思是:裁剪(缩短)孩子
 * 我们将其值设置为false后那么当子控件的高度高于父控件时
 * 也会完全显示,而不会被压缩.
 * 比如在此例中:
 * 父类线性布局高度指定为50dip
 * 但是第二个ImageView的高度设置为了70dip.
 * 但是该图片依然正常地完整显示,不会只显示一部分
 * 在此可以设置 android:clipChildren="true"观察效果
 *
 * 注意事项:
 * 在布局的根节点设置该属性android:clipChildren
 *
 * create by zhengjiong
 * Date: 2015-04-01
 * Time: 08:37
 */
public class ClipChildrenDemoActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clipchildren_demo_layout);
    }
}
