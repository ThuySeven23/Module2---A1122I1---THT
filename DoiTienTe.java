package ung_dung_chuyen_doi_thanh_tien_te;

import java.util.Scanner;

public class DoiTienTe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int RATE_VND = 24000;
        System.out.print("Nhập USD vào:");
        double USD = Double.parseDouble(sc.nextLine());
        System.out.println("Tiền USD đổi ra tiền Việt là : " + (int)(USD * RATE_VND) + " nghìn đồng");
    }
}
