public class VatCalculate{ // 2
	public static void main(String[] args) {
	     int productPrice = 100;
		float vat = 0.07f;
		float sum = productPrice + (productPrice*vat);

		System.out.println("ราคาสินค้า คือ "+ productPrice +" บาท");
		System.out.println("ภาษีมูลค่าเพิ่ม คือ "+ productPrice*vat +" บาท");
		System.out.println("ราคาสุทธิ คือ "+ sum +" บาท");
	}
}