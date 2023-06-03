package practice.collection;

//создать класс для описания бинарного дерева и сохранить в виде этого дерева коллекцию чисел:
//20,7,35,4/9/31/40/6,28,38,52. Найти сумму всех эл-тов этого дерева, используя рекурсивный метод summ
class TreeExample {
    public static void main(String[] args) {
        Tree root =
                new Tree(20, new Tree(7, new Tree(4, null, new Tree(6)), new Tree(9)), new Tree(35, new Tree(31, new Tree(28), null), new Tree(40, new Tree(38), new Tree(52))));
        System.out.println(root.summ());
        System.out.println(root);
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int summ() {
            int summ = value;
            if (left != null) {
                summ += left.summ();
            }
            if (right != null) {
                summ += right.summ();
            }
            return summ;
        }

        @Override
        public String toString() {
            return "Tree{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
