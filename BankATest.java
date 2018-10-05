public class BankATest{
	public static void main(String[] args) {
		BankA n1 = new BankA();
		n1.nasabah = 2;
		System.out.println("jumlah nasabah = "+n1.nasabah);
		System.out.println("no. urut = "+n1.no++);
		n1.nama = "yana";
		System.out.println("nama = "+n1.nama);
		n1.menarikSaldo(1, 70);
		System.out.println(" ");
		
		BankA n2 = new BankA();
		System.out.println("no. urut = "+n2.no);
		n2.nama = "putri";
		System.out.println("nama = "+n2.nama);
		n2.menarikSaldo(2, 20);
	}
}