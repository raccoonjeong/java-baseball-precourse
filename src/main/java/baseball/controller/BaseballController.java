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
        resultDTO = refree.gesture(answerNumber, inputNumber);
    }

    private void result() {
        output(resultDTO.getResult());

        if (isGameOver()) {
            startGame();
        }

        if (isPlayAgain()) {
            initializeGame();
        }
    }

    private boolean isGameOver() {
        return resultDTO.getStrikeCount() != 3;
    }

    private boolean isPlayAgain() {
        output("처음부터 다시 시작하려면 1을 입력하시오. 종료하려면 아무 키나 누르시오.");
        String inputString = input();
        return "1".equals(inputString);
    }

}
