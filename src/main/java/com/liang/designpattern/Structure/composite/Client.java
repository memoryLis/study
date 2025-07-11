package com.liang.designpattern.Structure.composite;

public class Client {
    public static void main(String[] args) {
        FileSystem file1 = new File("file1.txt");
        FileSystem file2 = new File("file2.txt");
        
        Folder folder1 = new Folder("folder1");
        folder1.add(file1);
        folder1.add(file2);
        
        FileSystem file3 = new File("file3.txt");
        FileSystem file4 = new File("file4.txt");
        
        Folder folder2 = new Folder("folder2");
        folder2.add(file3);
        folder2.add(file4);
        folder2.add(folder1);
        
        folder2.display();
        System.out.println(folder2.count());
    }
}