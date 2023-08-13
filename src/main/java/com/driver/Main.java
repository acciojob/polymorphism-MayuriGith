package com.driver;

public class Main {

    public static void main(String[] args)
    {
        Product p = new Product();
        p.product(1,5);
        p.product(1,5,2);
        p.product(5.02,3.01);
    }
    public static class Product
{
    public int product(int x,int y)
    {
        return x*y;
    }
    public int product(int x,int y,int z)
    {
        return x*y*z;
    }
    public double product(double x,double y)
    {
        return x*y;
    }
}
}