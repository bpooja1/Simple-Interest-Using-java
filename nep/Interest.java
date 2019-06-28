package com.nep;

public class Interest
{
    private int p,t,r,x,y,z,interest;
    public Interest()
    {
        this.p=0;
        this.t=0;
        this.r=0;
    }
    public Interest(int x,int y,int z)
    {
        this.p=x;
        this.t=y;
        this.r=z;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public void calc() //calc method
        {
            interest=((p*t*r)/100);
        }
        public void show()
        {
            System.out.println("the interest is::"+interest);
        }

    }

