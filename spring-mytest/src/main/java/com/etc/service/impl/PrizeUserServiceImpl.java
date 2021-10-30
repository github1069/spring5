package com.etc.service.impl;

import com.etc.entity.PrizeGame;
import com.etc.service.PrizeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author alex wong
 * @since 2021-09-05
 */
@Service
public class PrizeUserServiceImpl implements PrizeUserService {
	@Autowired
	private PrizeGame prizeGame;

//	private  List<String> textList = new ArrayList();

	private static final String USERTEST = "USERTEST";

	public PrizeUserServiceImpl(){
		System.out.println("开始创建这个PrizeUserServiceImpl");
	}



}
