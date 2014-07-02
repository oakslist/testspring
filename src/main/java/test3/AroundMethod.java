package test3;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethod implements MethodInterceptor {
	
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("Method name : "
                + methodInvocation.getMethod().getName());
        System.out.println("Method arguments : "
                + Arrays.toString(methodInvocation.getArguments()));

        // before
        System.out.println("AroundMethod : Вместо BeforeMethod!");

        try {
            // doing
            Object result = methodInvocation.proceed();

            // after
            System.out.println("AroundMethod : Вместо AfterMethod!");

            return result;

        } catch (IllegalArgumentException e) {
            // exception
            System.out
                    .println("AroundMethod : Вместо ThrowMethod!");
            throw e;
        }
    }

}
