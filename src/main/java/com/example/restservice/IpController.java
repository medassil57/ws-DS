package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpController {


	@GetMapping("/ip")
	public String  getIpAddress(@RequestParam(value = "ns", defaultValue = "www.google.com") String ns)throws UnknownHostException {
		return GetIpAddress.getIp(ns);
	}
}
