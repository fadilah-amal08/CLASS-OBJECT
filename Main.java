

public class Main {

	public static void main(String[] args) {
	System.out.println("Object Kelas Kotak");
	// membuat object dari class kotak
	Kotak Main = new Kotak();
		
	// method setter kotak
	Main.setpanjang(6.73);
	Main.setlebar(5.50);
		
	// method getter kotak
	System.out.println("panjang : " + Main.getpanjang());
	System.out.println("lebar : " + Main.getlebar());
	System.out.println("luas : " + Main.getpanjang()*Main.getlebar());
	System.out.println("keliling : " + Main.getlebar()*Main.getpanjang()*Main.getlebar()*Main.getpanjang());
	
	System.out.println("------Object Kelas mahasiswa------");
	//membuat object dari class mahasiswa
	Mahasiswa mahasiswa = new Mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "NURFADILAH";
	mahasiswa.nim = "D0217315";
	mahasiswa.alamat = "CAMPALAGIAN";
	mahasiswa.golonganDarah = "--";
	mahasiswa.status = "Mahasiswa";
	mahasiswa.tinggiBadan = "155";
	mahasiswa.beratBadan = "45";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getnama());
	System.out.println("nim : " + mahasiswa.getnim());
	System.out.println("alamat : " + mahasiswa.getalamat());
	System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
	System.out.println("Status : " + mahasiswa.getstatus());
	System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
	System.out.println("berat badan : " + mahasiswa.getberatBadan());

	System.out.println("Object Kelas node");
	//membuat object darikelas node
	Node node = new Node();
	
	//method setter node
	node.label = "TOKOPEDIA";
	node.Value = 5;
	
	//method getter node
	System.out.println("Nama Label : " + node.getlabel());
	System.out.println("jumlah label : " + node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object darikelas stack
	Stack stack = new Stack();
	
	stack.arrayValue[0] = "fadilah";
	stack.arrayValue[1] = "dina";
	stack.arrayValue[2]= "nisma";
	stack.arrayValue[3]= "ira";
	stack.setValueAt(2 ,"nisma");

	//menampilkan stack
	for(int i=0;i<stack.arrayValue.length;i++){System.out.println(stack.arrayValue[i]);};

	
	}
}

