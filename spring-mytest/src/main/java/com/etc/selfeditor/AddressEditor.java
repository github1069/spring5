package com.etc.selfeditor;

import java.beans.PropertyEditorSupport;

/**
 * @author root 属性编辑器
 * @create 2021/10/7 21:14
 */
public class AddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] addressIndex = text.split("_");
		Address address = new Address();
		address.setProvince(addressIndex[0]);
		address.setCity(addressIndex[1]);
		address.setTown(addressIndex[2]);
		this.setValue(address);
	}
}
