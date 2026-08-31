package streams.advanced;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderMain {
    static void main() {
        List<Order> orders = new ArrayList<>();

        orders.add(new Order(
                101L, 1L, "PAID",
                BigDecimal.valueOf(1200.00),
                "CARD",
                LocalDateTime.of(2026, 8, 20, 10, 30)
        ));

        orders.add(new Order(
                102L, 1L, "CANCELLED",
                BigDecimal.valueOf(500.00),
                "UPI",
                LocalDateTime.of(2026, 8, 20, 11, 0)
        ));

        orders.add(new Order(
                103L, 1L, "PAID",
                BigDecimal.valueOf(800.00),
                "UPI",
                LocalDateTime.of(2026, 8, 21, 9, 15)
        ));

        orders.add(new Order(
                102L, 1L, "CANCELLED",
                BigDecimal.valueOf(500.00),
                "UPI",
                LocalDateTime.of(2026, 12, 20, 11, 0)
        ));

        orders.add(new Order(
                104L, 1L, "PAID",
                BigDecimal.valueOf(1500.00),
                "CARD",
                LocalDateTime.of(2026, 8, 21, 14, 20)
        ));

        orders.add(new Order(
                105L, 1L, "REFUNDED",
                BigDecimal.valueOf(300.00),
                "CARD",
                LocalDateTime.of(2026, 8, 21, 15, 0)
        ));

        orders.add(new Order(
                106L, 1L, "PAID",
                BigDecimal.valueOf(700.00),
                "UPI",
                LocalDateTime.of(2026, 9, 22, 10, 0)
        ));

        orders.add(new Order(
                106L, 1L, "PAID",
                BigDecimal.valueOf(700.00),
                "UPI",
                LocalDateTime.of(2026, 8, 22, 10, 0)
        ));

        orders.add(new Order(
                106L, 1L, "PAID",
                BigDecimal.valueOf(700.00),
                "UPI",
                LocalDateTime.of(2026, 9, 22, 10, 0)
        ));



        List<OrderResponse> paid = orders.stream()
                .filter(data -> data.getStatus().equals("PAID"))
                .map(ele -> new OrderResponse(ele.getId(), ele.getAmount(), ele.getPaymentMethod()))
                .toList();


        Map<String, BigDecimal> collect = orders.stream()
                .collect(Collectors.groupingBy(Order::getPaymentMethod,
                        Collectors.reducing(BigDecimal.ZERO, Order::getAmount, BigDecimal::add)));

        Order order = orders.stream()
                .max(Comparator.comparing(Order::getAmount)).get();

        Map<Long, Order> collect1 = orders.stream()
                .sorted(Comparator.comparing(Order::getCreatedAt))
                .collect(Collectors.toMap(Order::getId,
                        Function.identity(),
                        (exist, replace) -> exist

                ));
//        System.out.println(collect1);
        ArrayList<Order> lp =new ArrayList<>();

        for (Map.Entry<Long, Order> chuteBox: collect1.entrySet()){
//            System.out.println(chuteBox);
            lp.add(chuteBox.getValue());
        }

        Map<Long, BigDecimal> collect2 = orders.stream()
                .collect(Collectors.toMap(
                        Order::getId,
                        Order::getAmount,
                        BigDecimal::add
                ));
//        System.out.println(collect2);
//        Map<Long, BigDecimal> collect1 = orders.stream()
//                .collect(Collectors.toMap(Order::getId, Order::getAmount));

//        System.out.println(collect1);
//        System.out.println(collect);
//        System.out.println(orders);

        Map<String, BigDecimal> paidTotalAmount = orders.stream().filter(o -> o.getStatus().equals("PAID"))
                .collect(Collectors.toMap(Order::getStatus,
                        Order::getAmount,
                        BigDecimal::add
                ));
        System.out.println(paidTotalAmount.size());
//        PaidResponse pr = new PaidResponse();




//                .toList();
//        System.out.println(list);
    }
}

class OrderResponse {
    private Long orderId;
    private BigDecimal amount;
    private String paymentMethod;

    public OrderResponse(Long orderId, BigDecimal amount, String paymentMethod) {
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "OrderResponse(" +
                orderId + ", " +
                amount + ", \"" +
                paymentMethod + "\")";
    }
}

class PaidResponse {
    private Long paidOrderCount;
    private BigDecimal totalpaidAmount;
    private BigDecimal averagePaidAmount;

    public PaidResponse(Long paidOrderCount, BigDecimal totalpaidAmount, BigDecimal averagePaidAmount) {
        this.paidOrderCount = paidOrderCount;
        this.totalpaidAmount = totalpaidAmount;
        this.averagePaidAmount = averagePaidAmount;
    }

    @Override
    public String toString() {
        return "PaidResponse{" +
                "paidOrderCount=" + paidOrderCount +
                ", totalpaidAmount=" + totalpaidAmount +
                ", averagePaidAmount=" + averagePaidAmount +
                '}';
    }
}