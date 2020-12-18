package com.icss.boss.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.icss.boss.service.IMoviePack;
import com.icss.boss.service.dto.MoviesPackageDTO;
import com.icss.dao.HelloDao;

@WebService
public class MoviePackImpl implements IMoviePack {
	
	@Autowired
	private HelloDao helloDao;

	@Override
	public List<MoviesPackageDTO> getMoviesPackageList() throws Exception{
		
		List<MoviesPackageDTO> packs = new ArrayList<MoviesPackageDTO>();
		
		MoviesPackageDTO pack1 = new MoviesPackageDTO();
		pack1.setPackageName("笑傲江湖");
		pack1.setOriginalPrice(38.5);
		
		MoviesPackageDTO pack2 = new MoviesPackageDTO();
		pack2.setPackageName("指环王");
		pack2.setOriginalPrice(68.3);
		
		
		packs.add(pack1);
		packs.add(pack2);		
		
		System.out.println("收到请求-" + new Date());
		
		helloDao.sayHello("xiaohp");
		helloDao.payMoney(138.5);
		
		
		return packs;
	}

}
