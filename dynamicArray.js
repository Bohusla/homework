// 23.06:
// 1 уровень сложности: Создайте структуру DynamicArray
// Реализуйте два пути создания:
// DynamicArray() - по умолчанию size = 10
// DynamicArray(capacity) - size = capacity

// Реализуйте методы:
// add(data) - добавляет в конец
// remove() - удаляет последний
// removeAt(index) - удаляет по индексу
// growSize() - увеличивает размер
// set(index, data) - изменяет элемент
// clean() - удаляет все элементы
// contains(data) - проверяет существует ли элемент
// isEmpty() - вернет false, если в структуре есть элемент

class DynamicArray {
    constructor(capacity = 10) {
        this.array = new Array(capacity);
        this.size = 0;
        this.capacity = capacity;
        this.data = this.data
    }

    add(data) {
        if (this.size <= this.capacity) {
            this.array = this.array.push(this.data);
            this.size = this.size + 1;
        } else {
            this.capacity = this.capacity * 2;
            this.array = this.array.push(this.data);
            this.size = this.size + 1;
        }
    }

    isEmpty() {
        return this.size === 0;
    }

    remove() {
        if (!this.isEmpty()) {
            this.array[this.size - 1] = null;
        } else {
            console.log("Удаление невозможно, массив пустой");
        }
    }
    removeAt(index) {
        if (index < this.size) {
            this.array[index] = null;
            for (let i = index; i < this.size; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.size=this.size - 1;

        } else {
            console.log("Удаление невозможно")
        }
    }

    set(index, data) {
        this.array[index] = data;
    }

    // contains(data){
    //     не разобралась        
    // }

    clean() {
        for (let i = 0; i < this.size; i++) {
            this.array[i] = null;
        }
        this.size = 0;
    }
}