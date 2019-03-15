package com.dys.bs.design.clone.deep.entity;

/**
 * 工作经历
 */
public class WorkExperience implements Cloneable{
    private String timeLimit;// 工作时限
    private String company;// 公司

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience cloneWorkExperience(){
        try {
            return (WorkExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "timeLimit='" + timeLimit + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
