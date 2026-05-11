import java.util.Scanner;

class Calculator {
    boolean running = true;
    String inputBuffer = "";
    HistoryQueue history = new HistoryQueue();

    double evaluate(double x, double y, char op) {
        double result = 0;
        switch (op) {
            case '+': result = x + y; break;
            case '-': result = x - y; break;
            case '*': result = x * y; break;
            case '/':
                if (y == 0) {
                    throw new IllegalArgumentException("Don't divide by zero");
                }
                result = x / y;
                break;
            default:
                throw new IllegalArgumentException("Operator: " + op + " not supported.");
        }
        
        history.enter(result);
        return result;
    }

    String historyString() {
        StringBuilder hs = new StringBuilder("[");
        double[] currentH = history.show();
        for (int i = 0; i < history.countIndex; i++) {
            hs.append(currentH[i]);
            // Prevent adding a trailing comma on the last element
            if (i != history.countIndex - 1) {
                hs.append(", ");
            }
        }
        hs.append("]");
        return hs.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instantiate the calculator ONCE so history is preserved
        Calculator myCalculator = new Calculator(); 
        
        System.out.println("© From the desk of");
        System.out.println("www.mohammadazeem.in\n");
        System.out.println("enter:");
        System.out.println("to evaluate: <number> <number> <operator>");
        System.out.println("to exit: e / exit\n");
        
        while (myCalculator.running) {
            try {
                myCalculator.inputBuffer = sc.nextLine().trim();
                myCalculator.dealWithExit();
                
                // Only evaluate if the user didn't just type exit
                if (myCalculator.running) {
                    myCalculator.dealWithEvaluation();
                }
            } catch (Exception e) {
                System.out.println("🚨 error");
                System.out.println("=> " + e.getMessage());
            }
        }
        sc.close();
    }

    void dealWithExit() {
        if (inputBuffer.equals("e") || inputBuffer.equals("exit")) {
            running = false;
        }
    }

    void dealWithEvaluation() {
        String[] rawInputs = inputBuffer.split("\\s+");
        
        // Prevent array crashes if the user inputs too few arguments
        if (rawInputs.length < 3) {
            throw new IllegalArgumentException("Invalid input format. Use: <number> <number> <operator>");
        }

        System.out.println("rawInputs: " + rawInputs[0] + " " + rawInputs[1] + " "  + rawInputs[2]);
        
        // Evaluate using the instance method directly
        double result = this.evaluate(
            Double.parseDouble(rawInputs[0]),
            Double.parseDouble(rawInputs[1]),
            rawInputs[2].charAt(0)
        );
        
        System.out.println("result:  " + result);
        System.out.println("history: " + this.historyString());
    }
}

class HistoryQueue {
    int size = 5; 
    double[] history = new double[size];
    int countIndex = 0;

    void enter(double el) {
        if (countIndex >= size) {
            // Shift elements down
            for (int i = 1; i < size; i++) {
                history[i - 1] = history[i]; 
            }
            // Overwriting last position
            history[size - 1] = el;
        } else {
            // Populate array normally if not full yet
            history[countIndex] = el;
            countIndex++;
        }
    }

    double[] show() {
        return history;
    }
}
