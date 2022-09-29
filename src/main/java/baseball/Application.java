package baseball;

import baseball.controller.BaseballController;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        BaseballController controller = new BaseballController();
        controller.startGame();
    }


//    public static void main2(String[] args) {
//        int[] targets = new int[3];
//        int[] numberCount = new int[10];
//
//        targets[0] = Randoms.pickNumberInRange(1,9);
//
//        int index = 0;
//
//        while(true) {
//            if (numberCount[targets[index] - 1] < 1) {
//                numberCount[targets[index] - 1]++;
//                index++;
//                if (index >= 3) break;
//                targets[index] = Randoms.pickNumberInRange(1, 9);
//            } else {
//                targets[index] = Randoms.pickNumberInRange(1, 9);
//            }
//        }
//
//        System.out.println("컴퓨터의숫자:"+Arrays.toString(targets));
//
//        int strikeCount = 0;
//        int ballCount = 0;
//
//        while (true) {
//
//            String input = Console.readLine();
//
//            if (input.length() != 3) {
//                throw new IllegalArgumentException("길이가 3이 아님");
//            }
//            if (!input.matches("[+-]?\\d*(\\.\\d+)?")) {
//                throw new IllegalArgumentException("숫자가 아님");
//            }
//
//            String[] inputs = input.split("");
//
//            for (int i = 0; i < 3; i++) {
//                for (int j = i + 1; j < 3; j++) {
//                    if (inputs[i].equals(inputs[j])) {
//                        throw new IllegalArgumentException("중복된 숫자가 있음");
//                    }
//                }
//            }
//
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < 3; j++) {
//                    if (targets[i] == Integer.valueOf(inputs[j])) {
//                        if (i == j) {
//                            strikeCount++;
//                        } else {
//                            ballCount++;
//                        }
//                    }
//                }
//            }
//
//            StringBuffer result = new StringBuffer();
//            if (strikeCount > 0) {
//                result.append(strikeCount + "스트라이크");
//            }
//            if (ballCount > 0) {
//                result.append(ballCount + "볼");
//            }
//            if (strikeCount == 0 && ballCount == 0) {
//                result.append("낫싱");
//            }
//
//            System.out.println(result);
//
//            if (strikeCount == 3) {
//                System.out.println("정답을 축하합니다! 다시 시작하시려면 Y를 입력하세요.");
//                String inputY = Console.readLine();
//                if (inputY.equals("Y") || inputY.equals("y")) {
//                    // 다시 세팅 후 시작.
//                    targets = new int[3];
//                    numberCount = new int[10];
//
//                    targets[0] = Randoms.pickNumberInRange(1,9);
//
//                    index = 0;
//                    while(true) {
//                        if (numberCount[targets[index] - 1] < 1) {
//                            numberCount[targets[index] - 1]++;
//                            index++;
//                            if (index >= 3) break;
//                            targets[index] = Randoms.pickNumberInRange(1, 9);
//                        } else {
//                            targets[index] = Randoms.pickNumberInRange(1, 9);
//                        }
//                    }
//                    System.out.println("컴퓨터의숫자:"+Arrays.toString(targets));
//
//                    strikeCount = 0;
//                    ballCount = 0;
//                } else {
//                    break;
//                }
//            }
//            strikeCount = 0;
//            ballCount = 0;
//            System.out.println("다시 ㄱㄱ");
//        }
//
//    }
}
