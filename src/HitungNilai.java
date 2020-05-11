public class HitungNilai {
	
	private float totalNilai;
	private float hasilNilai;
	private int Nilai1;
	private int Nilai2;
	private int Nilai3;
	private int Nilai4;
	
	HitungNilai(int a , int b , int c , int d){
		this.Nilai1 = a;
		this.Nilai2 = b;
		this.Nilai3 = c;
		this.Nilai4 = d;
	}
	
	public void hitung() {
		this.totalNilai = this.Nilai1 + this.Nilai2 + this.Nilai3 + this.Nilai4;
		this.hasilNilai = this.totalNilai / 4;
	}
	
	public float ambilTotalNilai() {
		return this.totalNilai;
	}
	
	public float ambilHasilNilai() {
		return this.hasilNilai;
	}
	
}
