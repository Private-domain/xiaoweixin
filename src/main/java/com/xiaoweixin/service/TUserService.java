package com.xiaoweixin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoweixin.dto.TUser;
import com.xiaoweixin.dto.TUserExample;
import com.xiaoweixin.repository.TUserMapper;

@Service
public class TUserService {
	
	
	@Autowired
	public TUserMapper tUserMapper;
	
	public List<TUser> findTUserList(TUserExample example){
		return tUserMapper.selectByExample(example);
		
	}

}
