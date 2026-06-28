package DesignPatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

/*
Mediator2.java

Users communicate through ChatRoom2.
*/
public class Mediator2 {
    public static void main(String[] args) {
        ChatRoom2 chatRoom = new ChatRoom2();

        ChatUser2 amit = new ChatUser2("Amit", chatRoom);
        ChatUser2 neha = new ChatUser2("Neha", chatRoom);

        chatRoom.addUser(amit);
        chatRoom.addUser(neha);

        amit.send("Hello everyone");
    }
}

class ChatRoom2 {
    private final List<ChatUser2> users = new ArrayList<ChatUser2>();

    public void addUser(ChatUser2 user) {
        users.add(user);
    }

    public void sendMessage(ChatUser2 sender, String message) {
        for (ChatUser2 user : users) {
            if (user != sender) {
                user.receive(sender.getName() + ": " + message);
            }
        }
    }
}

class ChatUser2 {
    private final String name;
    private final ChatRoom2 chatRoom;

    public ChatUser2(String name, ChatRoom2 chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        chatRoom.sendMessage(this, message);
    }

    public void receive(String message) {
        System.out.println(name + " received " + message);
    }
}
