// o nome do const é o dev que dá
// Cada const desse é para pegar o valor do HTML
const transactionsUl = document.querySelector('#transactions'); // A hashtag significa id
const inputTransactionName = document.querySelector('#text');
const inputTransactionAmount = document.querySelector('#amount');
const balanceDisplay = document.querySelector('#balance');
const incomeDisplay = document.querySelector('#money-plus');
const expenseDisplay = document.querySelector('#money-minus');

let dummyTransactions = [ // usando os colchetes porque é um array
    { id: 1, name: 'Bolo de brigadeiro', amount: -20},
    { id: 2, name: 'Salário', amount: 300},
    { id: 3, name: 'Torta de frango', amount: -10},
    { id: 4, name: 'Violão', amount: 150}
]

// Gerador de ID número aleatório
const geradorID = () => Math.round(Math.random() * 1000);

const addTransactionInArray = (transactionName, transactionAmount) => {
    dummyTransactions.push({
        id: geradorID(), // aqui ainda está fixo pois não temos um gerador de ID
        name: transactionName,
        amount: Number(transactionAmount)
    })
}

const handleFormSubmit = event => {
    event.preventDefault();
    if(inputTransactionName.value.trim() === '' || 
                inputTransactionAmount.value.trim() === '') {
        alert('Digite a descrição e o valor da transação.');
        return;
    }
    addTransactionInArray(inputTransactionName.value, inputTransactionAmount.value);
    init();
}

const removeTransaction = ID => {
    dummyTransactions = dummyTransactions.filter(transaction => transaction.id !== ID);
    console.log(dummyTransactions);
    init(); // o init aqui é para atualizar o form sem os deletados
}

form.addEventListener('submit', handleFormSubmit); // o form é do html

const addTransactionIntoDOM = transaction => {
    const li = document.createElement('li');
    li.innerHTML = `${transaction.name}
                    <span> R$ ${transaction.amount} </span> 
                    <button onClick="removeTransaction(${transaction.id})" >X</button>`
    // atribuindo um nó para o li`
    transactionsUl.append(li);
}

// Método que irá separar os valores do total, receitas e despesas
const updateBalanceValues = () => {
    // pega todos os valores amount de cada linha do array
    const transactionAmounts = dummyTransactions.map(({ amount }) => amount)
    console.log('Somente os valores: ' + transactionAmounts);

    // totalizador
    const total = transactionAmounts.reduce((accumulator, transaction) => 
                                    accumulator + transaction, 0);
    console.log('Soma dos valores: ' + total);

    // somente as receitas
    const income = transactionAmounts
                        .filter(value => value > 0)
                        .reduce((accumulator, transaction) => accumulator + transaction, 0);
    console.log('Somente os valores positivos: ' + income);

    // somente as despesas
    const expenses = transactionAmounts
                        .filter(value => value < 0)
                        .reduce((accumulator, transaction) => accumulator + transaction, 0);
    console.log('Somente os valores negativos: ' + expenses);

    // jogar os valores pegos no HTML
    balanceDisplay.textContent = `R$ ${total}`
    incomeDisplay.textContent = `R$ ${income}`
    expenseDisplay.textContent = `R$ ${expenses}`
}

const init = () => {
    transactionsUl.innerHTML = '';
    dummyTransactions.forEach(addTransactionIntoDOM);
    updateBalanceValues();
}

init();
