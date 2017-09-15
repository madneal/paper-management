package io.renren.entity;

import java.io.Serializable;



/**
 * 文件上传
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2017-03-25 12:13:26
 */
public class SysOssEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	// 学号
	private String stuNo;
	// 姓名
	private String name;
	// 专业
	private String major;
	// 论文存放路径
	private String filePath;

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
