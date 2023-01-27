import java.util.Scanner;
public class DongulerOrnek3 {

	public static void main(String[] args) {
		// Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayý giriniz : ");
		int sayi = scan.nextInt();
		
		System.out.println("4 ' ün kuvvetleri");
		System.out.println("-------------");
		
		for(int i=1; i<=sayi; i=i*4) {
			System.out.println(i);
		}
		System.out.println("-------------");
		System.out.println("5 ' in kuvvetleri");
		System.out.println("-------------");
		
		for(int i=1; i<=sayi; i=i*5) {
			System.out.println(i);
		}

	}

}
