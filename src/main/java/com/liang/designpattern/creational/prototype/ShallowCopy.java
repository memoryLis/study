package com.liang.designpattern.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: ShallowCopy
 * Package: com.liang.designpattern.creational.prototype
 * Description:
 *
 * @Author liang
 * @Create 2025/5/10 19:37
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShallowCopy  implements Serializable ,Cloneable {
    private int id;
    private String name ;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
