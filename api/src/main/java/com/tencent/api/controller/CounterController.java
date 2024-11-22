package com.tencent.api.controller;

import com.tencent.common.dto.*;
import com.tencent.service.feign.CounterFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * counter控制器
 */
@RestController
@Slf4j
public class CounterController {

	@Resource
	CounterFeign counterFeign;

	/**
	 * 获取当前计数
	 *
	 * @return API response json
	 */
	@GetMapping(value = "/api/count")
	ApiResponse get() {
		log.info("/api/count get request");
		return counterFeign.get();
	}


	/**
	 * 更新计数，自增或者清零
	 *
	 * @param request {@link CounterRequest}
	 * @return API response json
	 */
	@PostMapping(value = "/api/count")
	ApiResponse create(@RequestBody CounterRequest request) {
		log.info("/api/count post request, action: {}", request.getAction());
		return counterFeign.create(request);
	}

}
