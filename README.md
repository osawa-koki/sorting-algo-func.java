# sorting-algo-func.java

ððð Javaã§å®è£ããæ´åã¢ã«ã´ãªãºã ã®é¢æ°ãã¾ã¨ãã¦ãã¾ãã  

## å®è¡æ¹æ³

```shell
docker build -t sorting-algo-func-java .
docker run -it --rm --name my-sorting-algo-func-java sorting-algo-func-java
```

```output
Original             (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 7 6 1 2 0 3 4 8 9 5
Bubble Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 7 8 5 1 9 3 4 0 2 6
Selection Sort       (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 3 6 8 0 2 9 4 7 5
Insertion Sort       (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 6 3 4 1 7 2 5 8 0 9
Merge Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 5 1 7 3 4 9 8 0 6 2
Quick Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 6 8 5 1 3 7 0 4 2 9
Heap Sort            (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 7 9 1 0 2 3 5 4 8 6
Shell Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 7 5 3 2 1 6 8 9 0
Counting Sort        (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 5 7 1 0 4 9 8 3 6 2
Bucket Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 2 4 5 7 6 9 1 8 3 0
Comb Sort            (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 7 0 5 2 8 3 6 9 4
Cycle Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 1 6 0 2 7 3 8 9 5
Pancake Sort         (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 1 3 4 2 0 6 7 9 8 5
Gnome Sort           (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 4 3 0 5 8 6 1 2 7 9
Stooge Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 7 0 4 3 9 6 8 1 2 5
Pigeonhole Sort      (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 6 0 9 4 2 7 1 5 3 8
Odd-Even Sort        (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 0 6 9 8 5 3 2 1 7 4
Cocktail Sort        (true ) : 0 1 2 3 4 5 6 7 8 9
Shuffled             (false) : 8 2 9 7 3 0 1 4 5 6
Starnd Sort          (true ) : 0 1 2 3 4 5 6 7 8 9
```

---

`test`ãã£ã¬ã¯ããªåã«ãã¹ãã³ã¼ããè¨è¿°ãã¦ãã¾ãã  

| ãã¹ãã³ã¼ã | èª¬æ |
| --- | --- |
| ShuffleTest | å¼æ°ã¨ãã¦æ¸¡ãããéåãã·ã£ããã«ããé¢æ°ã®ãã¹ã |
| IsSortedTest | å¼æ°ã¨ãã¦æ¸¡ãããéåãã½ã¼ãããã¦ããããç¢ºèªããé¢æ°ã®ãã¹ã |
| SortingAlgoTest | åã¢ã«ã´ãªãºã ãå®è£ããé¢æ°ãæ­£ããéåãæ´åã§ãã¦ããããç¢ºèªãããã¹ã |

## å®è£ããã¢ã«ã´ãªãºã 

- [x] ããã«ã½ã¼ã
- [x] é¸æã½ã¼ã
- [x] æ¿å¥ã½ã¼ã
- [x] ãã¼ã¸ã½ã¼ã
- [x] ã¯ã¤ãã¯ã½ã¼ã
- [x] ãã¼ãã½ã¼ã
- [x] ã·ã§ã«ã½ã¼ã
- [x] ã«ã¦ã³ãã½ã¼ã
- [x] ãã±ãã½ã¼ã
- [x] ã³ã ã½ã¼ã
- [x] ãµã¤ã¯ã«ã½ã¼ã
- [x] ãã³ã±ã¼ã­ã½ã¼ã
- [x] ãã¼ã ã½ã¼ã
- [x] ã¹ãã¥ã¼ã¸ã½ã¼ã
- [x] é³©ãå·£ã½ã¼ã
- [x] å¥éè»¢ç½®ã½ã¼ã
- [x] ã«ã¯ãã«ã½ã¼ã
- [x] ã¹ãã©ã³ãã½ã¼ã

## èªåç¨ã¡ã¢

### IntelliJ IDEAå®è¡ãã¿ã³ãæå¹åãããªã

`src`ãã£ã¬ã¯ããªãå³ã¯ãªãã¯ãã¦ã`Mark Directory as` -> `Sources Root`ãé¸æããã¨ãå®è¡ãã¿ã³ãæå¹åããã¾ãã  
