package com.wuyiwen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    @Autowired
    private CompactDisc compactDisc;

    public void play(){
        compactDisc.play();
    }

}
