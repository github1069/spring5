package com.etc.facbean;

/**
 * @author root
 * @create 2021/10/26 21:24
 */
public class Cat {
	private String codeId;
	private String name;

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat{" +
				"codeId='" + codeId + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
