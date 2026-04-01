# Bài 7: Lambda Revolution

> Lambda là một "cú pháp viết tắt cực mạnh" giúp chúng ta truyền trực tiếp các đoạn code logic (như điều kiện lọc, luật sắp xếp) vào bên trong các hàm có sẵn mà không cần phải viết class rườm rà.

> Dấu hiệu nhận biết Lambda là dấu mũi tên: `->`

## 1. Yêu cầu 1: Filter (Lọc danh sách) với `removeIf`

```java
students.removeIf(student -> student.getGpa() < 5.0);
```
Giải thích:
- `student`: chọn từng phần tử trong danh sách (`students`) và gọi là `student`
- `removeIf`: xóa với điều kiện, kết hợp dùng Lambda
- `->` = "kiểm tra xem có thỏa mãn điều kiện"
- `student.getGpa() < 5.0`: nếu điều kiện này `true` thì `student` đó bị xóa khỏi danh sách

Cách cũ:
```java
Iterator<Student> iterator = students.iterator();
while (iterator.hasNext()) {
    Student student = iterator.next();
    if (student.getGpa() < 5.0) {
        iterator.remove();
    }
```

## Yêu cầu 2: Sort (Sắp xếp tùy biến) với `sort`
```java
students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
```

Giải thích:
- `(s1, s2)`: Rút 2 sinh viên bất kỳ ra để so sánh
- `->` = "tiến hành so sánh bằng luật sau"
- `s1.getName().compareTo(s2.getName())`: Lấy tên của `s1` so với `s2` bằng hàm `compareTo`

## Yêu cầu 3: Custom Functional Interface (Tự chế khuôn Lambda)
>Vấn đề: Hai phần trên là ta đang xài "ké" các hàm có sẵn của Java (removeIf, sort). Vậy làm sao để ta tự chế tạo ra một cái hàm của riêng mình, và hàm đó cũng hỗ trợ viết tắt bằng mũi tên `->`?

### Bước 1: Tạo một cái khuôn (Interface)

Bạn tạo một Interface và gắn thẻ `@FunctionalInterface`. Thẻ này bắt buộc khuôn của bạn chỉ được phép có duy nhất 1 hàm chưa có phần thân.

```java
@FunctionalInterface
interface Operation<T>;
    T execute(T a, T b); // Khuôn này yêu cầu: Đưa vào 2 biến, trả về 1 kết quả
```

### Bước 2: Lấp đầy khuôn bằng Lambda

Vì cái khuôn execute yêu cầu 2 đầu vào, ta đưa 2 biến (a, b) vào. Sau mũi tên ->, ta viết phép toán ta muốn định nghĩa.

```java
// Lắp phép cộng vào khuôn
Operation<Double> add = (a, b) -> a + b;

// Lắp phép nhân vào khuôn
Operation<Double> multiply = (a, b) -> a * b;
```

Khi dùng thực tế: 
```java
add.execute(10.0, 5.0);
```