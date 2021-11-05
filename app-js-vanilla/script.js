// o nome do const é o dev que dá
const transactionsUl = document.querySelector('#transactions'); // A hashtag significa id
const inputTransactionName = document.querySelector('#text');
const inputTransactionAmount = document.querySelector('#amount');

let dummyTransactions = [ // usando os colchetes porque é um array
    { id: 1, name: 'Bolo de brigadeiro', amount: -20},
    { id: 2, name: 'Salário', amount: 300},
    { id: 3, name: 'Torta de frango', amount: -10},
    { id: 4, name: 'Violão', amount: 150}
]

const addTransactionInArray = (transactionName, transactionAmount) => {
    dummyTransactions.push({
        id: 123, // aqui ainda está fixo pois não temos um gerador de ID
        name: transactionName,
        amount: transactionAmount
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

form.addEventListener('submit', handleFormSubmit); // o form é do html

const addTransactionIntoDOM = transaction => {
    const li = document.createElement('li');
    li.innerHTML = `${transaction.name}`
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
}

const init = () => {
    transactionsUl.innerHTML = '';
    dummyTransactions.forEach(addTransactionIntoDOM);
    updateBalanceValues();
}

init();
