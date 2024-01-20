package com.practice.zhuzru;

/**
 * 功能描述：
 *
 * @Date 2024/1/20 23:11
 * @Created by zhuzru
 */
public class DemeterApp {
    public static void main(String[] args) {
        Star star = new Star();
        star.setName("zuXian Wang");
        Fans fans = new Fans();
        fans.setName("zhuzru");
        MediaCompany company = new MediaCompany();
        company.setName("tianyu");

        Agent agent = new Agent();
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.meeting();
        agent.business();
    }
}
