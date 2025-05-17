package com.pmxanimation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimationActivity extends AppCompatActivity {
    private AnimationTrackEditor trackEditor;
    private PmxRenderer pmxRenderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        TextView animationText = findViewById(R.id.animationText);

        trackEditor = new AnimationTrackEditor();
        pmxRenderer = new PmxRenderer();

        // Example: Load a model and display animation
        pmxRenderer.loadModel("/path/to/model.pmx");
        trackEditor.addTrack("Track 1");
        animationText.setText("Animation Loaded");
    }
}