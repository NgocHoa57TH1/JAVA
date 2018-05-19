/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th2;

/**
 *
 * @author ngochoak57
 */
public class StudentInfo {
    String FullName;
    String NamSinh;
    String GioiTinh;
    int STT;
    
    
public void setSTT( int stt)
{
    this.STT = stt;
}
public int getSTT()
{
    return STT;
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
public void setGioiTinh( String Sex ){
    this.GioiTinh = Sex;
}
public String getGioiTinh(){
    return GioiTinh;
}
        
}


