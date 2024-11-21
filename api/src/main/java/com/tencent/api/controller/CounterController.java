package com.tencent.api.controller;

import com.tencent.common.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * counter控制器
 */
@RestController

public class CounterController {

	final Logger logger;

	public CounterController() {
		this.logger = LoggerFactory.getLogger(CounterController.class);
	}


	/**
	 * 获取当前计数
	 *
	 * @return API response json
	 */
	@GetMapping(value = "/api/count")
	ApiResponse get() {
		logger.info("/api/count get request");
		return ApiResponse.ok();
	}


	/**
	 * 更新计数，自增或者清零
	 *
	 * @param request {@link CounterRequest}
	 * @return API response json
	 */
	@PostMapping(value = "/api/count")
	ApiResponse create(@RequestBody CounterRequest request) {
		logger.info("/api/count post request, action: {}", request.getAction());
		return ApiResponse.ok();
	}

}
