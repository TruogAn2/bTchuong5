package Chuong5b2;

import java.util.Scanner;

public class hinhTron extends Hinh{
	private float r;
	@Override
	public Double getdientich() {
		return dienTich;
	}
	public hinhTron(Double dienTich, float r) {
		super(dienTich);
		this.r = r;
	}
	public void setr( float r) {
		this.r=r;
	}
	public float getr() {
		return r;
	}
	public String toString() {
        return"banKinh="+r;
    }
	class dienTich {
	    public static void main (String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập vào bán kính của hình tròn:");
	        double r = scanner.nextFloat();
	        double dienTich = 3.14*r*2;
	        System.out.println("Diện tích hình tròn là:"+dienTich);
	    }
	}
	
}
