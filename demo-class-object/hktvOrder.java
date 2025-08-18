import java.math.BigDecimal;
import java.util.Arrays;

public class hktvOrder {       // Order is a Class.
  private hktvItem[] items;    // tell java that, "items" is attribute.

  // Constructor; initial load
  // 適用於以後需要擴建的 array
  public hktvOrder() {
    // ! initial load of creating object, 後續調整 array 更自動化人性化.
    this.items = new hktvItem[0];
  }
  
  public void setItems(hktvItem[] items) {
    this.items = items;
  }

  public hktvItem[] getItems() {
    return this.items;
  }

  public void add(hktvItem newItem) {
  // create a new array
  // this.items is old array
    // item[] length x
    // item[] length x + 1
    hktvItem[] items = new hktvItem[this.items.length + 1];
    // copy the elements in this.items to the new item array.
    for (int i = 0; i < this.items.length; i++) {
      items[i] = this.items[i];
      // 將 existing item object (i.e.[i]), 從 old address (i.e. this.items) 移向 new address (i.e. items).
    }
    // add the new item to the tail of array.
    items[items.length - 1] = newItem;
    // replace the old array by the new array.
    this.items = items;
  }

  // public Item[] getItems(){
  //   return this.items;
  // }

  public double[] subtotals() {
    double[] subtotals = new double[this.items.length];
    for (int i = 0; i < items.length; i++) {
      subtotals[i] = this.items[i].subtotal();
    }
    return subtotals;
  }

  // public double[] total() {    is invalid.
  public double total() {    // total is method.
    BigDecimal sum = BigDecimal.ZERO;    // BigDecimal.valueOf(0.0)
    for (hktvItem item : this.items) {
      // BigDecimal add() --> new BigDecimal Object
      sum = sum.add(BigDecimal.valueOf(item.subtotal()));
    }
    return sum.doubleValue();
  }


  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {
    hktvItem item1 = new hktvItem();
    item1.setPrice(73.3);
    item1.setQuantity(2);
    hktvItem item2 = new hktvItem();
    item2.setPrice(99.9);
    item2.setQuantity(3);

    // Item[] items = new Item[2];
    // items[0] = item1;
    // items[1] = item2;
    // 一旦 Item[] items 已定格為 2 格, 則以後不能再修改.
    // 如果 developer 事後希望更改 item array 格數,
    // 則必須另開新 item array, (e.g. Item[] itemsss = new Item[10]),
    // 再將原本 data, 由 items 搬過去 itemsss.
    // 再將 Object 指向新 item array, 不再指向原本 array.

    // 每個 Object 都會裝載多個 address, Object 不會裝載 Object.

    // 真正運行 memory 的時間, 由 order.add(item) 開始.

    // Item[] items = new Item[0];    // 0 長度不是 null, 0 長度都叫有長度, 只不過該 array 不能放任何 address.
    // 將 add.items 自動化




    // Order order1 = new Order();
    // order1.setItems(items);
    // order1.add(item1);

    hktvItem item3 = new hktvItem();
    item3.setPrice(100.0);
    item3.setQuantity(3);

    hktvOrder order1 = new hktvOrder();
    order1.add(item1);
    order1.add(item2);
    order1.add(item3);


    // System.out.println(order1.getItems()[0].subtotal());
    // System.out.println(order1.getItems()[1].subtotal());
    // System.out.println(order1.getItems()[2].subtotal());

    System.out.println(Arrays.toString(order1.subtotals()));    // [146.6, 299.7, 300.0]
    // order1 是 address, order 是 object, getItems() 是 method, 
    // items[] 是裝 items 的 array, [0] 是 array object,
    // 最後, user 可搜尋 結果. subtotal() 是 result.

    // result, 是需要 developer 事前在上方, define attributes (i.e. price, quantity)

    System.out.println(order1.total());

    hktvOrder order2 = new hktvOrder();
    System.out.println(order2.total());    // 0.0
    System.out.println(Arrays.toString(order2.subtotals()));    // []
    
    // the below logic is to calculate the total of times.
    for (int i = 0; i < order1.subtotals().length; i++) {

    }

  }
}
