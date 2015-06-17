/**
 * $Id: EndTransactionRequestHeader.java 1835 2013-05-16 02:00:50Z shijia.wxr $
 */
package com.alibaba.rocketmq.common.protocol.header;

import com.alibaba.rocketmq.remoting.CommandCustomHeader;
import com.alibaba.rocketmq.remoting.annotation.CFNotNull;
import com.alibaba.rocketmq.remoting.exception.RemotingCommandException;


/**
 * @author shijia.wxr<vintage.wang@gmail.com>
 */
public class CheckTransactionStateRequestHeader implements CommandCustomHeader {

    @Deprecated
    private Long tranStateTableOffset;

    @CFNotNull
    private Long commitLogOffset;

    @Deprecated
    private String msgId;

    @Deprecated
    private String transactionId;


    @Override
    public void checkFields() throws RemotingCommandException {
    }


    @Deprecated
    public Long getTranStateTableOffset() {
        return tranStateTableOffset;
    }


    @Deprecated
    public void setTranStateTableOffset(Long tranStateTableOffset) {
        this.tranStateTableOffset = tranStateTableOffset;
    }


    public Long getCommitLogOffset() {
        return commitLogOffset;
    }


    public void setCommitLogOffset(Long commitLogOffset) {
        this.commitLogOffset = commitLogOffset;
    }

    @Deprecated
    public String getMsgId() {
        return msgId;
    }

    @Deprecated
    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    @Deprecated
    public String getTransactionId() {
        return transactionId;
    }

    @Deprecated
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
