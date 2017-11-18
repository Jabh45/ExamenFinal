package pregunta5;

public enum LogType {
    INFO {
        public String toString() {
            return "INFO";
        }
    },
    DEBUG {
        public String toString() {
            return "DEBUG";
        }
    },
    ERROR {
        public String toString() {
            return "ERROR";
        }
    },
    FAULT {
        public String toString() {
            return "FAULT";
        }
    }
}
