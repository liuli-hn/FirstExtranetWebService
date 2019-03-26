package com.dys.bs.design.clone.deep.main;


import com.dys.bs.design.clone.deep.entity.Resume;

/**
 * 深复制
 */
public class DeepMain {

    public static void main(String[] arg) throws CloneNotSupportedException {
        Resume resume = new Resume("liuli","21");
        resume.setTimeLimitCompany("5555-555","上的发丝");
        System.out.println(resume);

        Resume A = resume.cloneResume();
        A.setTimeLimitCompany("8888--555","孙大发");
        System.out.println(A);

    }

}
