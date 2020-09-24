import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = 0;
    int sum = 0;
    int i = 0;    
    System.out.println("수를입력하세요.");
    input = sc.nextInt();
    for(sum = 0; i <= input; i = i + 1){
    System.out.println("수를입력하세요.");
    sum = sc.nextInt();
    sum = sum + sum;
    }
    System.out.println("모든수의합은"+sum+"입니다.");
  }
}