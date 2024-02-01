# Service_Request

classDiagram
    Order "1" *-- "N" OrderItem
    Order "1" *-- "1" Client

    class Order {
        - moment: Date
        - items: List<OrderItem>
        - status: OrderStatus

        + addItem(item: OrderItem): void
        + removeItem(item: OrderItem): void
        + getSummary(): String
    }

    class OrderItem {
        - quantity: Integer
        - product: Product

        + getPrice(): Double
    }

    class Client {
        - name: String
        - email: String
        - birthDate: Date

        + getName(): String
        + getEmail(): String
        + getBirthDate(): Date
    }

    enum OrderStatus {
        FINDING_PAYMENT = 1
        PROCESSING = 2
        DELIVERED = 3
    }
