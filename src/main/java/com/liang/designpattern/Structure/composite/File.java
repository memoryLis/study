package com.liang.designpattern.Structure.composite;

// Leaf（叶子节点）
class File implements FileSystem {
    private String name;
    
    public File(String name) {
        this.name = name;
    }
    
    @Override
    public void display() {
        System.out.println("File: " + name);
    }

    @Override
    public Integer count() {
        return 1;
    }
}