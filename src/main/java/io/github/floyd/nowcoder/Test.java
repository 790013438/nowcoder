package io.github.floyd.nowcoder;

import java.util.Map;
import java.util.HashMap;

public class Test {
    public static Test t1 = new Test();

    {
         System.out.println("blockA");
    }

    static {
        System.out.println("blockB");
    }

    public static void main(String[] args) {
        Test t2 = new Test();
        System.out.println(labels);
    }

    static Map<Double, String> labels;
    static {
        labels = new HashMap<Double, String>();
        labels.put(5.5, "five and a half");
        labels.put(7.1, "seven point 1");
    }
 }
