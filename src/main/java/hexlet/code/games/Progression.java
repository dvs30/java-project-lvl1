package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public class Progression {
    static final int MINVALUELENGTH = 5;
    static final String QUESTION = "What number is missing in the progression?";
    public static void start() {
        GameEngine.start(QUESTION, gameLogic());
    }
    static String[][] gameLogic() {
        String[][] getProgression = new String[2][GameEngine.CHANCE];
        for (int i = 0; i < getProgression[0].length; i++) {
            //определеяем общую длину прогрессии
            int lengthProgression = MINVALUELENGTH + Utils.getRandomValueCalc(MINVALUELENGTH);
            //определяем шаг арифметической прогрессии
            int valueStep = Utils.getRandomValue() + 1;
            //определяем, какой индекс прогресси надо будет отгадывать
            int findIndex = Utils.getRandomValueCalc(lengthProgression) + 1;
            String buffer = new String();
            int nextStepValue = valueStep;
            for (int j = 1; j <= lengthProgression; j++) {
                if (j == findIndex) {
                    buffer += ".. ";
                    nextStepValue += valueStep;
                }
                buffer += nextStepValue + " ";
                nextStepValue += valueStep;
            }
            getProgression[0][i] = buffer;
            getProgression[1][i] = Integer.toString(findIndex * valueStep);
        }
        return getProgression;
    }
}
