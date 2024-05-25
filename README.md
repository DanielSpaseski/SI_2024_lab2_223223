## Daniel Spaseski 223223
### Control Flow Graph
![Lab2_223223CFG_1 drawio](https://github.com/DanielSpaseski/SI_2024_lab2_223223/assets/138517620/cdf900ef-cabf-4bb4-ae68-701fb81e57ae)


### Цикломатска комплексност
Цикломатската комплексност на овој код е 10. Ја добив преку формулата Р+1, Р=9 е бројот на предикатни јазли.
### Тест случаи според критериумот Every branch
Со следните три тест случаи може да се добие минималниот број на тест случаи според Every Branch критериумот. Во првиот тест случај, првиот елемент од листата е внесен без име кое потоа се сетира на 'unknown', вториот е без баркод и со тоа се покрива тест случајот кога фрламе исклучок, а третиот е со невалиден баркод карактер со што се покрива тест случајот кога фрламе исклучок.
Во вториот тест случај, првиот елемент во листата е со целосно валидни информации, а вториот елемент има баркод кој што започнува со '0' и со тоа се поминува и јазолот 19-20 и на крајот враќа false, уплатената сума е поголема од вкупната цена на предметите.
Во третиот тест случај, листата е еднаква на null и поради тоа фрламе исклучок уште на почетокот, во втората линија од функцијата. Тука вредноста на payment не ни е важна.
| Branch  | allItems=[new Item("","123456",100,0), new Item("item","",100,0), new Item("item","1234a6",100,0)], payment=100 | allItems=[new Item("item","123456",100,1), new Item("item","012345",350,1)], payment=50 | allItems=null, payment=X |
| ------------- | ------------- | ------------- | ------------- | 
| 1-2  |   |  |   *|   
| 1-3  |  * | *|   | 
| 2-24 |   | |   *| 
| 3-4.1|  * | *|   | 
| 4.1-4.2  |  * | *|   | 
| 4.2-5  |  * | *|   | 
| 4.2-21  |  * | *|   | 
| 5-6  |  * |    *| |
| 6-7  |  * |    | |
| 6-8  |  * |    *| |
| 7-8  |   *|    | |
| 8-9  |   *|   *| |
| 8-18  |   *|    | |
| 9-10  |  * |    *| |
| 10-11.1  | *  | *|   | 
| 11.1-11.2  | *  | *|   | 
| 11.2-12  |   *| *|   | 
| 11.2-15  |   *| *|   | 
| 12-13  |   *| *|   | 
| 13-11.3  |  * | *|   | 
| 13-14  |  * | |   | 
| 11.3-11.2  |   *| *|   | 
| 14-24  |   *| |   | 
| 15-16  |   | *|   | 
| 15-17  |   *| |   | 
| 16-19  |   | *|   | 
| 17-19  |   *| |   | 
| 19-20  |   | *|   | 
| 19-4.3  |  * | *|   | 
| 20-4.3  |   | *|   | 
| 4.3-4.2  |  * | *|   | 
| 21-22  |   *| |   | 
| 21-23  |   | *|   | 
| 22-24  |   *| |   | 
| 23-24  |   | *|   | 
| 18-24  |  * | |   | 
### Тест случаи според критериумот Multiple Condition за if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0)== '0')
| Combination | Test case|
| ------------- | ------------- |
| TTT | [new Item("item","012345",350,1)], X |
| TTF | [new Item("item","123456",350,1)], X |
| TFX | [new Item("item",X,350,0)], X |
| FXX | [new Item("item",X,100,X)], X |
