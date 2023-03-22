package Chuong5b2;

import java.util.ArrayList;

public class dsHinh {
	private ArrayList<Hinh>dsHinh;

		public dsHinh() {
			this.dsHinh = new ArrayList();
		}
		public dsHinh(ArrayList danhSach) {
			this.dsHinh = danhSach;
		}
		public void themHinh(Hinh h) {
			this.dsHinh.add(h);
		}
		public void indsHinh() {
			for (Hinh hinh : dsHinh) {
				System.out.println(hinh);
			}
		}
		
	}