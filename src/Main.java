// 클래스 : .java를 .class로 바꿀때 기준이 되는 곳
// public : 접근 제어자, public(공고의, 공통의)
// 메인 클래스의 이름은 .java 파일의 이름과 일치해야한다
public class Main { // Main 클레스
    //JDK
    // compiler : .java -> .class
    // JRE
    // JDB : 디버깅

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // main 메소드
    // 자바 프로젝트(앱)는 제일 먼저 클레스의 main 메소드를 실행 시킨다.
    // => JVM의 약속

    // output
    // static : 이 프로그램이 시작될 때 무조건 실행되는 녀석임을 의미
    // public static "~" 클래스명 : 메서드의 출력값의 데이터 타입
    // -> void = "아무것도 없다" > 출력이 없다

    //input
    //클래서명("~") : 매개변수 자리
    //String[[ args : arg 문자열을 배열로 사용하겠다.
    public static void main(String[] args) { // main 메소드
        System.out.println("Hello world!");
    }
}