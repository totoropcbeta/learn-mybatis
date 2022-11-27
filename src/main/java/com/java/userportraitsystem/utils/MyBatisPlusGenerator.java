package com.java.userportraitsystem.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yuanhang08
 * @Date: 2022/7/27 00:08
 * @Description:代码生成器 仅用于生成实体类 其他由mybatis-generator生成 先运行mybatis-generator,再运行这个类覆盖实体类
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");// 得到当前项目的路径
        gc.setOutputDir(projectPath + "/src/main/java");   // 生成文件输出根目录
        gc.setOpen(false);// 生成完成后不弹出文件框
        gc.setFileOverride(true);  // 文件覆盖
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// 是否要有映射ResultMap
        gc.setBaseColumnList(false);// 是否要有基础的列
        gc.setSwagger2(true); // 开启 swagger 模式
        gc.setIdType(IdType.AUTO);// 设置主键策略
        gc.setDateType(DateType.ONLY_DATE);// 设置时间类型 date类型
        gc.setAuthor("大脸猫"); // 设置作者名字
        // 自定义文件命名, 注意 %s 会自动填充表实体属性！
        //gc.setControllerName("%sController");
        //gc.setServiceName("%sService");
        //gc.setServiceImplName("%sServiceImpl"); // 设置生成的Service接口的名字的首字母是否为I Service默认生成会有I前缀
        //gc.setMapperName("%sMapper");
        //gc.setXmlName("%sMapper");
        autoGenerator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);   // 设置数据库类型 MySQL
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://localhost:3306/utvsdb?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true");  //指定数据库
        autoGenerator.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);      // 表名生成策略 下划线转驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel); // 字段映射 下划线转驼峰
        strategy.setEntitySerialVersionUID(true); // 默认true
        strategy.setInclude("ups_app_info");     // 本次运行需要生成的表
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        strategy.setEntityLombokModel(true); // 实体类使用lombok注解
        autoGenerator.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.java.userportraitsystem");
        //pc.setController("controller");
        //pc.setService("service");
        //pc.setServiceImpl("service.impl");
        //pc.setMapper("mapper");
        pc.setEntity("entity");
        autoGenerator.setPackageInfo(pc);

        // 配置模板 控制是否生成 Controller Service ServiceImpl Mapper Xml
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController(null); // 使用空字符串或null 控制 不生成 Controller
        templateConfig.setService(null); // 使用空字符串或null 控制 不生成 Service
        templateConfig.setServiceImpl(null); // 使用空字符串或null 控制 不生成 ServiceImpl
        templateConfig.setMapper(null); // 使用空字符串或null 控制 不生成 Mapper
        templateConfig.setXml(null); // 已经另外配置了xml输出路径 使用null 控制在主路径 不生成 Xml
        autoGenerator.setTemplate(templateConfig);

        //// 自定义配置
        //InjectionConfig cfg = new InjectionConfig() {
        //    @Override
        //    public void initMap() {
        //        // to do nothing
        //    }
        //};
        //// 如果模板引擎是 velocity
        //String templatePath = "/templates/mapper.xml.vm";
        //// 自定义输出配置 自定义xml文件生成位置
        //List<FileOutConfig> focList = new ArrayList<>();
        //// 自定义配置会被优先输出
        //focList.add(new FileOutConfig(templatePath) {
        //    @Override
        //    //输出了 静态资源下的 Mapper
        //    public String outputFile(TableInfo tableInfo) {
        //        // 自定义输出文件名, 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化
        //        return projectPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
        //    }
        //});
        //cfg.setFileOutConfigList(focList);
        //autoGenerator.setCfg(cfg);
        // 模板引擎
        autoGenerator.setTemplateEngine(new VelocityTemplateEngine());
        // 执行生成
        autoGenerator.execute();
    }
}

