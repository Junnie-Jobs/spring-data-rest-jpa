package me.wonwoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestJpaApplication.class, args);
	}

//	  @Bean
//    CommandLineRunner runner(AccountRepository accountRepository) {
//        return args -> {
//
//            Arrays.asList(
//                    new Account(1L, "wonwoo", "wonwoo@test.com", "qwer"),
//                    new Account(2L, "kevin", "kevin@test.com", "asdf"),
//                    new Account(3L, "wonwoo", "kevin@test.com", "qwqw")
//            )
//                    .forEach(account -> accountRepository.save(account));
//            accountRepository.findAll().forEach(System.out::println);
//        };
//    }
}
