package org.zerock.githubpractice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubPractice2Application {

    public static void main(String[] args) {
        System.out.println("브랜치를 통한 수정");
        SpringApplication.run(GitHubPractice2Application.class, args);
    }

}
