package chapter04;
/*test1:����ɾ������ٴ�·��(while break)
  ĳ����100,000Ԫ��ÿ·��һ��·�ڶ���Ҫ�ɷ�->ѭ��
  1)�ֽ�>50,000,��5%
  2)�ֽ�<=50,000,��1000
*/
public class Hw04 {
    public static void main(String[] args){
        /*����1��
          1.���������money tax count
          2.����ѭ����>50000/<=50000
          3.�������ˣ�>=1000;��������
        */
        double money1 = 100000;
        // double tax = 0;
        int count1 = 0;
        while(money1 > 50000){
            // tax = money * 0.05;
            // System.out.println("��ɷѣ�" + tax + "Ԫ");
            money1 *= 0.95;
            count1++;
        }
        while(money1 <= 50000){
            // System.out.println("��ɷ�1000Ԫ");
            money1 -= 1000;
            count1++;
            if(money1 < 1000){
                // System.out.println("�������㣬���ֵ...");
                break;
            }
        }
        System.out.println("��һ����·��" + count1 +"��,���" + money1 + "Ԫ");
        /*����2��
          1.�������
          2.����ѭ��������ѭ��(true)
          3.�������ˣ�<1000/[1000,50000]/>50000
        */
        double money2 = 100000;
        int count2 = 0;
        while(true){
            if(money2 > 50000){
            money2 *= 0.95;
            count2++;
            }
            else if(money2 >= 1000){
                money2 -= 1000;
                count2++;
            }
            else{
                break;
            }
        }
        System.out.println("��һ����·��" + count2 +"�Σ����" + money2 + "Ԫ");
    } 
}

//test2:�ж�һ�������ķ�Χ:>0/<0/=0
class Hw04t2{
    public static void main(String[] args){
        int number = 0;
        if(number < 0){
            System.out.println("�����Ϊ����");
        }
        else if(number == 0){
            System.out.println("�����Ϊ��");
        }
        else{
            System.out.println("�����Ϊ����");
        }
    }
}

//test3���ж�һ�������Ƿ���ˮ�ɻ���
/*ˮ�ɻ���:��λ��������λ�ϵ����ֵ������͵����䱾��
  1.�������
  2.�ø�ʮ��ǧλ��n%10 (n/10)%10 n/100
  3.��������
*/
class Hw04t3{
    public static void main(String[] args){
        int n = 153;
        int a = n / 100;
        int b = (n / 10)%10;
        int c = n % 10;
        if(n == a*a*a+b*b*b+c*c*c){
            System.out.println("�����Ϊˮ�ɻ���");
        }
        else{
            System.out.println("���������ˮ�ɻ���");
        }
    }
}
//test4�����1-100֮�䲻�ܱ�5����������ÿ���һ��
/*
  1.�������:n count
  2.����ѭ����n=1��n<=100
  3.�������ˣ�n%5 == 0
  4.�������:System.out.print(ln)
*/
class Hw04t4{
    public static void main(String[] args){
        int count = 0;
        for(int n = 1;n <= 100;n++){
            if(n % 5 != 0){
                System.out.print(n + "\t");
                count++;
                if(count % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}

//test5�����Сд��a-z�ʹ�дZ-A
/*ѭ��+unicode����(int->charǿ��ת��)
  1.'a-z'==[97,122],'b'='a'+1
  2.'Z-A'==[90,65],'Y'=='Z'-1
*/
class Hw04t5{
    public static void main(String[] args){
        for(int n = 97;n <= 122;n++){
            System.out.print((char)n + " ");
        }    
        System.out.println();
        for(int n = 90;n >= 65;n--){
            System.out.print((char)n + " ");
        }    
        System.out.println();
        //char�ı�����һ�����������Խ�������
        for(char a = 'a';a <= 'z';a++){
            System.out.print(a + " ");
        }   
        System.out.println();
        for(char b = 'Z';b >= 'A';b--){
            System.out.print(b + " ");
        }      
    }
}

//test6����1-1/2+1/3-1/4...1/100
//1.�������������(1/n);��sum
//2.����ѭ����n=1,n<=100,n++
//3.�������ˣ�(n%2==0)����+��ż��-
//4.�����������㣺D/D���ܵõ���ȷ��С��
class Hw04t6{
    public static void main(String[] args){
        double sum = 0;
        for(int n = 1;n <= 100;n++){
            if(n % 2 != 0){
                sum += (1.0/n);
            }
            else{
                sum -= (1.0/n);
            }
        }
        System.out.print("1-1/2+1/3-1/4...1/100 = " + sum);
    }
}

//test7����1+(1+2)+(1+2+3)+...(1+2+...+100)�ĺ�
//1.���������sum=(),totalSum=()+()...
//2.����ѭ������ѭ����sum,��ѭ����sum��;
class Hw04t7{
    public static void main(String[] args){
        int sum = 0;
        for(int n = 1;n <= 100;n++){
            for(int m = 1;m <=n;m++){
                sum += m;
            }
        }
        System.out.println("totalSum=" + sum);
    }
}