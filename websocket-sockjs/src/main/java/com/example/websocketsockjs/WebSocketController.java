package com.example.websocketsockjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@Autowired
	private SimpMessagingTemplate template;

	// 广播推送消息
	@Scheduled(fixedRate = 10000)
	public void sendTopicMessage() {
		System.out.println("后台广播推送！");
		User user = new User();
		user.setId(1);
		user.setName("谭晓龙");
		user.setAge(10);
		//this.template.convertAndSend("/topic/getResponse", user);
		this.template.convertAndSendToUser(user.getId()+"","/queue/getResponse",user);

	}
}
