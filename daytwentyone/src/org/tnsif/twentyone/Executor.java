package org.tnsif.twentyone;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//functional interface demo
public class Executor {

	public static void main(String[] args) {
		
		Cube c=(no)->(no*no*no);
		System.out.println(c.getCube(3));
		
		Operations obj;
		
		obj=(a,b)->a*b;
		System.out.println(obj.performArithmetic(3, 4));
		
		obj=(a,b)->a+b;
		System.out.println(obj.performArithmetic(3, 4));
		
		obj=(a,b)->a-b;
		System.out.println(obj.performArithmetic(3, 4));
		
		Supplier<String> mysupplier;
		
		mysupplier=()->("Hello");
		System.out.println(mysupplier.get());
		
		mysupplier=()->("Welcome to JDK 1.8");
		System.out.println(mysupplier.get());

		Consumer<Integer> consumer;
		consumer=(n)->{
			if(n>0) System.out.println("positive value");
			else System.out.println("negative value");
		};
		
		consumer.accept(3);
		consumer.accept(-3);
		
		Predicate<Integer> number;
		number=(no)-> no%2==0;
		System.out.println(number.test(10)?"Even":"Odd");
		
		Function<Integer,String> fun;
		fun=(no)->no>0?"Positive":"Negative";
		
		System.out.println(fun.apply(21));
		System.out.println(fun.apply(-2));

		BiFunction<Integer,Integer,Integer> bfun;
		bfun=(a,b)->a>b?a:b;
		System.out.println(bfun.apply(10, 20));
	}

}
