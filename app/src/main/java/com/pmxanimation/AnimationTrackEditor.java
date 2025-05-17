package com.pmxanimation;

import java.util.ArrayList;
import java.util.List;

public class AnimationTrackEditor {
    private List<String> animationTracks;

    public AnimationTrackEditor() {
        animationTracks = new ArrayList<>();
    }

    public void addTrack(String trackName) {
        animationTracks.add(trackName);
    }

    public void removeTrack(String trackName) {
        animationTracks.remove(trackName);
    }

    public List<String> getAnimationTracks() {
        return animationTracks;
    }
}