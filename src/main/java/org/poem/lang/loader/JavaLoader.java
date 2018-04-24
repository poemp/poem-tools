package org.poem.lang.loader;

import org.poem.lang.SearchJava;
import org.poem.lang.core.JavaClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Java Class 加载
 */
public class JavaLoader {

    /**
     * 需要加载的类
     */
    private List<String> classNames;

    /**
     * 类加载
     */
    private static JavaLoader classLoader;

    /**
     * constructor
     * @param classNames
     */
    private JavaLoader(List<String> classNames) {
        this.classNames = classNames;
    }


    /**
     * 加载类
     * @return
     */
    public List<JavaClass> getJavaClass(){
        Class clazz = this.getClass();
        Method[] methods = clazz.getMethods();
        Field[] fields = clazz.getFields();
        Package packag = clazz.getPackage();
        Annotation[] annotations = clazz.getAnnotations();
        return null;
    }

    /**
     * 组装数据
     * @param classNames
     * @return
     */
    public static JavaLoader getInstance(List<String> classNames) {
        return new JavaLoader(classNames);
    }

    public static void main(String[] args) {
        String path  = "E:\\12-myFolder\\05-commons-tools\\commons-tools\\src\\main\\java\\org\\poem";
        List<String> file = SearchJava.getInstance(path).search();
        JavaLoader javaLoader = JavaLoader.getInstance(file);
        javaLoader.getJavaClass();
    }
}