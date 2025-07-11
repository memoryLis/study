package com.liang.designpattern.Structure.share;

import lombok.AllArgsConstructor;

/**
 * ClassName: ChessUnit
 * Package: com.liang.designpattern.Structure.share
 * Description:
 *
 * @Author liang
 * @Create 2025/5/13 10:54
 */
@AllArgsConstructor
public class ChessUnit {
      private  int id;
      private  String name;
      private Color color;

    private static  enum Color{
      RED,BLACK

   }
}
