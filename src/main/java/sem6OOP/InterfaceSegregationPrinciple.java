package sem6OOP;

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        // Принцип разделения интерфейсов
    }

    private class UserInfoWindow {

        private UserService userService;

        public void openUserWindow(long userId) {
            User userById = userService.findUserById(userId);
            //показываем окошко с информацией по этому пользователю
        }
    }

    private interface UserService {
        User findUserById(long id);
    }

    private interface CartService {
        Cart findCartByUserId(long userId);
        void clearCart(long cartId);
    }

    private static class DatabaseService implements UserService, CartService {

        public User findUserById(long id) {
            // ищем ползователя в бд
            // select * from user where id = 'id'
            return null;
        }

        public Cart findCartByUserId(long userId) {
            return null;
        }

        public void clearCart(long cartId) {
            // ...
        }

    }

    private class Cart {
        // ....
    }

    private class User {

        private long id;

        public User(long id) {
            this.id = id;
        }
    }
}
