package com.company;

public class quadrangle {


    int [] corx = new int[4];
    int [] cory = new int[4];

    public static void main(String[] args) {




    }

    public void CreatPoint(){
        for (int i=0; i < corx.length ;i++){

            double tx = Math.random()*100;
            double ty = Math.random()*100;
            corx[i]= Math.round((float) tx);
            cory[i]= Math.round((float) ty);
        }
    }
    public void PointInfo(){
        for (int i=0; i < corx.length ;i++) {
            System.out.println("Tochka" + (i + 1) + " (" + corx[i] + "," + cory[i] + ")");
        }
    }

    public  float L1(){
       return (float) Math.sqrt(Math.pow((double)corx[0]-(double)corx[1] , 2) + Math.pow((double)cory[0]-(double)cory[1] , 2));
    }
    public  float L2(){
        return (float)Math.sqrt(Math.pow((double)corx[1]-(double)corx[2] , 2) + Math.pow((double)cory[1]-(double)cory[2] , 2));
    }
    public  float L3(){
        return (float)Math.sqrt(Math.pow((double)corx[2]-(double)corx[3] , 2) + Math.pow((double)cory[2]-(double)cory[3] , 2));
    }
    public float L4(){
        return (float)Math.sqrt(Math.pow((double)corx[3]-(double)corx[0] , 2) + Math.pow((double)cory[3]-(double)cory[0] , 2));
    }

    public  float D1(){
        return (float)Math.sqrt(Math.pow((double)corx[0]-(double)corx[2] , 2) + Math.pow((double)cory[0]-(double)cory[2] , 2));
    }

    public  float D2(){
        return (float) Math.sqrt(Math.pow((double)corx[1]-(double)corx[3] , 2) + Math.pow((double)cory[1]-(double)cory[3] , 2));
    }

    public float P(){
        return L1()+L2()+L3()+L4();
    }

    public void getInfo(){
        System.out.println(" ");
        System.out.println("сторона 1 >> " + L1() + " cm");
        System.out.println("сторона 2 >> " + L2() + " cm");
        System.out.println("сторона 3 >> " + L3() + " cm");
        System.out.println("сторона 4 >> " + L4() + " cm");

        System.out.println("Діагональ 1 >> " + D1() + " cm");
        System.out.println("Діагональ 2 >> " + D2() + " cm");

        System.out.println("Периметр >> " + P() + " cm \n");
    }





}
