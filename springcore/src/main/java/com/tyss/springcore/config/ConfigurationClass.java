package com.tyss.springcore.config;

import org.springframework.beans.factory.support.GenericTypeAwareAutowireCandidateResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tyss.springcore.di.Animal;
import com.tyss.springcore.di.Cat;
import com.tyss.springcore.di.Dog;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

@Configuration
public class ConfigurationClass {
    @Bean(name="hello")
//  @Scope("prototype")
    
	public Hello getHello() {
    	Hello hello = new Hello();
    	hello.setMsg("I love Python");
		return hello;
	}
    
    @Bean(name="dog")
	public Animal getDog() {
		return new Dog();
	}
    
    @Bean(name="cat")
    public Cat getCat() {
    	return new Cat();
    }
    
    @Bean(name="pet")
    public Pet getPet() {
    	Pet pet = new Pet();
    	pet.setName("Bittu");
    	/*pet.setAnimal(getDog());*/
    	return pet;
    }
}
