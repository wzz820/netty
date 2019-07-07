package com.wzz.netty;

import com.wzz.netty.server.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyApplication {
	public static void main(String[] args) {
		SpringApplication.run(NettyApplication.class, args);
		try {
			new NettyServer(12345).start();
		}catch(Exception e) {
			System.out.println("NettyServerError:"+e.getMessage());
		}
	}

}
