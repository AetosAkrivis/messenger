/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import mockDataBase.MockDataBase;
import model.Message;

/**
 *
 * @author imady
 */
public class MessageService {

    private Map<Long,Message> messages = MockDataBase.getMessages();

    public MessageService() {
        messages.put(1L, new Message(1L,"Hi","Imad"));
        messages.put(2L, new Message(2L,"Hello","Badr"));
    }
  
    
    /**
     * Create
     * @param message
     * @return The added message
     */
    public Message postMessage(Message message){
        message.setId(messages.size()+1);
        this.messages.put(message.getId(), message);
        return message;
    }
    
    /**
     * Research
     * @return list of all messages
     */
    public Collection<Message> getAllMessages() {
        return messages.values();
    }
    /**
     * Research
     * @param id
     * @return selected message via message id
     */
    public Message getMessage(long id){
        Message selected = new Message();
        for(Message m : messages.values()){
            if(m.getId() == id){
               selected = m;
            }
        }
        return selected;
    }
    /**
     * Update
     * @param id
     * @param content
     * @return updated message (unnecessary since the message is changed at the reference) 
     */
    public Message updateMessage(long id, String content){
        Message msgToUpdate = messages.get((int) id);
        msgToUpdate.setContent(content);
        return msgToUpdate;
    }
    
    /**
     * Delete
     * @param id
     * @return true if message is deleted, false otherwise 
     */
    public void deleteMessage(Long id){
       this.messages.remove(id, messages.get(id));
    }
}
