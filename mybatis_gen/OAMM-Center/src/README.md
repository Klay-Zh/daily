使用方法：
                                   1、删除src文件夹下com.sinosoft下的文件；
                                   2、在com.sinosoft下建立自己对应的文件夹，常包括mapper(xml)、pojo、mapper(java)文件夹；
                                   3、在配置文件（generatorConfig.xml）中javaModelGenerator、sqlMapGenerator、javaClientGenerator下配置好路径；并在下方配置好表名；
                                   4、在配置文件（generatorConfig.xml）中更改jdbcConnection中的数据库地址；
                                   4、运行GeneratorSqlmap.java中的main()即可。