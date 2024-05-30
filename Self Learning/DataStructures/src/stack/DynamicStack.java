package stack;

class DynamicStack extends CustomStack{

    public DynamicStack() {
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public void push(int item) {
        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[array.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }

            array = temp;
        }

        // at this point we know that array is not full
        // insert item
        super.push(item);
    }
}
