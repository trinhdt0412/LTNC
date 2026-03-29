package bai4.code;

interface IData {
    void show(); // Mặc định là public abstract
}

//class DataManager implements IData {
//    // Cố tình KHÔNG ghi public
//    void show() {
//        System.out.println("Show Data");
//    }
//}

class DataManager implements IData {
    // ghi public
    public void show() {
        System.out.println("Show Data");
    }
}

public class Main {
    public static void main(String[] args) {
        IData data = new DataManager();
        data.show();
    }
}