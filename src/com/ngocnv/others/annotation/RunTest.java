package com.ngocnv.others.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RunTest {

    public static void main(String[] args) {
        System.out.println("Testing.....");
        int passed = 0, failed = 0, count = 0, ignore = 0;
        Class<TestExample> obj = TestExample.class;

        // Process @TesterInfo
        if (obj.isAnnotationPresent(TestInfo.class)) {
            TestInfo testerInfo = obj.getAnnotation(TestInfo.class);
            System.out.printf("%nPriority :%s", testerInfo.priority());
            System.out.printf("%nCreatedBy :%s", testerInfo.createdBy());
            System.out.printf("%nTags :");
            System.out.println(Arrays.stream(testerInfo.tags()).collect(Collectors.joining(", ")));
            System.out.printf("%nLastModified :%s%n%n", testerInfo.lastModified());
        }

        // Process @Test
        for (Method method : obj.getDeclaredMethods()) {
            // if method is annotated with @Test
            if(method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);

                // if enabled = true (default)
                if (test.enabled()) {
                    try {
                        method.invoke(obj.newInstance());
                        System.out.printf("%s - Test '%s' - passed %n", ++count, method.getName());
                        passed++;
                    } catch (Throwable ex) {
                        System.out.printf("%s - Test '%s' - failed: %s %n", ++count, method.getName(), ex.getCause());
                        failed++;
                    }
                }
            } else {
                System.out.printf("%s - Test '%s' - ignored%n", ++count, method.getName());
                ignore++;
            }
        }
        System.out.printf("%nResult : Total : %d, Passed: %d, Failed %d, Ignore %d%n", count, passed, failed, ignore);
    }
}
