package com.example.restservice;

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class GetIpAddress {
 
    public static String getIp(String ns) throws UnknownHostException {
 
        // print the IP Address of your machine (inside your local network)
      //  System.out.println(InetAddress.getLocalHost().getHostAddress());
 
        // print the IP Address of a web site
      return InetAddress.getByName(ns).getHostAddress();
 
        // print all the IP Addresses that are assigned to a certain domain
     
    }
}