package Chuong5b3;

public class chay {
	public static void main(String[] args) {
		ArrayList<giaoDich> danhSachGiaoDich = new ArrayList<>();
		giaoDich giaodich1= new giaoDichVang("ms1",4,750000,3,"4444");
		giaoDich giaodich2= new giaoDichVang("ms2",12,604000,12,"pnj");
		danhSachGiaoDich.add(giaodich1);
		danhSachGiaoDich.add(giaodich2);
		System.out.println("gia tien vang 1: " +giaodich1.ThanhTien());
		System.out.println("gia tien vang 2: " +giaodich2.ThanhTien());
		
		giaoDich giaodich3= new giaoDichTienTe("VND",1,"gd1",3,500000,10);
		giaoDich giaodich4= new giaoDichTienTe("Dolar",25000,"gd1",3,5000,10);
		danhSachGiaoDich.add(giaodich3);
		danhSachGiaoDich.add(giaodich4);
		System.out.println("gia tien tien viet : " +giaodich3.ThanhTien());
		System.out.println("gia tien tien do : " +giaodich4.ThanhTien());
		
	}
}

