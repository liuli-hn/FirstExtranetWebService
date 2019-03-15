package com.dys.bs.design.clone.shallow.main;

import com.dys.bs.design.clone.shallow.entity.Resume;

/**
 * 浅复制
 */
public class ShallowMain{

    public static void main(String[] arg) throws CloneNotSupportedException {
        Resume resume = new Resume("刘利","21");
        resume.setTimeLimitCompany("8888-9999","阿三地方");
        System.out.println(resume.hashCode());

        Resume A = resume.cloneResume();
        System.out.println(A.hashCode());

    }

}
