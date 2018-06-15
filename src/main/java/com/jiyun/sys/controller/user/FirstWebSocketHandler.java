package com.jiyun.sys.controller.user;

import com.alibaba.fastjson.JSON;
import com.jiyun.sys.pojo.user.User;
import org.springframework.web.socket.*;

/*
 * websocket处理器：功能实现的核心代码编写类
 */
public class FirstWebSocketHandler implements WebSocketHandler{

    //定义一个全局的初始化值count=0
    private static int count = 0;

    //连接关闭后的操作
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {

    }

    //建立连接后的操作
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        while(count <= 100){
            //向前端推送数据，一秒一次推送，格式：1,2,3,4,5.....
            User user = new User();
            user.setLoginName("xiaoming");
            user.setUserId(123);
            String jsonS = JSON.toJSONString(user);

            session.sendMessage(new TextMessage("[820, 932, 901, 934, 1290, 1330, 1320]"));
            count++;
            Thread.sleep(1000);
        }


    }

    //消息处理，在客户端通过Websocket API发送的消息会经过这里，然后进行相应的处理
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {

    }

    //消息传输错误处理
    public void handleTransportError(WebSocketSession session, Throwable throwable) throws Exception {
        if(session.isOpen()){
            session.close();
        }
    }

    public boolean supportsPartialMessages() {
        return false;
    }

}