package com.zj.example.clip;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * android:clipChildren和android:clipToPadding的用法
 *
 * Demo描述:
 * ListView或GridView中android:clipToPadding属性的使用说明示例
 * 该属性的解释:
 * Defines whether the ViewGroup will clip its drawing surface so as to exclude the padding area.
 * 什么意思呢?就是说:
 * clipToPadding属性定义了是否允许ViewGroup在padding中绘制,该值默认为true,即不允许.
 * 所以若我们给ListView设置了android:paddingTop="70dip" android:paddingBottom="70dip"
 * 那么我们可以看到ListView的头部以上和尾部以下都占有70大小的padding,在滑动ListView的过程
 * 中这个padding当然是存在的.在padding部分是看不到ListView的item的,本质上是在这两部分没有绘制
 * 我们的ListView
 * 假若我们此时为ListView设置属性android:clipToPadding="false",同样再滑动ListView此时可以
 * 发现在ListView的头部以上和尾部以下都占有70大小的padding部分依然可以显示我们的ListView的
 * item,本质上是在这两部分绘制了我们的ListView
 *
 * 该属性很适合的应用场景:
 * 设置ListView的第一个(最后一个)Item距离屏幕TOP(BOTTOM)有一段距离的情况
 *
 *
 * @author zj
 * @date 2015年4月1日07:21:27
 */
public class ClipToPaddingDemoActivity extends Activity {
    private String[] mData = new String[]{
            "item 1",
            "item 2",
            "item 3",
            "item 4",
            "item 5",
            "item 6",
            "item 7",
            "item 8",
            "item 9",
            "item 10",
            "item 11",
            "item 12",
            "item 13",
            "item 14",
            "item 15",
            "item 16",
            "item 17",
            "item 18",
            "item 19",
    };
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cliptopadding_demo_layout);

        initListView();
    }

    private void initListView() {
        mListView = (ListView) findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mData);
        mListView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
