package com.baeldung.modules.hello.external;

import com.baeldung.modules.hello.internal.Utils;

public class HelloService {

    public static void doSomething() {
        System.out.println(Utils.getMessage());
    }

}
