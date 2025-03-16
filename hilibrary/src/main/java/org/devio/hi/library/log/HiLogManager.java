package org.devio.hi.library.log;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiLogManager {
    private HiLogConfig config;
    private static HiLogManager instance;

    public static HiLogManager getInstance() {
        return instance;
    }


    public HiLogConfig getConfig() {
        return config;
    }
}
