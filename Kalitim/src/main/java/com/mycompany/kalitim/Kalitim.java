

package com.mycompany.kalitim;


public class Kalitim {

    public static void main(String[] args) {
       // TODO Auto-generated method stub
		Employee e=new Employee("Nagihan","Bilişim",45646);
		e.showInfos();
		Manager m=new Manager("Ayşe","yazılım",7894,25);
		m.showInfos();
		m.maasYukselt(100);
    }
}
