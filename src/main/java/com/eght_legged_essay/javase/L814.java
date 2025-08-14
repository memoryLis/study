package com.eght_legged_essay.javase;

import lombok.Data;

/**
 * ClassName: L814
 * Package: com.eght_legged_essay.javase
 * Description:
 *
 * @Author liang
 * @Create 2025/8/14 15:11
 * @Version jdk17.0
 */
@Data
public class L814 {
    public final int name1;

    String name;

    public L814(int name1){
        this.name1 = name1;
    }
    public L814(int name1, String name){
        this.name1 = name1;
        this.name = name;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
