package com.liang.designpattern.behavior2.command.editor;

import java.util.Stack;

/**
 * ClassName: TextEditor
 * Package: com.liang.designpattern.behavior2.command.editor
 * Description:
 *
 * @Author liang
 * @Create 2025/5/17 17:35
 */
public class TextEditor {
     public StringBuilder sb =new StringBuilder();
     public Stack<AddTextCommand> stack = new Stack<>();



     public void add(String text){
      //添加命令
      AddTextCommand addTextCommand = new AddTextCommand(sb, text);
      addTextCommand.execute();
      stack.push(addTextCommand);
     }
     public void undo(int i){
         if(i>stack.size()){
             System.out.println("没有写入那么多次");
             return;
         }
      //i表示要回滚几次
      for(int a = 1;a <=i ;a++){
       AddTextCommand pop = stack.pop();
        pop.undo();


      }

     }


}
