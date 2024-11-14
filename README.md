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