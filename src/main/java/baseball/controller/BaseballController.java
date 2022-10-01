package baseball.controller;

import baseball.model.Numbers;
import baseball.model.RandomNumberMaker;
import baseball.model.RandomNumberValidator;
import baseball.model.RandomNumbers;
import baseball.model.Refree;
import baseball.view.Input;
import baseball.view.Output;

public class BaseballController {

    public void startGame() {

        RandomNumbers answerNumber = new RandomNumbers();

        // 인풋 받으라 view에 명령
        String inputString = new Input().input();

        Numbers inputNumber = new Numbers(inputString);

        String result = new Refree().gesture(answerNumber, inputNumber);

        new Output().output(result);
    }

}
