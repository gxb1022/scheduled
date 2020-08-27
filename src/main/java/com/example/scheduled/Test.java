package com.example.scheduled;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
//        Person person = new Person.Builder().age(23).name("ssss").build();
//        System.out.println(person.toString());
        File file = new File("C:/Users/86159/Desktop/郭晓斌.docx");
        try(FileInputStream fis = new FileInputStream(file)){
            //代码逻辑
        }catch (IOException e){
            e.getMessage();
        }

    }


}
