class Maksimal{
	public static void main(String[] a){
		int angka1 = 60;
		int angka2 = 30;
		int angka3 = 50;
		int angka4 = 80;
		int angka5 = 90;
		int max = 0;
		
		if (angka1 > max)
			max = angka1;
		if (angka2 > max)
			max = angka2;
		if (angka3 > max)
			max = angka3;
		if (angka4 > max)
			max = angka4;
		if (angka5 > max)
			max = angka5;
		
		System.out.println("Program mencari angka terbesar");
		System.out.println("Angka 1 adalah "+angka1);
		System.out.println("Angka 2 adalah "+angka2);
		System.out.println("Angka 3 adalah "+angka3);
		System.out.println("Angka 3 adalah "+angka4);
		System.out.println("Angka 3 adalah "+angka5);
		System.out.println("Angka terbesar adalah "+max);
	}
}