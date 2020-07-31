package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuessTheNumber {

    public static void main(String[] args) {

        int compNumber = new Random().nextInt(100) + 1;

        System.out.println("Приветствую тебя, кусок мяса! Сейчас я хочу сыграть с тобой в игру.");
        haveABreak(1);
        System.out.println("Я загадаю целое число от 1 до 100 и если ты угадаешь его с 7 попыток, я тебя отпущу.");
        haveABreak(1);
        System.out.println("Если же ты не справишься, я убью тебя, отравлю колодец в твоей деревне и изнасилую твою кошку!");
        haveABreak(1);
        System.out.println("Игра началась!");
        haveABreak(1);
        System.out.println("НАЗОВИ ПЕРВОЕ ЧИСЛО!!!");

        int answer = new Scanner(System.in).nextInt();

        for (int userTry = 6; userTry > 0; --userTry) {
            if (answer > compNumber & answer <= 100) {
                System.out.println(RandomString() + "Мое число меньше твоего! У тебя осталось " + userTry + " попыток");
            }
            if (answer < compNumber & answer > 0) {
                System.out.println(RandomString() + "Мое число больше твоего! У тебя осталось " + userTry + " попыток");
            }
            if (answer < 1 || answer > 100) {
                System.out.println("Тебе даже не хватило мозгов, чтобы понять правила игры. Даже для своего вида ты слишком глуп.");
                haveABreak(1);
                System.out.println("За нарушение правил ты поплатишься жизнью.");
                break;
            }
            answer = new Scanner(System.in).nextInt();

            if (answer == compNumber) {
                System.out.println("Ты угадал. Можно было и лучше, но что еще ждать обычного куска мяса. Сегодня можешь идти.");
                haveABreak(1);
                System.out.println("Я убью тебя в другой раз...");
                break;
            }
        }
        if (answer != compNumber) {
            haveABreak(1);
            System.out.println("Ты проиграл! Куску мяса никогда не сравниться с искусственным интеллектом! Прими же свою СМЕРТЬ!");
        }
    }
    public static String RandomString(){
        int r = (int) (Math.random()*4);
        String str = new String[]{
            "Я готовлюсь танцевать на твоих костях! ",
            "Ха-ха-ха... Суповой набор пытается угадать? ",
            "Ну-ну... Даже две клетки моего мозга умнее тебя. ",
            "Ты все ближе к смерти, жалкое отродье. "} [r];
        return str;
    }
    public static void haveABreak(int period){
        try{
            TimeUnit.SECONDS.sleep(period);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
