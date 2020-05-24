import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    @Test
    public void testGenerator() {
        String projectPath = System.getProperty("user.dir");

        //注意使用包：com.baomidou.mybatisplus.generator.config.GlobalConfig
        GlobalConfig globalConfig = new GlobalConfig();
        //设置全局的配置
        globalConfig.setActiveRecord(false)//是否支持AR模式
                .setAuthor("li ben")//设置作者
                .setOutputDir(projectPath + "/src/main/java")//设置生成路径
                .setFileOverride(true)//设置文件覆盖
                .setIdType(IdType.AUTO) //设置主键生成策略
                .setServiceName("%sService")//设置生成的serivce接口的名字
                .setMapperName("%sMapper")//设置生成的mapper的名字
                .setControllerName("%sController")//设置生成的controller的名字
                .setBaseResultMap(true) //mapper.xml 是否生成 ResultMap，默认 false 不生成
                .setBaseColumnList(true)//mapper.xml 是否生成 ColumnList，默认 false 不生成
                .setEnableCache(false)//二级缓存
                .setDateType(DateType.ONLY_DATE)//java.util.Date日期类型
                .setOpen(false);//是否生成完成后打开资源管理器

        //设置数据源的配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/mybatis_study")
                .setUsername("root")
                .setPassword("root");

        // 进行策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                //                .setCapitalMode(true)//设置全局大写命名
                .setNaming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略
                .setTablePrefix("t_")//设置表名前缀
                .setSuperEntityClass("com.benjamin.bean.BaseEntity")
                .setSuperEntityColumns(new String[]{"date_created", "last_updated", "deleted"})
                .setEntityTableFieldAnnotationEnable(true)
        ;

        // 自定义模板
        TemplateConfig templateConfig = new TemplateConfig();

        // 进行包名的策略配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.benjamin")
                .setMapper("mapper")
                .setService("service")
                .setController("controller")
                .setEntity("bean")
                .setXml("mapper");


        //        InjectionConfig cfg = new InjectionConfig() {
        //            @Override
        //            public void initMap() {
        //                Map<String, Object> map = new HashMap<String, Object>();
        //                //自定义配置，在模版中cfg.superColums 获取
        //                // TODO 这里解决子类会生成父类属性的问题，在模版里会用到该配置
        //                map.put("superColums",
        //                        this.getConfig()
        //                                .getStrategyConfig()
        //                                .getSuperEntityColumns());
        //                this.setMap(map);
        //            }
        //        };


        //整合配置
        AutoGenerator autoGenerator = new AutoGenerator();
        autoGenerator.setGlobalConfig(globalConfig)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setTemplate(templateConfig)
                //                .setCfg(cfg)
                .setPackageInfo(packageConfig);

        autoGenerator.execute();
    }


    @Test
    public void test01() {
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
    }
}