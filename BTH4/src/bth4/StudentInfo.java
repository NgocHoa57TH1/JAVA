/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bth4;

/**
 *
 * @author Admin
 */
public class StudentInfo {
    String MSSV;
    String FullName;
    String NamSinh;
    String Lop;
    

public void setMSSV ( String MSSV){
    this.MSSV = MSSV;
}
public String getMSSV(){
    return MSSV;
}
public void setFullName( String Name){
    this.FullName = Name;
}
public String getFullName (){
    return FullName;
}
public void setNamSinh(String Year){
    this.NamSinh = Year;
}
public String getNamSinh (){
    return NamSinh;
}
public void setLop( String Lop ){
    this.Lop = Lop;
}
public String getLop(){
    return Lop;
} 
}

