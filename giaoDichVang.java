package Chuong5b3;

	public class giaoDichVang extends giaoDich {
		private String loaiVang;
		public giaoDichVang(String loaiVang) {
			super();
			this.loaiVang = loaiVang;
		}
		public giaoDichVang(String maGiaoDich, int ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
			super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
			this.loaiVang = loaiVang;
		}
		@Override
		public double ThanhTien() {
			return super.getDonGia() * super.getSoLuong();
		}
	}
