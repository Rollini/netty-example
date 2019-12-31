package com.netty.demo.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class NettyClientHandler extends SimpleChannelInboundHandler<String> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("收到服务端消息: " + msg);
        StringBuilder sb = new StringBuilder();
        String msg1 = "{\"name1\":\"admin1\",\"age1\":27}\n";
        ctx.writeAndFlush(msg1);
    }

}
