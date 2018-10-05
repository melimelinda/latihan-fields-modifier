public class BankA{
	int nasabah;
	final int minimums=50;
	final String bank="Bank A";
	private int saldo=100;
	static long no=1;
	String nama;
	int sisa=0;


	

	void tarikSaldo(int pilcara, int ambil){
		
			if (pilcara==1){

				System.out.println("jumlah saldo anda= "+saldo);
				System.out.println("saldo yang terambil = "+ambil);
				sisa=saldo-ambil;
				
				if(sisa<minimums){
					System.out.println("Maaf Anda tidak dapat melakukan transaksi karena sisa saldo anda kurang dari 50");
				}else{
					System.out.println("sisa = "+sisa);
				}
			}
			else{
				
				
				System.out.println("jumlah saldo anda = "+saldo);
				System.out.println("saldo yang terambil = "+ambil);
				sisa=saldo-ambil;
				if(sisa<minimums){
					System.out.println("Maaf Anda tidak dapat melakukan transaksi karena sisa saldo anda kurang dari 50");
				}
				else{
					System.out.println("sisa = "+sisa);
					System.out.println("Selamat anda telah melakukan transaksi");
				}
			}
		
	}
}