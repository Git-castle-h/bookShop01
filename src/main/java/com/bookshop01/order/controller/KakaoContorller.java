package com.bookshop01.order.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookshop01.order.service.ApiService02;

@RestController
public class KakaoContorller {
	@Autowired
	ApiService02 apiService02;
	
	@RequestMapping("/test/kakaoOrder.do")
	public Map<String,Object> kakaoOrder(@RequestParam Map<String, String> dateMap)throws Exception{
		System.out.println("������ ������ = "+dateMap.toString());
		
		//���� ����
		
		
		String merchantId ="himedia";
		String apiCertKey = "ac805b30517f4fd08e3e80490e559f8e";
		String orderNumber ="Test_Een1234";
		String userAgent ="WP";
		String amount = "100";
		String itemName = dateMap.get("itemName");
		String userName = dateMap.get("userName");
		String returnUrl ="��������� �������Դϴ�.";//����� ���� ������, PC�� ���X
		String timestamp ="20230501112700";
		//sha256_hash({merchantId}|{orderNumber}|{amount}|{apiCertKey}|{timestamp})
		String signature =apiService02.encrypt(merchantId+"|"+orderNumber+"|"+amount+"|"+apiCertKey+"|"+timestamp);
		
		Map<String,String> map = new HashMap<String,String>();
		Map<String,Object>resultMap =new HashMap<String,Object>();
		
		String url ="https://api.testpayup.co.kr/ep/api/kakao/"+merchantId+"/order";
		
		map.put("merchantId", merchantId);
		map.put("apiCertKey", apiCertKey);
		map.put("orderNumber", orderNumber);
		map.put("userAgent",userAgent);
		map.put("amount", amount);
		map.put("itemName", itemName);
		map.put("userName", userName);
		map.put("returnUrl", returnUrl);
		map.put("timestamp", timestamp);
		map.put("signature", signature);
		
		resultMap = apiService02.restApi(map, url);	
		
		System.out.println("������ ������ = "+ resultMap.toString());
		
		
		String viewName = "";
		
		return resultMap;
	}
	
}

