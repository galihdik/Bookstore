package com.lawencon.bookstore3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Galih Dika
 *
 */

public class Aplikasi {
	ArrayList<String> arrBuku = new ArrayList<String>();
	ArrayList<Integer> arrQty = new ArrayList<Integer>();
	ArrayList<Integer> arrTotal = new ArrayList<Integer>();
	static Aplikasi app = new Aplikasi();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0, buku = 0, qty = 0;
		do {
			System.out.println("======== BOOK STORE ======");
			System.out.println("1. List Buku");
			System.out.println("2. Keranjang");
			System.out.println("3. Keluar");
			try {
				System.out.println("Pilih Menu : ");
				menu = input.nextInt();
			} catch (Exception e) {
				System.out.println("Eror inputan. anda diharuskan menginput Integer");
				input.nextLine();
			}

			if (menu == 1) {
				System.out.println("List buku : ");
				System.out.print("1 " + Buku.Daftar1.nama + " ");
				System.out.println(Buku.Daftar1.harga);
				System.out.print("2 " + Buku.Daftar2.nama + " ");
				System.out.println(Buku.Daftar2.harga);
				System.out.print("3 " + Buku.Daftar3.nama + " ");
				System.out.println(Buku.Daftar3.harga);
				System.out.print("4 " + Buku.Daftar4.nama + " ");
				System.out.println(Buku.Daftar4.harga);
				try {
					System.out.println("Pilih Buku : ");
					buku = input.nextInt();
					System.out.println("Banyaknya buku yang dibeli : ");
					qty = input.nextInt();
				} catch (Exception e) {
					System.out.println("Eror inputan. anda diharuskan menginput Integer");
					input.nextLine();
				}
				app.CheckOut(buku, qty);

			} else if (menu == 2) {
				app.keranjang();
			} else if (menu == 3) {
				System.out.println("Terima kasih telah memakai program ini");
			}
		} while (menu != 3);

	}

	public void CheckOut(int buku, int banyak) {
		if (buku == 1) {
			System.out.println("Buku yang anda beli adalah " + Buku.Daftar1.nama);
			System.out.println("Total harganya yaitu : " + (Buku.Daftar1.harga * banyak));
			if (arrBuku.isEmpty()) {
				arrBuku.add(Buku.Daftar1.nama);
				arrQty.add(banyak);
				arrTotal.add((Buku.Daftar1.harga * banyak));
			} else if (!arrBuku.isEmpty()) {
				Boolean ketemuBuku = false;
				int penampungIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(Buku.Daftar1.nama)) {
						ketemuBuku = true;
						penampungIndex = i;
						break;
					}
				}
				if (ketemuBuku == true) {
					int tampungQty = arrQty.get(penampungIndex);
					tampungQty = tampungQty + banyak;
					int tampungHarga = arrTotal.get(penampungIndex);
					int tampungHarga2 = Buku.Daftar1.harga * banyak;
					tampungHarga = tampungHarga + tampungHarga2;
					arrQty.set(penampungIndex, tampungQty);
					arrTotal.set(penampungIndex, tampungHarga);
					ketemuBuku = false;
				} else if (ketemuBuku == false) {
					arrBuku.add(Buku.Daftar1.nama);
					arrQty.add(banyak);
					arrTotal.add((Buku.Daftar1.harga * banyak));
				}
			}
		} else if (buku == 2) {
			System.out.println("Buku yang anda beli adalah " + Buku.Daftar2.nama);
			System.out.println("Total harganya yaitu : " + (Buku.Daftar2.harga * banyak));
			if (arrBuku.isEmpty()) {
				arrBuku.add(Buku.Daftar2.nama);
				arrQty.add(banyak);
				arrTotal.add((Buku.Daftar2.harga * banyak));
			} else if (!arrBuku.isEmpty()) {
				Boolean ketemuBuku = false;
				int penampungIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(Buku.Daftar2.nama)) {
						ketemuBuku = true;
						penampungIndex = i;
						break;
					}
				}
				if (ketemuBuku == true) {
					int tampungQty = arrQty.get(penampungIndex);
					tampungQty = tampungQty + banyak;
					int tampungHarga = arrTotal.get(penampungIndex);
					int tampungHarga2 = Buku.Daftar2.harga * banyak;
					tampungHarga = tampungHarga + tampungHarga2;
					arrQty.set(penampungIndex, tampungQty);
					arrTotal.set(penampungIndex, tampungHarga);
					ketemuBuku = false;
				} else if (ketemuBuku == false) {
					arrBuku.add(Buku.Daftar2.nama);
					arrQty.add(banyak);
					arrTotal.add((Buku.Daftar2.harga * banyak));
				}
			}
		} else if (buku == 3) {
			System.out.println("Buku yang anda beli adalah " + Buku.Daftar3.nama);
			System.out.println("Total harganya yaitu : " + (Buku.Daftar3.harga * banyak));
			if (arrBuku.isEmpty()) {
				arrBuku.add(Buku.Daftar3.nama);
				arrQty.add(banyak);
				arrTotal.add((Buku.Daftar3.harga * banyak));
			} else if (!arrBuku.isEmpty()) {
				Boolean ketemuBuku = false;
				int penampungIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(Buku.Daftar3.nama)) {
						ketemuBuku = true;
						penampungIndex = i;
						break;
					}
				}
				if (ketemuBuku == true) {
					int tampungQty = arrQty.get(penampungIndex);
					tampungQty = tampungQty + banyak;
					int tampungHarga = arrTotal.get(penampungIndex);
					int tampungHarga2 = Buku.Daftar3.harga * banyak;
					tampungHarga = tampungHarga + tampungHarga2;
					arrQty.set(penampungIndex, tampungQty);
					arrTotal.set(penampungIndex, tampungHarga);
					ketemuBuku = false;
				} else if (ketemuBuku == false) {
					arrBuku.add(Buku.Daftar3.nama);
					arrQty.add(banyak);
					arrTotal.add((Buku.Daftar3.harga * banyak));
				}
			}
		} else if (buku == 4) {
			System.out.println("Buku yang anda beli adalah " + Buku.Daftar4.nama);
			System.out.println("Total harganya yaitu : " + (Buku.Daftar4.harga * banyak));
			if (arrBuku.isEmpty()) {
				arrBuku.add(Buku.Daftar4.nama);
				arrQty.add(banyak);
				arrTotal.add((Buku.Daftar4.harga * banyak));
			} else if (!arrBuku.isEmpty()) {
				Boolean ketemuBuku = false;
				int penampungIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(Buku.Daftar4.nama)) {
						ketemuBuku = true;
						penampungIndex = i;
						break;
					}
				}
				if (ketemuBuku == true) {
					int tampungQty = arrQty.get(penampungIndex);
					tampungQty = tampungQty + banyak;
					int tampungHarga = arrTotal.get(penampungIndex);
					int tampungHarga2 = Buku.Daftar4.harga * banyak;
					tampungHarga = tampungHarga + tampungHarga2;
					arrQty.set(penampungIndex, tampungQty);
					arrTotal.set(penampungIndex, tampungHarga);
					ketemuBuku = false;
				} else if (ketemuBuku == false) {
					arrBuku.add(Buku.Daftar4.nama);
					arrQty.add(banyak);
					arrTotal.add((Buku.Daftar4.harga * banyak));
				}
			}
		}
	}

	public void keranjang() {
		int tampung = 0;
		if (arrBuku.isEmpty()) {
			System.out.println("Keranjang kosong !");
		} else {
			System.out.println("Keranjang anda  :");
			for (int i = 0; i < arrBuku.size(); i++) {
				tampung = tampung + arrTotal.get(i);
			}
			for (int i = 0; i < arrBuku.size(); i++) {
				System.out.println("Buku yang anda beli adalah " + arrBuku.get(i) + " dengan banyak " + arrQty.get(i)
						+ " dan total harganya : " + arrTotal.get(i));
			}
			System.out.println("Total harga semua buku adalah : " + tampung);
			System.out.println("========= Menu tambahan keranjang============");
			System.out.println("1. Hapus buku satuan ");
			System.out.println("2. Hapus semua buku ");
			System.out.println("3. Ubah kuantiti ");
			System.out.println("4. Ubah Buku yang sudah dibeli");
			int menuK = input.nextInt();
			menuKeranjang(menuK);
		}
	}

	public void menuKeranjang(int menuK) {
		if (menuK == 1) {
			String namaBuku = "";
			if (arrBuku.isEmpty()) {
				System.out.println("Belum ada buku yang didaftarkan !");
			} else if (!arrBuku.isEmpty()) {
				System.out.println("Buku mana yang ingin dihapus : ");
				namaBuku = input.next();
				Boolean ketemuBuku = false;
				int getIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(namaBuku)) {
						ketemuBuku = true;
						getIndex = i;
						break;
					}
				}
				if (ketemuBuku == true) {
					arrBuku.remove(getIndex);
					arrTotal.remove(getIndex);
					arrQty.remove(getIndex);
					System.out.println("Buku" + namaBuku + " berhasil dihapus");
					ketemuBuku = false;
				} else if (ketemuBuku == false)
					System.out.println("Buku" + namaBuku + " Tidak ada");
			}
		} else if (menuK == 2) {
			if (arrBuku.isEmpty())
				System.out.println("Keranjang Kosong");
			else {
				System.out.println("Semua buku telah dihapus ! ");
				arrBuku.clear();
				arrQty.clear();
				arrTotal.clear();
			}
		} else if (menuK == 3) {
			String namaBuku = "";
			if (arrBuku.isEmpty()) {
				System.out.println("Belum ada buku yang didaftarkan !");
			} else if (!arrBuku.isEmpty()) {
				System.out.println("Buku mana yang ingin di ubah kuantitasnya : ");
				namaBuku = input.next();
				int tampungHargaBuku = 0;
				Boolean ketemuBuku = false;
				int getIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(namaBuku)) {
						ketemuBuku = true;
						getIndex = i;
						break;
					}
				}

				if (ketemuBuku == true) {
					System.out.println("ingin ditambah berapa banyak :  ");
					int tambahBuku = input.nextInt();
					if (namaBuku.equalsIgnoreCase("Java")) {
						tampungHargaBuku = tambahBuku * Buku.Daftar1.harga;
					} else if (namaBuku.equalsIgnoreCase("Kotlin")) {
						tampungHargaBuku = tambahBuku * Buku.Daftar2.harga;
					} else if (namaBuku.equalsIgnoreCase("Spring")) {
						tampungHargaBuku = tambahBuku * Buku.Daftar3.harga;
					} else if (namaBuku.equalsIgnoreCase("Angular")) {
						tampungHargaBuku = tambahBuku * Buku.Daftar4.harga;
					}
					tambahBuku = tambahBuku + arrQty.get(getIndex);
					tampungHargaBuku = tampungHargaBuku + arrTotal.get(getIndex);
					arrQty.set(getIndex, tambahBuku);
					arrTotal.set(getIndex, tampungHargaBuku);
					System.out.println("Buku " + namaBuku + " Berhasil ditambah kuantitasnya sebesar " + tambahBuku
							+ " dan harganya sebesar : " + arrTotal.get(getIndex));
					ketemuBuku = false;
				} else if (ketemuBuku == false)
					System.out.println("Buku " + namaBuku + " Tidak ada");
			}
		} else if (menuK == 4) {
			String namaBuku = "";
			if (arrBuku.isEmpty()) {
				System.out.println("Belum ada buku yang didaftarkan !");
			} else if (!arrBuku.isEmpty()) {
				System.out.println("Buku yang ingin dirubah : ");
				namaBuku = input.next();
				Boolean ketemuBuku = false;
				int getIndex = 0;
				for (int i = 0; i < arrBuku.size(); i++) {
					if (arrBuku.get(i).equals(namaBuku)) {
						ketemuBuku = true;
						getIndex = i;
						break;
					}
				}
				if (ketemuBuku == true) {
					int buku = 0, qty = 0;
					if (Buku.Daftar1.nama.equalsIgnoreCase(namaBuku)) {
						System.out.println("List buku : ");
						System.out.print("1 " + Buku.Daftar2.nama + " ");
						System.out.println(Buku.Daftar2.harga);
						System.out.print("2 " + Buku.Daftar3.nama + " ");
						System.out.println(Buku.Daftar3.harga);
						System.out.print("3 " + Buku.Daftar4.nama + " ");
						System.out.println(Buku.Daftar4.harga);
						System.out.println("Pilih Buku : ");
						buku = input.nextInt();
						System.out.println("Banyaknya buku yang dibeli : ");
						qty = input.nextInt();
						Boolean cek = false, cek2 = false;
						String tampungNama = "";
						int tampungHarga = 0;
						for (int i = 0; i < arrBuku.size(); i++) {
							if (arrBuku.get(i).equalsIgnoreCase(namaBuku)) {
								cek = true;
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar2.nama)) {
									cek2 = true;
									tampungNama = Buku.Daftar2.nama;
									tampungHarga = Buku.Daftar2.harga;
								} else if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar3.nama)) {
									cek2 = true;
									tampungNama = Buku.Daftar3.nama;
									tampungHarga = Buku.Daftar3.harga;
								} else if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar4.nama)) {
									cek2 = true;
									tampungNama = Buku.Daftar4.nama;
									tampungHarga = Buku.Daftar4.harga;
								}
							}
							if (buku == 1) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar2.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 11000);
							} else if (buku == 2) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar3.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 12000);
							} else if (buku == 3) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar4.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 13000);
							}
						}
						if (cek == true) {
							for (int i = 0; i < arrBuku.size(); i++) {
								if (cek2 == true) {
									if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar1.nama)) {
										arrBuku.set(i, tampungNama);
										arrQty.set(i, qty);
										arrTotal.set(i, qty * tampungHarga);
									}
								} else {
									if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar1.nama)) {
										arrBuku.remove(i);
										arrQty.remove(i);
										arrTotal.remove(i);
									}
								}
							}
						}
					} else if (Buku.Daftar2.nama.equalsIgnoreCase(namaBuku)) {
						System.out.println("List buku : ");
						System.out.print("1 " + Buku.Daftar1.nama + " ");
						System.out.println(Buku.Daftar1.harga);
						System.out.print("2 " + Buku.Daftar3.nama + " ");
						System.out.println(Buku.Daftar3.harga);
						System.out.print("3 " + Buku.Daftar4.nama + " ");
						System.out.println(Buku.Daftar4.harga);
						System.out.println("Pilih Buku : ");
						buku = input.nextInt();
						System.out.println("Banyaknya buku yang dibeli : ");
						qty = input.nextInt();
						Boolean cek = false;
						int getIndexx = 0;
						for (int i = 0; i < arrBuku.size(); i++) {
							if (arrBuku.get(i).equalsIgnoreCase(namaBuku)) {
								cek = true;
								getIndexx = i;
							}
							if (buku == 1) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar1.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 10000);
							} else if (buku == 2) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar3.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 12000);
							} else if (buku == 3) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar4.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 13000);
							}
						}
						if (cek == true) {
							arrBuku.remove(getIndexx);
							arrQty.remove(getIndexx);
							arrTotal.remove(getIndexx);
						}
					} else if (Buku.Daftar3.nama.equalsIgnoreCase(namaBuku)) {
						System.out.println("List buku : ");
						System.out.print("1 " + Buku.Daftar1.nama + " ");
						System.out.println(Buku.Daftar1.harga);
						System.out.print("2 " + Buku.Daftar2.nama + " ");
						System.out.println(Buku.Daftar2.harga);
						System.out.print("3 " + Buku.Daftar4.nama + " ");
						System.out.println(Buku.Daftar4.harga);
						System.out.println("Pilih Buku : ");
						buku = input.nextInt();
						System.out.println("Banyaknya buku yang dibeli : ");
						qty = input.nextInt();
						Boolean cek = false;
						int getIndexx = 0;
						for (int i = 0; i < arrBuku.size(); i++) {
							if (arrBuku.get(i).equalsIgnoreCase(namaBuku)) {
								cek = true;
								getIndexx = i;
							}
							if (buku == 1) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar1.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 10000);
							} else if (buku == 2) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar2.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 11000);
							} else if (buku == 3) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar4.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 13000);
							}
						}
						if (cek == true) {
							arrBuku.remove(getIndexx);
							arrQty.remove(getIndexx);
							arrTotal.remove(getIndexx);
						}
					} else if (Buku.Daftar4.nama.equalsIgnoreCase(namaBuku)) {
						System.out.println("List buku : ");
						System.out.print("1 " + Buku.Daftar1.nama + " ");
						System.out.println(Buku.Daftar1.harga);
						System.out.print("2 " + Buku.Daftar2.nama + " ");
						System.out.println(Buku.Daftar2.harga);
						System.out.print("3 " + Buku.Daftar3.nama + " ");
						System.out.println(Buku.Daftar3.harga);
						System.out.println("Pilih Buku : ");
						buku = input.nextInt();
						System.out.println("Banyaknya buku yang dibeli : ");
						qty = input.nextInt();
						Boolean cek = false;
						int getIndexx = 0;
						for (int i = 0; i < arrBuku.size(); i++) {
							if (arrBuku.get(i).equalsIgnoreCase(namaBuku)) {
								cek = true;
								getIndexx = i;
							}
							if (buku == 1) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar1.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 10000);
							} else if (buku == 2) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar2.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 11000);
							} else if (buku == 3) {
								if (arrBuku.get(i).equalsIgnoreCase(Buku.Daftar3.nama)) {
									arrQty.set(i, qty + arrQty.get(i));
								}
								arrTotal.set(i, arrQty.get(i) * 12000);
							}
						}
						if (cek == true) {
							arrBuku.remove(getIndexx);
							arrQty.remove(getIndexx);
							arrTotal.remove(getIndexx);
						}
					}
					ketemuBuku = false;
				} else if (ketemuBuku == false)
					System.out.println("Buku " + namaBuku + " Tidak ada");
			}
		}

	}
}