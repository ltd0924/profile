package com.example.a915.profile.roll;

        import android.content.Context;
        import android.util.AttributeSet;
        import android.widget.GridView;

public class gridview extends GridView {
    public gridview(Context context) {
        super(context);
    }

    public gridview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public gridview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
