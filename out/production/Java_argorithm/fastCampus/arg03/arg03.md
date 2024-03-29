# 03. 정렬 알고리즘

---

## 평균 수행 시간이 O(n^2)인 알고리즘

---
`n개의 수를 n번 반복`
<br>
### 1) 버블 정렬(Bubble Sort)

- 두 개씩 비교
- ex. 50, 80, 70, 10, 60, 20, 40, 30 (asc_어센딩 정렬=오름차순 / desc_디센딩 정렬=내림차순)
- 어센딩 정렬 ) 50 80 비교하고 작은 숫자 왼쪽, 80 70 비교해서 작은 숫자 왼쪽,,,이런식으로 정렬
- 제일 큰 수가 맨 뒤로 가면, 제일 큰 수를 제외해서 다시 비교 시작

### 2) 삽입 정렬(Insertion Sort)

- 이미 정렬된 상태의 요소에 새로운 요소를 추가할 때 정렬하여 추가하는 개념
- 이미 앞에서 정렬된 상태 수들에서 자신의 위치를 찾음
- 두 번째 요소부터 이전 요소들과 비교하면서 insert 될 위치를 찾아가며 정렬하는 알고리즘
- ex. 50, 80, 70, 10 ...
- 어센딩 정렬 ) 50과 80을 먼저 비교했을 때 50, 80 순으로 정렬된다.
- 다음 50,80과 70을 비교했을 때 70은 80보다 작으니 80보다 앞으로 가되, 50보다 크니 50뒤에 머무른다.
- 다음 50,70,80 과 10을 비교했을 때, 80부터 순차적으로 비교를 하고 자신에게 맞는 위치를 찾아간다.

---

<손코딩>
![InsertionSort1](https://user-images.githubusercontent.com/79829085/148561384-44774110-2c42-45ac-9bbd-bd80843a2867.jpg)
<br>
![InsertionSort2](https://user-images.githubusercontent.com/79829085/148561408-2652f974-6cbc-4b9d-9431-f00b1f1cfe5c.jpg)
<br>
---

### 3) 선택 정렬(Selection Sort)

- 어센딩 정렬 ) 처음부터 끝까지 스캔하고, 제일 작은 수 앞으로 가져옴
- 제일 작은 수를 제외해서 처음부터 스캔 시작

## 평균 수행 시간이 O(logN)인 알고리즘

---

`검색 범위가 점점 감소하는 방식`

### 1) 퀵 정렬(Quick Sort)

### 2) 병합 정렬(Merge Sort)

### 3) 힙 정렬(Heap Sort)

- Heap_Tree -> 실제로 배열로 많이 구현
- min heap(가장 작은 수가 위에)_asc / max heap(가장 큰 수가 위에)_desc
- 항상 complete binary tree를 유지해야함_Re ordering (재정리 되면서) 트리에 특징이 바뀌면 안됌
- heap의 parent 위치하는 숫자는 child 숫자보다 크거나 작아야함
- 배열의 0번 인덱스는 잘 안씀
- parent의 위치는 주로 child index의 1/2에 해당
- 우선순위 큐(Priority Queue)를 구현할 때 Heap 활용

---

<손코딩>

![HeapSort1](https://user-images.githubusercontent.com/79829085/148674464-977671bc-7d80-4896-a6c1-6e345336726e.jpg) <br>
![HeapSort2](https://user-images.githubusercontent.com/79829085/148674467-7554514f-91f2-4692-8bcb-0eca519f3f13.jpg) <br>
![HeapSort3](https://user-images.githubusercontent.com/79829085/148674470-84ff9ac3-a700-4eae-ad51-db5a483b09a9.jpg) <br>
![HeapSort_delete1](https://user-images.githubusercontent.com/79829085/148674473-72bcfa86-5203-416d-93b1-53e9834b00fd.jpg) <br>
![HeapSort_delete2](https://user-images.githubusercontent.com/79829085/148674476-a73ce2b1-6c63-47ca-a633-e2cc4973faa4.jpg)
