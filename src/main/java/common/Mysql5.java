package common;

import org.hibernate.dialect.MySQL5Dialect;

public class Mysql5 extends MySQL5Dialect{
	public String getTableTypeString(){
		return "ENGINE=InnoDB CHARSET=utf8";
	}

}
