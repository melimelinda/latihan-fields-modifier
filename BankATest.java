public class BankATest{
	public static void main(String[] args) {
		BankA n1 = new BankA();
		n1.nasabah = 2;
		System.out.println(n1.bank);
		System.out.println("jumlah nasabah = "+n1.nasabah);
		System.out.println("no. urut = "+n1.no++);
		n1.nama = "Andi";
		System.out.println("nama = "+n1.nama);
		n1.tarikSaldo(1, 70);
		System.out.println(" ");
		
		BankA n2 = new BankA();
		System.out.println("no. urut = "+n2.no++);
		n2.nama = "Meli";
		System.out.println("nama = "+n2.nama);
		n2.tarikSaldo(2, 20);
	}
}