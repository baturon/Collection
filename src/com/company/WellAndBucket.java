package com.company;

public class WellAndBucket {
    public static void main(String[] args) {

    }
}

interface Well{
    double getWater();

}

class  DugWell implements Well{

    @Override
    public double getWater() {
        return 0;
    }
}
class  Bucket{
    public double volume =10;
    public void  fill(){
        System.out.println("fill the bucket");
    }
}