package week1test;

import java.util.Scanner;
// 자바 문법 기초 테스트 1
public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cook = sc.nextLine();
        double star = sc.nextDouble();
        sc.nextLine();
        int istar = (int)star;
        double per = ((double) istar/(double) 5)*100;
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String text3 = sc.nextLine();
        String text4 = sc.nextLine();
        String text5 = sc.nextLine();
        String text6 = sc.nextLine();
        String text7 = sc.nextLine();
        String text8 = sc.nextLine();
        String text9 = sc.nextLine();
        String text10 = sc.nextLine();

        System.out.println("["+cook+"]");
        System.out.println("별점은 : " + istar + "("+per+"%)" );
        System.out.println("1. "+text1);
        System.out.println("2. "+text2);
        System.out.println("3. "+text3);
        System.out.println("4. "+text4);
        System.out.println("5. "+text5);
        System.out.println("6. "+text6);
        System.out.println("7. "+text7);
        System.out.println("8. "+text8);
        System.out.println("9. "+text9);
        System.out.println("10. "+text10);
    }
}
/* 입력예시
백종원 돼지고기 김치찌개 만들기
4.5
돼지고기는 핏물을 빼주세요.
잘익은 김치 한포기를 꺼내서 잘라주세요.
냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
다진마늘 한스푼, 설탕 한스푼 넣어주세요.
종이컵으로 물 8컵 부어서 센불에 끓여주세요.
핏물 뺀 돼지고기를 넣어주세요.
된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
중불로 줄여서 오래 끓여주세요~!!
마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
 */