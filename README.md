## code-generator

###### 轻量级的代码生成器

* 配置简单轻量
* 基于freemarker,可轻松自定义生成模板

###### 配置文件入口

* generate-config.properties

  部分配置摘要:

  ```properties
  # 需生成的表 多张表用英文逗号隔开,大小写不敏感,不配置此项则生成全部表  USER,order
  INCLUDE_TABLE_NAME=SIMPLE_MYBATIS_USER,simple_mybatis_order
  #生成文件输出路径 不配置则默认为本项目路径
  #FILE_OUT_PUT_PATH=E:/github/code-generator/src/main/java/
  #生成文件的包名  不配置则默认为test.generator
  #BASE_PACKAGE=com.baidu.search
  ```

###### 支持的数据库

* mysql
* oracle

###### 所需环境

* jdk1.7 +

###### 版本信息

| 版本 |                             功能                             |
| :--: | :----------------------------------------------------------: |
| v1.0 | 从指定mysql或oracle数据库生成dao、pojo及mybatis3.x 的xml文件 |

##### 参考文档

- ##### [快速开始](./quickstart.md)

## License

The code generator is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

```
本项目用于工作中代码生成. 为本人将工作中使用的代码生成工具整理并开源,已发布第一版
欢迎各位补充或issue留言交流.
```

##### 个人联系方式,添加请注明:来自gitHub

##### QQ: 2361883887

##### 微信:

![二维码](https://github.com/zhuyizhuo/notes/blob/master/wechat.png?raw=true)

