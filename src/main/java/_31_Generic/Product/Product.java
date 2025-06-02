package _31_Generic.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product<T> {
    // 멤버 변수
    private String productName;
    private T productInfo;

}
