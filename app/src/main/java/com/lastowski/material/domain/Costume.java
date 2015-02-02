package com.lastowski.material.domain;

import com.orm.SugarRecord;

/**
 * Created by adamlastowski on 28.01.15.
 */

public class Costume extends SugarRecord<Costume> {
    String name;
    String thumb_img;

    public Costume() {}

    public Costume(String name, String thumb_img){
        this.name = name;
        this.thumb_img = thumb_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumb_img() {
        return thumb_img;
    }

    public void setThumb_img(String thumb_img) {
        this.thumb_img = thumb_img;
    }

}
