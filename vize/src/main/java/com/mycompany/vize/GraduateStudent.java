package com.mycompany.vize;

public class GraduateStudent extends Student {

    private String thesisTopic;

    public GraduateStudent(String name, int studentId, String thesisTopic) {

        super(name, studentId);
        this.thesisTopic = thesisTopic;

    }

    public String getTheisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
    
    public void displayGraduateInfo(){
    
        System.out.println("Mezun Öğrenci İsmi:"+name+"ID"+studentId+"Tez Konusu:"+thesisTopic);
    }
}
