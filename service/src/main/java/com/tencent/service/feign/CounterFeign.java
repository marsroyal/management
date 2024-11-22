package com.tencent.service.feign;

import com.tencent.common.dto.ApiResponse;
import com.tencent.common.dto.CounterRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(contextId = "counter", name = "court", url = "${court.address}")
public interface CounterFeign {
	@GetMapping(value = "/api/count")
	ApiResponse get();

	@PostMapping(value = "/api/count")
	ApiResponse create(CounterRequest request);
}
