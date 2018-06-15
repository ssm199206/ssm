package com.jiyun.sys.controller.user;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;

/**
 * websocket拦截器：一般情况下不做处理
 */
public class WebSocketHandshakeInterceptor implements HandshakeInterceptor{

    public void afterHandshake(ServerHttpRequest arg0, ServerHttpResponse arg1, WebSocketHandler arg2, Exception arg3) {

    }

    public boolean beforeHandshake(ServerHttpRequest arg0, ServerHttpResponse arg1, WebSocketHandler arg2,
                                   Map<String, Object> arg3) throws Exception {
        return true;
    }

}