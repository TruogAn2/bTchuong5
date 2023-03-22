package Chuong5b2;
import java.util.Scanner;
public class hinhCN extends Hinh {
	private float cd;
	private float cr;
	@Override
	public Double getdientich() {
		return dienTich;
	}
	public hinhCN(Double dienTich, float cd, float cr){
		super(dienTich);
		this.cd = cd;
		this.cr = cr;
	}
	public void setcd(float cd) {
		this.cd=cd;
	}
	public float getcd() {
		return cd;
	}
	public void setcr(float cr) {
		this.cr=cr;
	}
	public float getcr() {
		return cr;
	}
	public String toString() {
        return"chieudai="+cd +"chieurong"+cr;
    }
	class dienTich {
	    public static void main (String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập vào chiều dài của hình chữ nhật:");
	        double cd = scanner.nextFloat();
	        System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
	        double cr = scanner.nextFloat();
	        double dienTich = cd*cr;
	        System.out.println("Diện tích hình chữ nhật là:"+dienTich);
	    }
	}
}
	    


