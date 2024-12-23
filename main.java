
// import java.util.Date;// khó gán hằng giá trị, phải có try catch exception, throw exception lằng nhằng phức tạp
// import java.time.LocalDate;
import java.sql.Date;
import java.text.SimpleDateFormat; // dễ dùng hơn java.util.Date và ngắn hơn LocalDate
import static java.lang.System.out;     // cho lệnh out.print(), out.println()
import static java.lang.System.console; // cho lệnh console().readLine()

mainut.print("\n NHẬP XUẤT DỮ LIỆU TRONG JAVA");

    String Tên; // đầy đủ
    Integer Năm; // sinh
    Float Điểm; // ielts
    Character Nhóm; // máu
    Boolean Đtn; // đã tốt nghiệp hay chưa
    Date Ngày; // vào trường

    out.print("\n Đã xong việc khai báo biến !");

    Tên = "Lê Minh Họa";
    Năm = 2004;
    Điểm = 8.5f;
    Nhóm = 'A'; // A, B, O
    Đtn = true;
    Ngày = Date.valueOf("2023-09-15");
    // https://stackoverflow.com/questions/24320378/how-do-i-format-a-java-sql-date-into-this-format-mm-dd-yyyy
    // https://stackoverflow.com/questions/12844006/how-to-parse-string-to-java-sql-date

    out.print("\n Đã xong việc gán hằng giá trị cho biến !");

    out.print("\n+-------------------------------------------------------------------------------------+");
    out.print("\n| HỌ VÀ TÊN SINH VIÊN | NĂM SINH | ĐIỂM | NHÓM MÁU | ĐÃ TỐT NGHIỆP | NGÀY NHẬP TRƯỜNG |");
    out.print("\n+-------------------------------------------------------------------------------------+");
    out.printf("\n| %19s | %8d | %4.2f | %8c | %13s | %16s |",
            Tên, Năm, Điểm, Nhóm, Đtn ? "Rồi " : "Chưa", new SimpleDateFormat("dd/MM/yyyy").format(Ngày));
    out.print("\n+-------------------------------------------------------------------------------------+");

    out.print("\n Đã xong việc xuất dữ liệu tĩnh của biến ra bảng terminal !");

    /////////////////////////////////
    out.print("\n Nhập tên: ");
    Tên = console().readLine();

    out.print("\n Nhập năm sinh: ");
    Năm = Integer.parseInt(console().readLine());

    out.print("\n Nhập điểm ielts (từ 0-10): ");
    Điểm = Float.parseFloat(console().readLine());

    out.print("\n Nhập nhóm máu (A, B, O): ");
    Nhóm = console().readLine().charAt(0);

    out.print("\n Đã tốt nghiệp hay chưa (true/false): ");
    Đtn = Boolean.valueOf(console().readLine());

    out.print("\n Nhập ngày (yyyy-MM-dd): ");
    Ngày = Date.valueOf(console().readLine());

    out.print("\n+-------------------------------------------------------------------------------------+");
    out.print("\n| HỌ VÀ TÊN SINH VIÊN | NĂM SINH | ĐIỂM | NHÓM MÁU | ĐÃ TỐT NGHIỆP | NGÀY NHẬP TRƯỜNG |");
    out.print("\n+-------------------------------------------------------------------------------------+");
    out.printf("\n| %19s | %8d | %4.2f | %8c | %13s | %16s |",
            Tên, Năm, Điểm, Nhóm, Đtn ? "Rồi " : "Chưa", new SimpleDateFormat("dd/MM/yyyy").format(Ngày));
    out.print("\n+-------------------------------------------------------------------------------------+");

    out.print("\n Đã xong việc xuất dữ liệu động của biến ra bảng terminal !");
}

// java --enable-preview Main.java

/*
 * output terminal:
PS C:\Users\Public\JavaStandard\Java23Hello> java --enable-preview .\BienNhapXuat.java

 NHẬP XUẤT DỮ LIỆU TRONG JAVA
 Đã xong việc khai báo biến !
 Đã xong việc gán hằng giá trị cho biến !
+-------------------------------------------------------------------------------------+
| HỌ VÀ TÊN SINH VIÊN | NĂM SINH | ĐIỂM | NHÓM MÁU | ĐÃ TỐT NGHIỆP | NGÀY NHẬP TRƯỜNG |
+-------------------------------------------------------------------------------------+
|         Lê Minh Họa |     2004 | 8.50 |        A |          Rồi  |       15/09/2023 |
+-------------------------------------------------------------------------------------+
 Đã xong việc xuất dữ liệu tĩnh của biến ra bảng terminal !
 Nhập tên: Bill Gates

 Nhập năm sinh: 1955

 Nhập điểm ielts (từ 0-10): 9.5

 Nhập nhóm máu (A, B, O): A

 Đã tốt nghiệp hay chưa (true/false): false

 Nhập ngày (yyyy-MM-dd): 1975-12-25

+-------------------------------------------------------------------------------------+
| HỌ VÀ TÊN SINH VIÊN | NĂM SINH | ĐIỂM | NHÓM MÁU | ĐÃ TỐT NGHIỆP | NGÀY NHẬP TRƯỜNG |
+-------------------------------------------------------------------------------------+
|          Bill Gates |     1955 | 9.50 |        A |          Chưa |       25/12/1975 |
+-------------------------------------------------------------------------------------+
 Đã xong việc xuất dữ liệu động của biến ra bảng terminal !
 */