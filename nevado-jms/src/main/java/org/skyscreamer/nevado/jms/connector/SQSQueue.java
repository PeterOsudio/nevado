package org.skyscreamer.nevado.jms.connector;

import java.util.Map;

import javax.jms.JMSException;

import com.amazonaws.services.sqs.model.MessageAttributeValue;

/**
 * Representation of an SQS Queue
 *
 * @author Carter Page <carter@skyscreamer.org>
 */
public interface SQSQueue {
    String sendMessage(String serializedMessage) throws JMSException;
    
    String sendMessage(String serializedMessage, Map<String, MessageAttributeValue> messageAttributes) throws JMSException;

    void setMessageVisibilityTimeout(String sqsReceiptHandle, int timeout) throws JMSException;

    String getQueueARN() throws JMSException;

    void setPolicy(String policy) throws JMSException;

    void deleteMessage(String sqsReceiptHandle) throws JMSException;

    SQSMessage receiveMessage() throws JMSException;

    void deleteQueue() throws JMSException;

	
}
