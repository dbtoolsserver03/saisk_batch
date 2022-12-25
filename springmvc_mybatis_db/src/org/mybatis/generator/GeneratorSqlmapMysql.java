package org.mybatis.generator;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import cn.itcast.ssm.common.file.MyDirectoryUtils;

public class GeneratorSqlmapMysql {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("res\\generatorConfigMysql.xml"); 
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	public static void main(String[] args) throws Exception {
		try {
			
			File directory = new File("");//参数为空

			String courseFile = directory.getCanonicalPath() ;

			MyDirectoryUtils.delFile(courseFile+"/src/cn/itcast/ssm/po/original", "", true);
			MyDirectoryUtils.delFile(courseFile+"/src/cn/itcast/ssm/mapper/original", "", true);

			GeneratorSqlmapMysql generatorSqlmap = new GeneratorSqlmapMysql();
			generatorSqlmap.generator();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

}
