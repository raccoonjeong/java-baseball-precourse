package baseball.controller;

import static baseball.view.Input.input;
import static baseball.view.Output.output;

import baseball.model.Numbers;
import baseball.model.RandomNumbers;
import baseball.model.Refree;
import baseball.model.ResultDTO;

public class BaseballController {

    private RandomNumbers answerNumber;
    private ResultDTO resultDTO;

    public void initializeGame() {
        readyGame();
        startGame();
    }

    private void readyGame() {
        answerNumber =  new RandomNumbers();
    }

    private void startGame() {
        process();
        result();
    }

    private void process() {
        Numbers inputNumber = new Numbers(input());
        Refree refree = new Refree();
        resultDTO = refree.gesture(answerNumber.getList(), inputNumber.getList());
    }

    private void result() {
        output(resultDTO.getResult());

        if (isGameOver()) {
            startGame();
            return;
        }

        playAgain();
    }

    private boolean isGameOver() {
        return resultDTO.getStrikeCount() != 3;
    }

    private void playAgain() {
        output("처음부터 다시 시작하려면 1을 입력하시오. 종료하려면 2를 입력하시오.");
        String inputString = input();
        if ("1".equals(inputString)) {
            initializeGame();
        }
        if ("2".equals(inputString)) {
            output("게임 종료");
        }
    }

}
