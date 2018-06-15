package com.jiyun.sys.test;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by lishan on 2018/6/14.
 */
public class MyWebsocketHandler extends SimpleChannelInboundHandler<Object> {


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();

        //关掉
        ctx.close();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//保存客户端与连接的开启次数
        NettyConfig.CHANNEL_GROUP.add(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        NettyConfig.CHANNEL_GROUP.remove(ctx.channel());
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

        ctx.flush();
    }

    //处理请求响应请求的狠心方法
    @Override
    protected void messageReceived(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

    }
}
