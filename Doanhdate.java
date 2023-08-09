import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Doanhdate {
    public static void main(String[] args) {
        LocalDateTime thomxinh = LocalDateTime.now();
        System.out.println(thomxinh);

        DateTimeFormatter doanhxinh = DateTimeFormatter.ofPattern("E dd MM yyyy HH:mm:ss");

        String hiha = doanhxinh.format(thomxinh);
        System.out.println(hiha);

        ArrayList<String> doanhlist = new ArrayList<String>();
        doanhlist.add("thom");
        doanhlist.add("duyanh");
        doanhlist.add("conlonpeo");
        doanhlist.remove(2);

        System.out.println(doanhlist);
        for (String a : doanhlist) {
            System.out.println(a);
        }

        HashMap<Integer, String> doanhdeptrai = new HashMap<Integer, String>();
        doanhdeptrai.put(14, "la ngay sinh cua Thom");
        doanhdeptrai.put(21, "la ngay sinh cua Doanh dep trai ne");

        System.out.println(doanhdeptrai.get(14));
    }
}
