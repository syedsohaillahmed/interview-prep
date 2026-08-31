package streams.advanced;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {

       private Long id;
      private   Long customerId;
       private String status;
       private BigDecimal amount;
      private   String paymentMethod;
       private LocalDateTime createdAt;

        public Order(Long id, Long customerId, String status, BigDecimal amount, String paymentMethod, LocalDateTime createdAt) {
            this.id = id;
            this.customerId = customerId;
            this.status = status;
            this.amount = amount;
            this.paymentMethod = paymentMethod;
            this.createdAt = createdAt;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Long customerId) {
            this.customerId = customerId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

