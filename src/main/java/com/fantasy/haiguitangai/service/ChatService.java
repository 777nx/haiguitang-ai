package com.fantasy.haiguitangai.service;

import com.fantasy.haiguitangai.model.ChatRoom;

import java.util.List;

/**
 * 聊天服务
 */
public interface ChatService {

    /**
     * 和 AI 对话
     *
     * @param roomId  聊天室 ID
     * @param message 用户自己输入的消息
     * @return AI 的结果
     */
    String doChat(Long roomId, String message);

    /**
     * 获取对话列表
     *
     * @return 聊天室列表
     */
    List<ChatRoom> getChatRoomList();
}
