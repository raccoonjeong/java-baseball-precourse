package baseball.controller;

import baseball.model.RandomNumberMaker;
import baseball.model.RandomNumberValidator;
import baseball.model.Refree;
import baseball.view.Input;
import baseball.view.Output;

public class BaseballController {

    int[] target;

    // 게임시작 요청받으면,
    public void readyGame() {
        // 컴퓨터에 랜덤숫자 생성하라고 명령
        target = new RandomNumberMaker().makeTargetNumber();
    }

    public void startGame() {
        // 인풋 받으라 view에 명령
        String input = new Input().input();
        new RandomNumberValidator().allValidate(input);

        String[] inputs = input.split("");
        String result = new Refree().gesture(target, inputs);
        new Output().output(result);
    }

}
