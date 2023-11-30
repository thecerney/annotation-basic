package cerney.annotation.basic;

public class OverrideChildClass extends OverrideParentClass {
    //철자 (대소문자) 오류
    @Override
    public void doprint(String arg, int num) {
        System.out.println("Child Method");
    }

    //1. 리턴타입 상이 (void <-> String)
    //2. 매개변수 상이
    // * 매개변수는 순서, 개수, 타입이 모두 같아야 함
    @Override
    public String doPrint(int num, String arg) {
        System.out.println("Child Method");
    }
}