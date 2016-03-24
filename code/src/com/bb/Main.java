package com.bb;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

import com.bb.misc.BounceInterpolator;
import com.bb.misc.EasingType.Type;
import com.bb.ui.Foods;
import com.bb.ui.TypeListActivity;
import com.bb.R;



/**
 * 系统启动类，显示操作
 * @author Administrator
 *
 */
public class Main extends Activity {


    private Animation animLeft, animRight;
    private Interpolator interpolator;
    private LinearLayout foodsRow,  aboutRow,exitRow;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
//         动画
        animLeft = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        animRight = AnimationUtils.loadAnimation(this, R.anim.slide_in_right);
        interpolator = new BounceInterpolator(Type.IN);
        animLeft.setInterpolator(interpolator);
        animRight.setInterpolator(interpolator);
        
//        查看食品
        foodsRow = (LinearLayout)findViewById(R.id.foods_row);
        foodsRow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, TypeListActivity.class);
                startActivity(i);
            }
        });
 
//        关于
        aboutRow = (LinearLayout)findViewById(R.id.about_row);
        aboutRow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Main.this, About.class);
                startActivity(i);
            }
        });
        
//        退出
        exitRow = (LinearLayout)findViewById(R.id.exit_row);
        exitRow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
        
        foodsRow.startAnimation(animRight); 
        aboutRow.startAnimation(animRight);
        exitRow.startAnimation(animRight);
    }


}
