package com.example.scope;

import com.example.scope.example1.Cat;
import com.example.scope.example1.Parrot;
import com.example.scope.example2.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbeanscopeApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringbeanscopeApplication.class, args);

		Boolean isSameObject = false ;
		/*
		 example 1
		 creating two beans of same class "Parrot" but with different beans name
		 Dont confuse Singleton Scope of bean with Singleton pattern of a class
		 figure 1 in resources differentiate them.

		Default Scope is Singleton
		 */

		Cat cat1 = context.getBean(Cat.class);
		Cat cat2 = context.getBean(Cat.class);


		isSameObject = cat1==cat2;// == checks references are pointing to same object
		System.out.println("Are Cat objects same ? " + isSameObject);

		Parrot parrot1 = context.getBean("parrot1", Parrot.class);
		Parrot parrot2 = context.getBean("parrot2", Parrot.class);

		System.out.println("Parrot 1 name "+ parrot1.getName());
		System.out.println("Parrot 2 name "+ parrot2.getName());

		isSameObject = parrot1 == parrot2;

		System.out.println("Are Parrots Objects are same  ? "+ isSameObject);


		/*
		example2 , explain Prototype scope of bean. and figure 2 in resources also explain it
		 */


		Dog dog1 = context.getBean(Dog.class);
		Dog dog2 = context.getBean(Dog.class);

		isSameObject = dog1 == dog2;
		System.out.println("Dogs Beans are prototype. I create only one Bean.");
		System.out.println("Dogs Objects are same " + isSameObject);

	}

}
