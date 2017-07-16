package cn.meijunjie.mybatis.generate;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generate {

	public static void main(String[] args) throws IOException, XMLParserException, 
	InvalidConfigurationException, SQLException, InterruptedException {
		
		List<String> warnings = new ArrayList<String>();
		
		boolean overwrite = true;
		
		File configFile = new File("/Users/leeco/git/mybatis/mybatis-generate/src/main/resources/mybatis-generate-config.xml");
		
		ConfigurationParser configurationParser = new ConfigurationParser(warnings);
		Configuration configuration = configurationParser.parseConfiguration(configFile);
		
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
		
		myBatisGenerator.generate(null);

	}

}
