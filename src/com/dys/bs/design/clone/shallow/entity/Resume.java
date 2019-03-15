package com.dys.bs.design.clone.shallow.entity;

/**
 * 简历
 */
public class Resume implements Cloneable{
    private String name;
    private String age;
    private String timeLimit;// 工作时限
    private String company;// 公司


    public Resume(String name, String age){
        this.name = name;
        this.age = age;
    }
    public void setTimeLimitCompany(String timeLimit,String company){
        this.timeLimit = timeLimit;
        this.company = company;
    }
    public Resume cloneResume() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", timeLimit='" + timeLimit + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
