package study0211;

public class java_0210 {

	public static void main(String[] args) {
		
		int[] total = new int[15];
//		for(int i = 0; i < total.length; i++) {
//			int a = (int)(Math.random()*50+1);	
//		if(a%2 == 0 ) {
//				total[i] = a;
//				System.out.println(total[i]);				
//			}
//		}
		
		int idx = 0;
		while(true) {
			int temp = (int)(Math.random()*50+1);
			if(temp%2 == 0) {
				boolean isSame = false; // 같으면 true, 다르면 false
				for(int i = 0; i<idx; i++) {
					if(total[i] == temp) 
					isSame = true;
				}
				if(!isSame)
				total[idx++] = temp;
			}
			if(idx == total.length) break;
			// idx의 값이 배열크기와 같으면 배열의 마지막 공간까지 데이터 저장
			
		}
		
		for(int i = 0; i <total.length; i++) {
			System.out.println(total[i]);
		}

	}

}
