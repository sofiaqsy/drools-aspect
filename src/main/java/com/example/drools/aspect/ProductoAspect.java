package com.example.drools.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.example.drools.entity.Producto;

@Aspect
@Component
public class ProductoAspect {

	@Before(value = "execution(* com.example.drools.business.ProductoBusiness.*(..)) and args(producto)")
	public void beforeAdvice(JoinPoint joinPoint, Producto producto) {
		System.out.println("Antes del método:" + joinPoint.getSignature());

		System.out.println("Se creo un nuevo producto");
	}

}
