package com.example.zjf.mediacodecmp4;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class ImageUtil {
    public static Bitmap zoomBitmap(Bitmap bitmap,int width,int height){
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float scaleWidth = ((float) width / w);
        float scaleHeight = ((float) height / h);
        matrix.postScale(scaleWidth,scaleHeight);
        Bitmap newBmp = Bitmap.createBitmap(bitmap,0,0,w,h,matrix,true);
        return newBmp;
    }
}
