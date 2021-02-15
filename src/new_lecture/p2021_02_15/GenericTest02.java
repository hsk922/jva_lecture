package new_lecture.p2021_02_15;

class TestClass02 {
	private Object member;

	public void setValue(Object value) {
		member = value;
	}// Object = SuperClass

	public Object getValue() { // Object value = 3;
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass02 obj01 = new TestClass02();
//		업캐스팅 : 자식객체의 주소를 부모에게 전달
//		Object value = 3;				//			오토박싱 + 업캐스팅
//		Object value = new Integer(3);	//new를 사용하여 박싱 + 업캐스팅
//		obj01.setValue(new Integer(3));
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		int n1 = ((Integer)(obj01.getValue()));	
//		우변이 Object로 들어와서 Integer로 다운캐스팅함. 오토언박싱+다운캐스팅
		int n2 = ((Integer)(obj01.getValue())).intValue();	// 언박싱+다운캐스팅
		
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());
		double n3 = (Double)(obj01.getValue());					//오토언박싱+다운캐스팅
		double n4 = ((Double)(obj01.getValue())).doubleValue();	//언박싱+다운캐스팅
		
		
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

	}
}
