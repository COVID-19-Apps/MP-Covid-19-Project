package com.mpcovid19project.Models;

public class Jsons {

    String video, home_treatment_images, home_treatment_links, toll_numbers, lab_test,
            faq, epass, tweets, drug, corona, cbse, vocational_education;

    public Jsons() {
    }

    public Jsons(String video, String home_treatment_images, String home_treatment_links, String toll_numbers, String lab_test, String faq, String epass, String tweets, String drug, String corona, String cbse, String vocational_education) {
        this.video = video;
        this.home_treatment_images = home_treatment_images;
        this.home_treatment_links = home_treatment_links;
        this.toll_numbers = toll_numbers;
        this.lab_test = lab_test;
        this.faq = faq;
        this.epass = epass;
        this.tweets = tweets;
        this.drug = drug;
        this.corona = corona;
        this.cbse = cbse;
        this.vocational_education = vocational_education;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getHome_treatment_images() {
        return home_treatment_images;
    }

    public void setHome_treatment_images(String home_treatment_images) {
        this.home_treatment_images = home_treatment_images;
    }

    public String getHome_treatment_links() {
        return home_treatment_links;
    }

    public void setHome_treatment_links(String home_treatment_links) {
        this.home_treatment_links = home_treatment_links;
    }

    public String getToll_numbers() {
        return toll_numbers;
    }

    public void setToll_numbers(String toll_numbers) {
        this.toll_numbers = toll_numbers;
    }

    public String getLab_test() {
        return lab_test;
    }

    public void setLab_test(String lab_test) {
        this.lab_test = lab_test;
    }

    public String getFaq() {
        return faq;
    }

    public void setFaq(String faq) {
        this.faq = faq;
    }

    public String getEpass() {
        return epass;
    }

    public void setEpass(String epass) {
        this.epass = epass;
    }

    public String getTweets() {
        return tweets;
    }

    public void setTweets(String tweets) {
        this.tweets = tweets;
    }

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getCorona() {
        return corona;
    }

    public void setCorona(String corona) {
        this.corona = corona;
    }

    public String getCbse() {
        return cbse;
    }

    public void setCbse(String cbse) {
        this.cbse = cbse;
    }

    public String getVocational_education() {
        return vocational_education;
    }

    public void setVocational_education(String vocational_education) {
        this.vocational_education = vocational_education;
    }
}
