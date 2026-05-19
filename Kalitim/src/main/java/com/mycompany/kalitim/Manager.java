
package com.mycompany.kalitim;


public class Manager extends Employee{
    
    private int sorumluKisi;
    
    public Manager(String name, String department, int salary,int sorumluKisi){
    
    super(name, department, salary);
    this.sorumluKisi=sorumluKisi;
 
    }
    public void maasYukselt(int miktar) {
		System.out.println("maaş"+miktar+"tl kadar yükseltildi");
	}
    @Override
    public void showInfos() {
		// TODO Auto-generated method stub
		super.showInfos();
		System.out.println("Sorumlu olduğu kişi sayısı"+this.sorumluKisi);
    
    
    }
}
