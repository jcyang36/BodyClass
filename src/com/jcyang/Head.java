package com.jcyang;

public class Head {

    Mouth mouth ;
    Eyes eyes;
    Nose nose;

    public Head(){
        System.out.println("A head has been created");
        mouth =new Mouth();
        eyes = new Eyes();
        nose = new Nose();
    }


}
