package com.practice.zhuzru;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 23:06
 * @Created by zhuzru
 */
public class Agent {
    private Star star;
    private Fans fans;
    private MediaCompany company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(MediaCompany company) {
        this.company = company;
    }

    public void meeting() {
        System.out.println("launch a meeting between " + star.getName() + " with " + fans.getName());
    }

    public void business() {
        System.out.println("launch a business negotiation between " + star.getName() + " with " + company.getName());
    }
}
