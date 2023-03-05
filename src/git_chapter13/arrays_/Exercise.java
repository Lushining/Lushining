package arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Lusion
 * @version 1.0
 */
/*ͨ��comparable�ӿ�,ʵ�ֶ�������
  1.�۸��С����
  2.�۸�Ӵ�С
  3.��������
 */
public class Exercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("��¥��",100);
        books[1] = new Book("�½�ƿ÷",90);
        books[2] = new Book("��������ժ",5);
        books[3] = new Book("���μǾ�װ��",80);
        System.out.println("==========��С����������==========");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int n1 = o1.getPrice();
                int n2 = o2.getPrice();
                return n1-n2;
            }
        });
        System.out.println(Arrays.toString(books));
        System.out.println("==========�Ӵ�С��������==========");
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
        System.out.println("==========�������ȶ�������==========");
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
