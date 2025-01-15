package com.sahil.shape;

public class Cylinder extends Shape {
    Cylinder(int dim1){
        super(dim1,-1);
    }
 
    public int area(){
        return  2 * Math.PI * this.dim1 * (this.dim2 + this.dim1);
    }
 }