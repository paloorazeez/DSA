package queue.exception;

public class QueueUnderflowException extends RuntimeException {
    public QueueUnderflowException(String message) {
        super(message);
    }
}
