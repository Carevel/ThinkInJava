package chapter15.generics;

import chapter15.generics.watercolors.WaterColors;

import java.util.EnumSet;
import java.util.Set;

import static net.mindview.util.Sets.union;

/**
 * Created by Changjiang on 2016/11/22.
 */
public class WaterColorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1= EnumSet.range(WaterColors.BRILLIANT_RED,WaterColors.VIRIDIAN_YHUE);
        Set<WaterColors> set2=EnumSet.range(WaterColors.MAGENTA,WaterColors.COBALT_BLUE_HUE);
        System.out.println("set1:"+set1);
        System.out.println("set2:"+set2);
        System.out.println(union(set1,set2));
    }
}
