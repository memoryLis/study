package com.liang.designpattern.creational.simplefactory;

/**
 * ClassName: ResouceLoader
 * Package: com.liang.designpattern.creational.simplefactory
 * Description:
 *
 * @Author liang
 * @Create 2025/5/8 15:18
 */
public class ResourceLoader {
    public static void main(String[] args) {
        ResourceLoader resourceLoader = new ResourceLoader();
        resourceLoader.load("asf :af :af :adfs ");
    }


    public Resource load(String url){
      String urlPrefix = getPrefix(url);
        Resource resource = ResourceFactory.createResource(urlPrefix, url);
        return  resource;
    }



    private String getPrefix(String url) {
        if(url == null || "".equals(url) || !url.contains(":")){
            throw  new ResourceException("url错误");
        }
        //进行分割字符，获取：前面部分
        String[] split = url.split(":");
        return split[0];
    }
}
