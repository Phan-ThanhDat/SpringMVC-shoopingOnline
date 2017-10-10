package com.checongbinh.entity;


public class NhanVien {
	String tennhanvien;
	String diachi;
	int tuoi;
	GiamDoc doc;
	
	

	public GiamDoc getDoc() {
		return doc;
	}

	public void setDoc(GiamDoc doc) {
		this.doc = doc;
	}

	public String getTennhanvien() {
		return tennhanvien;
	}

	public void setTennhanvien(String tennhanvien) {
		this.tennhanvien = tennhanvien;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public NhanVien(){
		
	}
	
	public NhanVien(GiamDoc doc){
		this.doc = doc;
	}
	
	public NhanVien(String tennhanvien,int tuoi){
		this.tennhanvien = tennhanvien;
		this.tuoi = tuoi;
	}
	
	public NhanVien(String tennhanvien,int tuoi,String diachi){
		this.tennhanvien = tennhanvien;
		this.tuoi = tuoi;
		this.diachi = diachi;
	}
	

	
	public void getThongBao(){
		System.out.println("Hello ban " + tennhanvien + " " + tuoi);
	}

}
