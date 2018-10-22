## springboot整合logback日志框架

## springboot整合SpringData JPA
1. 如果数据库中已经建了表且设置了主键自动生成，注意主键的自动生成策略要写成@GeneratedValue(strategy = GenerationType.IDENTITY)。默认是使用auto表示
程序控制自动生成，IDENTITY：主键由数据库自动生成（主要是自动增长型）。
2. 


## lombok
可以让项目打包是自动给实体加上get，set方法（给实体类加上@Data注解），配合lombok在IDEA的插件效果更佳

## 使用spring data提供的PageHelper实现分页查询，参考sell.controller.BuyerOrderController类

## 配置Jackson使返回给前端为空的字段不显示

