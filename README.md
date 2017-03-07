# studentManagerWithEjb

Hướng dẫn cài đặt và build ứng dụng

Tạo mysql database (studentm) với table "student". (File đính kèm trong git)

![alt tag](https://raw.githubusercontent.com/FizzSchool/studentManagerWithEjb/master/img/Screenshot%20(384).png)

1. Tạo chính xác jdbc connection pool trên server glassfish map tới cơ sở dữ liệu.
2. Tên jdbc connection pool: studentEjb
3. Các thông số ở Additional properties:
- serverName - localhost
- databaseName - studentm
- user - root
- URL - jdbc:mysql://localhost:3306/studentm
- password (là password của root, mặc định của xampp là rỗng)
- driverClass - com.mysql.jdbc.Driver
- useUnicode - true
- characterSetResults - UTF-8
- characterEncoding - UTF-8
![alt tag](https://raw.githubusercontent.com/FizzSchool/studentManagerWithEjb/master/img/Screenshot%20(387).png)

Sau khi tạo thành công, ping thử test JDBC Connection pool
![alt tag](https://raw.githubusercontent.com/FizzSchool/studentManagerWithEjb/master/img/Screenshot%20(386).png)

4. Tạo jdbc resource với tên 
JNDI Name: jdbc/studentm
Pool Name: studentEjb vừa tạo và lưu.
![alt tag](https://raw.githubusercontent.com/FizzSchool/studentManagerWithEjb/master/img/Screenshot%20(385).png)



Build ứng dụng:
1. Chạy và deploy thành công CURDwithEJB-ejb
2. Chạy ứng dụng war thành công.
3. Chạy ứng dụng client. 

Lưu ý: Project class library (CURDRemote) ngang hàng với project (CURDwithEJB).
Trường hợp build null fail hay không thể build vì đã deploy rồi, dừng glassfish, clean và build lại
và chạy ứng dụng.