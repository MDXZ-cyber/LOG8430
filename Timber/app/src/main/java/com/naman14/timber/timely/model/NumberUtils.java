package com.naman14.timber.timely.model;

import com.naman14.timber.timely.model.number.*;

import java.security.InvalidParameterException;

public class NumberUtils {

    private static final float[][][] controlPoints = {
            Zero.getInstance().getControlPoints(),
            One.getInstance().getControlPoints(),
            Two.getInstance().getControlPoints(),
            Three.getInstance().getControlPoints(),
            Four.getInstance().getControlPoints(),
            Five.getInstance().getControlPoints(),
            Six.getInstance().getControlPoints(),
            Seven.getInstance().getControlPoints(),
            Eight.getInstance().getControlPoints(),
            Nine.getInstance().getControlPoints()
    };

    public static float[][] getControlPointsFor(int start) {
        if (start == -1) return Null.getInstance().getControlPoints();
        if (start < controlPoints.length && start >= 0) return controlPoints[start];

        throw new InvalidParameterException("Unsupported number requested");
    }
}
