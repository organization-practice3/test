package org.zerock.githubpractice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubPractice2Application {

    public static void main(String[] args) {
        System.out.println("브랜치를 통한 수정");
        a();
        c();
        SpringApplication.run(GitHubPractice2Application.class, args);
    }

    public static void a() {
        int a,b,c;
        a = 10;
        b = 20;

        c = a + b;

        System.out.println(c);

    }

    public static void c() {
        String a = "브렌치 테스트";
        System.out.println(a);
    }

    public  static  void zi() {}

}
