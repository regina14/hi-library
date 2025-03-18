package org.devio.hi.library.log;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiLogManager {
    private HiLogConfig config;
    private static HiLogManager instance;

    private HiLogManager(HiLogConfig configonfig){
        this.config = config;
    }

    public static HiLogManager getInstance() {
        return instance;
    }

    public static void init(@NonNull HiLogConfig config){
        instance = new HiLogManager(config);
    }


    public HiLogConfig getConfig() {
        return config;
    }
}
