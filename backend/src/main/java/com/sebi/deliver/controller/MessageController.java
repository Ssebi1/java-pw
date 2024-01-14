package com.sebi.deliver.controller;

import com.sebi.deliver.model.Message;
import com.sebi.deliver.model.Order;
import com.sebi.deliver.service.MessageService;
import com.sebi.deliver.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/messages")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("{id}")
    public List<Message> getUserMessages(@PathVariable Long id) {
        return messageService.getUserMessages(id);
    }

    @PostMapping("{id}")
    public Message addMessage(@PathVariable Long id, @RequestBody Message message) {
        return messageService.addMessage(id, message);
    }
}
