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
    public static void main(String[] args) { // main 메소드
        System.out.println("Hello world!");
    }
}