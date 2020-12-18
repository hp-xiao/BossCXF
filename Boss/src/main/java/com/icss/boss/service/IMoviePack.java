package com.icss.boss.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.icss.boss.service.dto.MoviesPackageDTO;

@WebService
public interface IMoviePack {
	@WebMethod
	public List<MoviesPackageDTO> getMoviesPackageList() throws Exception;

}
