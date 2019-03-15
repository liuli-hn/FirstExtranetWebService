package com.dys.bs.design.clone.deep.entity;

/**
 * 简历
 */
public class Resume implements Cloneable{
    private String name;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name,String age){
        this.name = name;
        this.age = age;
        this.workExperience = new WorkExperience();
    }
    public void setTimeLimitCompany(String timeLimit,String company){
        this.workExperience.setTimeLimit(timeLimit);
        this.workExperience.setCompany(company);
    }

    public Resume cloneResume(){
        workExperience = workExperience.cloneWorkExperience();
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }
}
