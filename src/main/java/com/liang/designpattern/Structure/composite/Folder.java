package com.liang.designpattern.Structure.composite;

import java.util.ArrayList;
import java.util.List;

// Composite（组合节点）
class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children;
    
    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }
    
    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }
    
    public void remove(FileSystem fileSystem) {
        children.remove(fileSystem);
    }
    
    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystem fileSystem : children) {
            fileSystem.display();
        }
    }

    @Override
    public Integer count() {
        int i =0;
        for (FileSystem child : children) {
             i= i+ child.count();
        }
        return i;
    }
}