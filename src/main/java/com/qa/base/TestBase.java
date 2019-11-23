package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @ Motto：No pains, no gains！
 * @ Project：JavaStudy
 * @ Author：duzhengjun
 * @ dateTime：2019/9/3 9:26 下午
 */
public class TestBase {
    public Properties prop;

    public TestBase(){
        try{
            prop=new Properties();
            FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/config/config.properties");
            prop.load(fis);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //main函数主要是为了检测user.dir目录是否正确，执行结果：E:\Java_project\MavenProject_script正是当前项目的目录
    public static void main(String[] args){
        System.out.println(System.getProperty("user.dir"));
    }

}
