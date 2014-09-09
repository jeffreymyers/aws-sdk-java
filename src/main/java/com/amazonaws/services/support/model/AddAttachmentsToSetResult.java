/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * Add Attachments To Set Result
 */
public class AddAttachmentsToSetResult implements Serializable {

    private String attachmentSetId;

    private String expiryTime;

    /**
     * Returns the value of the AttachmentSetId property for this object.
     *
     * @return The value of the AttachmentSetId property for this object.
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }
    
    /**
     * Sets the value of the AttachmentSetId property for this object.
     *
     * @param attachmentSetId The new value for the AttachmentSetId property for this object.
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }
    
    /**
     * Sets the value of the AttachmentSetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentSetId The new value for the AttachmentSetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddAttachmentsToSetResult withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
        return this;
    }

    /**
     * Returns the value of the ExpiryTime property for this object.
     *
     * @return The value of the ExpiryTime property for this object.
     */
    public String getExpiryTime() {
        return expiryTime;
    }
    
    /**
     * Sets the value of the ExpiryTime property for this object.
     *
     * @param expiryTime The new value for the ExpiryTime property for this object.
     */
    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }
    
    /**
     * Sets the value of the ExpiryTime property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expiryTime The new value for the ExpiryTime property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddAttachmentsToSetResult withExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttachmentSetId() != null) sb.append("AttachmentSetId: " + getAttachmentSetId() + ",");
        if (getExpiryTime() != null) sb.append("ExpiryTime: " + getExpiryTime() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode()); 
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddAttachmentsToSetResult == false) return false;
        AddAttachmentsToSetResult other = (AddAttachmentsToSetResult)obj;
        
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null) return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false) return false; 
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null) return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false) return false; 
        return true;
    }
    
}
    