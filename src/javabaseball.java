/*
*
*/

import java.util.Scanner;
import java.util.Random;

public class javabaseball{

    public static int input_number(){
        System.out.println("숫자를 입력해주세요 : ");
        
        return 0;
    }

    public static void output_result(int result){

    }

    public static int baseball_judge(int computer_ball, int player_swing){
        return 3;
    }

    public static boolean game_continue(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
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

    public static void game_start(){
        Random random = new Random();
        int computer_ball = (random.nextInt(9) + 1) * 100 + (random.nextInt(9) + 1) * 10 + (random.nextInt(9) + 1);
        int player_swing;
        int result = 0;

        while(result % 10 != 3){
            player_swing = input_number();
            result = baseball_judge(computer_ball, player_swing);
            output_result(result);
        }
    }

    public static void main(String[] args){
        boolean continue_flag = true;
        while(continue_flag){
            game_start();
            continue_flag = game_continue();
        }
    }
}


