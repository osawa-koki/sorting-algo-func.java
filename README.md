# sorting-algo-func.java

🎃🎃🎃 Javaで実装した整列アルゴリズムの関数をまとめています。  

## 実行方法

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

`test`ディレクトリ内にテストコードを記述しています。  

| テストコード | 説明 |
| --- | --- |
| ShuffleTest | 引数として渡された配列をシャッフルする関数のテスト |
| IsSortedTest | 引数として渡された配列がソートされているかを確認する関数のテスト |
| SortingAlgoTest | 各アルゴリズムを実装した関数が正しく配列を整列できているかを確認するテスト |

## 実装したアルゴリズム

- [x] バブルソート
- [x] 選択ソート
- [x] 挿入ソート
- [x] マージソート
- [x] クイックソート
- [x] ヒープソート
- [x] シェルソート
- [x] カウントソート
- [x] バケツソート
- [x] コムソート
- [x] サイクルソート
- [x] パンケーキソート
- [x] ノームソート
- [x] ステゥージソート
- [x] 鳩ノ巣ソート
- [x] 奇遇転置ソート
- [x] カクテルソート
- [x] ストランドソート

## 自分用メモ

### IntelliJ IDEA実行ボタンが有効化されない

`src`ディレクトリを右クリックして、`Mark Directory as` -> `Sources Root`を選択すると、実行ボタンが有効化されます。  
