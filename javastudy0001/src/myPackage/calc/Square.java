package myPackage.calc;

public class Square extends Calculation {
		//Squareクラス
    /**
     * 値を2乗します。
     */
	public void calculate () {
		//value を２乗する
		this.result = this.value * this.value;
		this.output();
	}
}
