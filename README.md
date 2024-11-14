# Inversion of Control
Sebuah prinsip dalam pembuatan perangkat lunak, dimana kita melakukan pemindahan kontrol untuk object atau program ke 
sebuah container di framework

Spring adalah framework IoC. Di mana kita menyerahkan banyak pekerjaan ek dalam program kita ke Spring.

# Application Context
ApplicationContext adalah sebuah interface representasi container IoC di Spring. Ini adalah inti dari Spring framework.

# Configuration
Perlu membuat configuration class untuk menggunakan ApplicationContext.

```java
import org.springframework.context.annotation.Configuration;

@Configuration
public class helloWorldConfiguration(){
    
}
```

## Create Application Context
Kita menggunakan class AnnotationConfigApplicationContext untuk membuat application context.

# Singleton
Salah satu design pattern untuk pembuatan object. Di mana, object hanya dibuat satu kali saja.
Ini penting, karena ini akan dibawa oleh Spring. Karena Spring akan membuat object secara singleton

## Membuat Singleton di Java
Cara paling sering yang digunakan adalah membuat class yang berisikan static method untuk membuat object dirinya sendiri.
```java
public class Database{
    private static Database database;
    
    public static Database getInstance(){
        if (database == null){
            database = new Database();
        }
        return database;
    }
    
    private Database(){
        
    }
}
```

# Bean
Object yang kita masukan kedalam Spring Container adalah Bean (defaultnya Singleton).
Jadi ketika kita mengakses bean yang sama, maka itu adalah object yang sama.

## Membuat Bean
Membuat sebuah method di dalam configuration, maka method tersebut adalah Beannya. Sehingga object yang menjadi return
adalah object bean. Method tersebut harus diberi annotasi @Bean untuk menandakan bahwa itu adalah Bean.

Secara otomatis Spring akan eksekusi methid tersebut, dan return valuenya akan dijadikan object eban secara otomatis, 
dan disimpan di dalam container (ApplicationContext).

# Mengakses Bean
Kita bisa menggunakan getBean milik ApplicationContext. Karena sebuah object akan dimanage oleh ApplicationContext.

## Duplicate Bean
Kita bisa mendaftarkan beberapa bean dengan tipe data yang sama. Syaratnya nama beannya harus beda.
Dan ketika mengakses beannya, kita harus menyebutkan nama beannya.

### Primary Bean
Jika ada duplicate, maka primary akan dijasikan default beannya.

### Mengubah Nama Bean
Secara default nama bean itu sama dengan nama Methodnya.
Kita bisa menggunakan methid value() milik annotaion @Bean

# Dependency Injection
Sebuah teknik mengotomatiasasi proses pembuatan object yang tergantung dengan object lain. Dependencies akan secara
otomatis diinject (dimasukan) ke dalam object yang membutuhkannya.