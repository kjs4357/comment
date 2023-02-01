package com.command.comment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommentApplicationTests {

	@Test
	void contextLoads() {
	}

}

public class UserRepositoryTests extends CommentApplicationTests{
	@Autowired
	private UserRepository userRepository;

	@Test
	public void read()
}