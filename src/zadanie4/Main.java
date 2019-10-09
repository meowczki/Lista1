package zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gen = new Random();
        float leftSide;
        float rightSide;
        List<Xyz> rozdzielnosc = new ArrayList<Xyz>();
        List<Xyz> lacznosc = new ArrayList<Xyz>();
        List<Xyz> przemiennosc = new ArrayList<Xyz>();
        for (int i = 0; i < 1000; i++) {
            Xyz xyz = new Xyz(gen.nextFloat(), gen.nextFloat(), gen.nextFloat());
            //(x+y)z=xz+yz
            leftSide = (xyz.getX() + xyz.getY()) * xyz.getZ();
            rightSide = xyz.getX() * xyz.getZ() + xyz.getY() * xyz.getZ();
            if (leftSide != rightSide) {
                rozdzielnosc.add(xyz);
            }
            //(x+y)+z=x+(y+z)
            leftSide = (xyz.getX() + xyz.getY()) + xyz.getZ();
            rightSide = xyz.getX() + (xyz.getY() + xyz.getZ());
            if (leftSide != rightSide) {
                lacznosc.add(xyz);
            }
            //x+y=y+x
            leftSide = (xyz.getX() + xyz.getY());
            rightSide = xyz.getY() + xyz.getX();
            if (leftSide != rightSide) {
                przemiennosc.add(xyz);
            }
        }
        System.out.println(rozdzielnosc.size());
        System.out.println(lacznosc.size());
        System.out.println(przemiennosc.size());
        for (Xyz xyz : rozdzielnosc) {
            System.out.println(xyz);
        }
        for (Xyz xyz : lacznosc) {
            System.out.println(xyz);
        }
        for (Xyz xyz : przemiennosc) {
            System.out.println(xyz);
        }


    }

}
