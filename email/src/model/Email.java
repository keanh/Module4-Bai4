package model;

public class Email {
    private String name;
    private String language;
    private int pageSize;
    private String spamFilter;
    private String signature;

    public Email() {
    }

    public Email(String name, String language, int pageSize, String spamFilter, String signature) {
        this.name = name;
        this.language = language;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(String spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
