package com.experiment;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public List<String> execute(List<Integer> integers) {
        double size = integers.size();
        format(size);
        int positive = 0;
        int negative = 0;
        int zeros = 0;

        for (Integer i : integers) {
            if (i == 0) {
                zeros++;
            } else if (i < 0) {
                negative++;
            } else {
                positive++;
            }
        }

        return Arrays.asList(format(positive/size), format(negative/size), format(zeros/size));
    }

    private String format(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        return decimalFormat.format(value);
    }
}
