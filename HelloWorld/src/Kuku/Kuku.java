package Kuku;

public class Kuku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("九九を表示するプログラム");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9 ; j++) {
				if (i * j < 10) {
					System.out.println(i + " * " + j + " = " + i*j);
				}else if (j * i >= 10 ){
					System.out.println(i + " * " + j + " = " + i*j);
					}
			}
		}
	}

}
