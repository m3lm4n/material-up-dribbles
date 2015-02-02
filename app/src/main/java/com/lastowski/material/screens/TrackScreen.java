package com.lastowski.material.screens;

import com.lastowski.material.R;

import flow.HasParent;
import flow.Layout;

/**
 * Created by adamlastowski on 27.01.15.
 */

@Layout(R.layout.track_view)
public class TrackScreen implements HasParent<AlbumScreen> {
    public final int albumId;
    public final int trackId;

    public TrackScreen(int albumId, int trackId){
        this.albumId = albumId;
        this.trackId = trackId;
    }

    @Override
    public AlbumScreen getParent() {
        return new AlbumScreen(albumId);
    }
}
