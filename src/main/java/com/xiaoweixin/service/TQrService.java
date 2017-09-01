package com.xiaoweixin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoweixin.dto.TQr;
import com.xiaoweixin.dto.TQrExample;
import com.xiaoweixin.repository.TQrMapper;

@Service
public class TQrService {
	
	
	@Autowired
	public TQrMapper tQrMapper;
	
	public List<TQr> findTQrList(TQrExample example){
		return tQrMapper.selectByExample(example);
		
	}

}
