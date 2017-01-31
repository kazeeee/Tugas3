class Maksimal{
	public static void main(String[] a){
		int angka1 = 60;
		int angka2 = 30;
		int angka3 = 50;
		int angka4 = 80;
		int angka5 = 90;
		int max = 0;
		
		max = angka1 >= max ? angka1 : max;
		max = angka2 >= max ? angka2 : max;
		max = angka3 >= max ? angka3 : max;
		max = angka4 >= max ? angka4 : max;
		max = angka5 >= max ? angka5 : max;
		
		System.out.println("Program mencari angka terbesar");
		System.out.println("Angka 1 adalah "+angka1);
		System.out.println("Angka 2 adalah "+angka2);
		System.out.println("Angka 3 adalah "+angka3);
		System.out.println("Angka 4 adalah "+angka4);
		System.out.println("Angka 5 adalah "+angka5);
		System.out.println("Angka terbesar adalah "+max);
	}
}