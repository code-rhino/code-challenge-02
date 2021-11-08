# Count Duplicate Letters

Given a letter count the number of times it appears:

* Use a HashMap to accomplish this task.


```java
@Test
@DisplayName("Count the number of times you see the letter A or a")
public void countDuplicateLettersTest01(){
    String input = "The Apple was in the basket, in supermarket.";
    Integer expectedNumber = 4;
    Integer actualNumber = countDupLetters.countDuplicateLetters(input, "a");
    Assertions.assertEquals(expectedNumber, actualNumber);
}
```