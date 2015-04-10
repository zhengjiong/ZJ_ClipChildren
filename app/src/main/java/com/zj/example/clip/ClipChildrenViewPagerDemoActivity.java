package com.zj.example.clip;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * android:clipChildren表示是否限制子View在其范围内，默认为true。
 *
 * create by zhengjiong
 * Date: 2015-04-02
 * Time: 08:06
 */
public class ClipChildrenViewPagerDemoActivity extends Activity{
    private static final int TOTAL_COUNT = 5;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clipchildren_viewpager_layout);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        MyPagerAdapter pagerAdapter = new MyPagerAdapter();

        /**
         * setOffscreenPageLimit表示设置缓存，这样左右拖动即可看见后面的Fragment。
         * setPageMargin表示设置Fragment之间的间距
         */
        mViewPager.setOffscreenPageLimit(TOTAL_COUNT);
        mViewPager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.pager_margin));
        mViewPager.setAdapter(pagerAdapter);

        View rootView = findViewById(R.id.rootview);

        /**
         * 需要setOnTouchListener函数中将滑动滑动事件传递给viewPager，
         * 否则只有viewPager中间的Imageview可以滑动，设置后整个RootView都可以滑动。
         */
        rootView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return mViewPager.dispatchTouchEvent(event);
            }
        });
    }

    class MyPagerAdapter extends PagerAdapter{

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView imageView = new ImageView(ClipChildrenViewPagerDemoActivity.this);
            /**
             * public static final int image1=0x7f020002;
             * public static final int image2=0x7f020003;
             * public static final int image3=0x7f020004;
             */
            imageView.setImageResource(R.drawable.image1 + position);

            ((ViewPager)container).addView(imageView, position);

            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeViewAt(position);
        }

        @Override
        public int getCount() {
            return TOTAL_COUNT;
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return view == o;
        }
    }
}
