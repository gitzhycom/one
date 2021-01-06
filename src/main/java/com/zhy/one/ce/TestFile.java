package com.zhy.one.ce;

import java.io.File;
import java.io.FileFilter;

/**
 * @description:
 * @author: zhanghongyu
 * @time: 2020/12/17 10:30
 */
public class TestFile {
    public static void main(String[] args) {
        String url = "D:/";
        File file = new File(url);
        if(file.exists() && file.isDirectory()) findAllJavaFile(file,".sql");
    }
    public static void findAllJavaFile(File file, final String type){
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname==null) {
                    System.out.println(file.getName());
                    return false;
                }
                if(pathname.isDirectory()) findAllJavaFile(pathname,type);
                if (pathname.getName().endsWith(type)) return true;
                else return false;
            }
        });
        if(files==null) {
            System.out.println(file.getPath()+"-------");
        }else{
            for(File f : files){
                System.out.println(f.getName());
            }
        }
    }
}
