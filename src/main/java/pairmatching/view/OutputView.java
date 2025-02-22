package pairmatching.view;

import pairmatching.domain.Crew;
import pairmatching.domain.MissionPair;

import java.util.List;
import java.util.StringJoiner;

public class OutputView {

    public void printFunctionSelectMessage() {
        println("기능을 선택하세요.");
        println("1. 페어 매칭");
        println("2. 페어 조회");
        println("3. 페어 초기화");
        println("Q. 종료");
    }

    public void printMatchDataInputMessage() {
        printEnter();
        printLine();
        printMatchData();
        printExample();
    }

    private void printExample() {
        println("ex) 백엔드, 레벨1, 자동차경주");
    }

    private void printMatchData() {
        println("과정: 백엔드 | 프론트엔드");
        println("미션:");
        println("  - 레벨1: 자동차경주 | 로또 | 숫자야구게임");
        println("  - 레벨2: 장바구니 | 결제 | 지하철노선도");
        println("  - 레벨3:");
        println("  - 레벨4: 성능개선 | 배포");
        println("  - 레벨5:");
        printLine();
        println("과정, 레벨, 미션을 선택하세요.");
    }

    private void printLine() {
        println("#############################################");
    }

    public void printMissionPairs(MissionPair missionPair) {
        printEnter();
        println("페어 매칭 결과입니다.");
        List<List<Crew>> pairs = missionPair.getMissionPair();
        StringJoiner crewJoiner = new StringJoiner(" : ");
        for (List<Crew> pair : pairs) {
            for (Crew crew : pair) {
                crewJoiner.add(crew.toString());
            }
            println(crewJoiner.toString());
            crewJoiner = new StringJoiner(" : ");
        }
        printEnter();
    }

    public void printMissionPairsResetMessage() {
        printEnter();
        println("초기화 되었습니다.");
        printEnter();
    }

    public void printError(Exception error) {
        System.out.println(error.getMessage());
    }

    public void print(String message) {
        System.out.print(message);
    }

    public void println(String message) {
        System.out.println(message);
    }

    public void printEnter() {
        System.out.println();
    }

}

