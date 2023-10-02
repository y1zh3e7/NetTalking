package org.zjm;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatRoomController {

    @FXML
    private TextArea chatArea;

    @FXML
    private TextField messageInput;

    @FXML
    private Button sendButton;

    @FXML
    private void initialize() {
        // 初始化逻辑，如果需要的话
    }

    @FXML
    private void sendMessage() {
        String message = messageInput.getText().trim();
        if (!message.isEmpty()) {
            // 在这里添加发送消息的逻辑，可以使用Socket通信或其他网络通信方式
            // 这里只是简单地将消息显示在聊天区域中
            chatArea.appendText("You: " + message + "\n");
            messageInput.clear();
        }
    }
}

