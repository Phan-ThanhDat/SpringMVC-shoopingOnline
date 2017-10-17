package com.checongbinh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="nhanvien")
public class NhanVien {
	
	@Id
	int idNhanVien;
	
	String tenNhanVien;
	
	int tuoi;
	

	public String getTennhanvien() {
		return tenNhanVien;
	}

	public void setTennhanvien(String tennhanvien) {
		this.tenNhanVien = tennhanvien;
	}

	

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public NhanVien(){
		
	}
	
	
	public NhanVien(String tennhanvien,int tuoi){
		this.tenNhanVien = tennhanvien;
		this.tuoi = tuoi;
	}
	
	public NhanVien(String tennhanvien,int tuoi,String diachi){
		this.tenNhanVien = tennhanvien;
		this.tuoi = tuoi;
		
	}
	

	
	public void getThongBao(){
		System.out.println("Hello ban " + tenNhanVien + " " + tuoi);
	}

	public int getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

}
