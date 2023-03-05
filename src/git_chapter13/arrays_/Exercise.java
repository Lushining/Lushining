package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Lusion
 * @version 1.0
 */
/*通过comparable接口,实现定制排序
  1.价格从小到大
  2.价格从大到小
  3.书名长度
 */
public class Exercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("新金瓶梅",90);
        books[2] = new Book("新青年文摘",5);
        books[3] = new Book("西游记精装版",80);
        System.out.println("==========从小到大定制排序==========");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int n1 = o1.getPrice();
                int n2 = o2.getPrice();
                return n1-n2;
            }
        });
        System.out.println(Arrays.toString(books));
        System.out.println("==========从大到小定制排序==========");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int n1 = o1.getPrice();
                int n2 = o2.getPrice();
                return n2-n1;
            }
        });
        System.out.println(Arrays.toString(books));
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int n1 = o1.getName().length();
                int n2 = o2.getName().length();
                return n1-n2;
            }
        });
        System.out.println("==========书名长度定制排序==========");
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private int price;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Book{" + name + '\t' + price + '}';
    }
}
