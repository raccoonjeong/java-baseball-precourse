package baseball.controller;

import baseball.model.RandomNumberMaker;
import baseball.model.RandomNumberValidator;
import baseball.model.Refree;
import baseball.view.Input;
import baseball.view.Output;

public class BaseballController {

    public void startGame() {

        int[] target = new RandomNumberMaker().makeTargetNumber();

        // 인풋 받으라 view에 명령
        String input = new Input().input();

        // 받은 인풋을 검증하라고 Model에 명령
        new RandomNumberValidator().allValidate(input);

        String result = new Refree().gesture(target, input.split(""));

        new Output().output(result);
    }

}
