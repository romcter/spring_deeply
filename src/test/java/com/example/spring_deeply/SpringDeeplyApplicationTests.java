package com.example.spring_deeply;

import com.example.spring_deeply.entity.PrototypeBean;
import com.example.spring_deeply.entity.SingletonBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class SpringDeeplyApplicationTests {

	@Autowired
	private ApplicationContext context;

	private static final String NAME = "John Smith";

	@Test
	void testSingletonScope() {

		SingletonBean singletonBeanA = (SingletonBean) context.getBean("singletonBean");
		SingletonBean singletonBeanB = (SingletonBean) context.getBean("singletonBean");

		singletonBeanA.setName(NAME);
		assertEquals(NAME, singletonBeanB.getName());

	}

	@Test
	void testPrototypeScope() {

		PrototypeBean prototypeA = (PrototypeBean) context.getBean("prototypeBean");
		PrototypeBean prototypeB = (PrototypeBean) context.getBean("prototypeBean");

		prototypeA.setName(NAME);
		assertNotEquals(NAME, prototypeB.getName());

	}

	@Test
	void testPrototypeInsideSingletonScope() {

		SingletonBean firstSingleton = context.getBean(SingletonBean.class);
		PrototypeBean firstPrototype = firstSingleton.getPrototypeBean();
		firstPrototype.setName(NAME);

		assertEquals(NAME, firstPrototype.getName());

		// get singleton bean instance one more time
		SingletonBean secondSingleton = context.getBean(SingletonBean.class);
		PrototypeBean secondPrototype = secondSingleton.getPrototypeBean();

		assertEquals(NAME, secondPrototype.getName());
		assertEquals(firstPrototype, secondPrototype, "The same instance should be returned");

	}

}
