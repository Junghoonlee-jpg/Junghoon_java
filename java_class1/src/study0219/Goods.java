package study0219;

public class Goods {
	// 인스턴스 변수
	String goodsName; // 상품명
	String brand; // 브랜드
	int quantity; // 수량
	
	Goods(){} // 기본 생성자메서드
	Goods(String goodsName, int quantity) {
		this.goodsName = goodsName;
		this.quantity = quantity;
	}
	Goods(String goodsName, String brand, int quantity){
		this.goodsName = goodsName;
		this.brand = brand;
		this.quantity = quantity;
	}

}
