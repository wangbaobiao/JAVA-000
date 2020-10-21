package com.example.demo.domain;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloClassLoader extends ClassLoader {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String className = "Hello";
        Class<?> hello = new HelloClassLoader().findClass(className);
        hello.getMethod("hello").invoke(hello.newInstance());
    }

    @Override
    protected Class<?> findClass(String className) {
        byte[] byteArr = new byte[0];
        try {
            byteArr = Files.readAllBytes(Paths.get("/Users/wangbaobiao/workspace/myProject/RainSea/src/main/java/com/example/demo/domain/Hello.xlass"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < byteArr.length; i++) {
            byteArr[i] = (byte) (255 - byteArr[i]);
        }
        return defineClass(className, byteArr, 0, byteArr.length);
    }
}
