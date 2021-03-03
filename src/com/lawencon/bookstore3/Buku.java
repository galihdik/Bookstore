package com.lawencon.bookstore3;

/**
 *
 * @author Galih Dika
 *
 */

public enum Buku {
	Daftar1("Java", 10000), Daftar2("Kotlin", 11000), Daftar3("Spring", 12000), Daftar4("Angular", 13000);

	public String nama;
	public int harga;

	Buku(String nama, int harga) {
		this.nama = nama;
		this.harga = harga;
	}
}
