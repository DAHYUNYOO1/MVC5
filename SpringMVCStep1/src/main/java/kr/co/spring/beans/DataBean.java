package kr.co.spring.beans;

public class DataBean {
	
	//프로퍼티 ?변수와 변수에대한 세컨 메서드를가지고 있는것 한덩어리르 묶어 프로퍼티라고불린다 
	// map, list 사용 시 자동형변환이 불가하여 무조건 String으로 받아야하는데 프로퍼티를 사용하여 사용자가원하는 변수로 정의 가능
	// 파라미터와 변수명은 동일해야함 
	
    private int data1;
    private int data2;
    private int[] data3;
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	public int[] getData3() {
		return data3;
	}
	public void setData3(int[] data3) {
		this.data3 = data3;
	}
    
    
    
	

}
