/*
*
*/

import java.util.Scanner;

public class javabaseball{

    public static boolean game_continue(){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input == 1){
            return true;
        }
        if(input == 2){
            return false;
        }
        return true;
    }

    public void game_start(){

    }

    public static void main(String[] args){
        boolean continue_flag = true;
        while(continue_flag){
            game_start();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            continue_flag = game_continue();
        }
    }
}


