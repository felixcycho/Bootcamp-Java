public class Order {
  private Item[] items;

  // setter

  // getter

  // method: presentation -> total quantity, total amount

  public void setItems(Item[] items) {
    this.items = items;
  }

  public Item[] getItems() {
    return this.items;
  }

  public void add(Item item) {
    // item[] length x
    // item[] length x + 1
    Item[] items = new Item[this.items.length + 1];
    for () {
      
    }
  }

  public static void main(String[] args) {
    Item item1 = new Item();
    item1.setPrice(73.3);
    item1.setQuantity(2);
    Item item2 = new Item();
    item2.setPrice(99.9);
    item2.setQuantity(3);

    Item[] items = new Item[2];
    items[0] = item1;
    items[1] = item2;
    // 一旦 Item[] items 已定格為 2 格, 則以後不能再修改.
    // 如果 developer 事後希望更改 item array 格數,
    // 則必須另開新 item array, (e.g. Item[] itemsss = new Item[10]),
    // 再將原本 data, 由 items 搬過去 itemsss.
    // 再將 Object 指向新 item array, 不再指向原本 array.

    // 每個 Object 都會裝載多個 address, Object 不會裝載 Object.

    Order order1 = new Order();
    order1.setItems(items);
    order1.add(item1);

    Item item3 = new Item();
    item3.setPrice(100.0);
    item3.setQuantity(3);
    order1.add(item3);

    System.out.println(order1.getItems()[0].subtotal());
    // order1 是 address, order 是 object, getItems() 是 method, 
    // items[] 是裝 items 的 array, [0] 是 array object,
    // 最後, user 可搜尋 結果. subtotal() 是 result.

    // result, 是需要 developer 事前在上方, define attributes (i.e. price, quantity)
    
  }
}
