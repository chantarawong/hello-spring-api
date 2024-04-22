package hello.spring.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import hello.spring.api.controller.HelloController;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	//write a test case for the controller	
	@Test
	void testHelloController() {
		HelloController controller = new HelloController();
		String result = controller.sayHello();
		assertEquals(result, "Hello World");
	}


}
