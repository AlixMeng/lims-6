package com.marcelmika.lims.persistence.service;

import com.marcelmika.lims.api.events.conversation.CreateConversationRequestEvent;
import com.marcelmika.lims.api.events.conversation.CreateConversationResponseEvent;
import com.marcelmika.lims.api.events.conversation.SendMessageRequestEvent;
import com.marcelmika.lims.api.events.conversation.SendMessageResponseEvent;

/**
 * @author Ing. Marcel Mika
 * @link http://marcelmika.com
 * Date: 6/29/14
 * Time: 11:47 AM
 */
public interface ConversationPersistenceService {

    /**
     * Creates new conversation
     *
     * @param event request event for method
     * @return response event for  method
     */
    public CreateConversationResponseEvent createConversation(CreateConversationRequestEvent event);

    /**
     * Sends message to conversation
     *
     * @param event request event for method
     * @return response event for method
     */
    public SendMessageResponseEvent sendMessage(SendMessageRequestEvent event);

}