package com.okta.demo;

/**
 *
 * @author hungusyd
 */
public class AppLink {
    
    String id;
    String label;
    String linkUrl;
    String logoUrl;
    String appName;
    String appInstanceId;
    String appAssignmentId;
    Boolean credentialsSetup;
    Boolean hidden;
    Integer sortOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppInstanceId() {
        return appInstanceId;
    }

    public void setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
    }

    public String getAppAssignmentId() {
        return appAssignmentId;
    }

    public void setAppAssignmentId(String appAssignmentId) {
        this.appAssignmentId = appAssignmentId;
    }

    public Boolean getCredentialsSetup() {
        return credentialsSetup;
    }

    public void setCredentialsSetup(Boolean credentialsSetup) {
        this.credentialsSetup = credentialsSetup;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    
    
}
