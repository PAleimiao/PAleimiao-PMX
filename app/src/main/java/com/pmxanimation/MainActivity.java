package com.pmxanimator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.opengl.GLSurfaceView;
import java.io.File;

public class MainActivity extends Activity {

    private GLSurfaceView glSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 设置GLSurfaceView
        glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setEGLContextClientVersion(2);  // 使用OpenGL ES 2.0
        glSurfaceView.setRenderer(new GLRenderer(loadPMXModel()));

        setContentView(glSurfaceView);
    }

    // 加载PMX模型
    private PMXModel loadPMXModel() {
        File pmxFile = new File("/path/to/your/model.pmx");
        try {
            return PMXModelLoader.loadPMXModel(pmxFile);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}