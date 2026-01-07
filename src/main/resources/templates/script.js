function createAccount() {
    const number = number.value;
    const holder = holder.value;
    const deposit = deposit.value;

    let url = `/account/create?number=${number}&holder=${holder}`;
    if (deposit) url += `&deposit=${deposit}`;

    fetch(url, { method: 'POST' })
        .then(() => loadAccount());
}

function deposit() {
    fetch(`/account/deposit?amount=${amount.value}`, { method: 'POST' })
        .then(() => loadAccount());
}

function withdraw() {
    fetch(`/account/withdraw?amount=${amount.value}`, { method: 'POST' })
        .then(() => loadAccount());
}

function changeHolder() {
    fetch(`/account/change-holder?name=${newHolder.value}`, { method: 'POST' })
        .then(() => loadAccount());
}

function loadAccount() {
    fetch('/account')
        .then(res => res.json())
        .then(data => {
            document.getElementById("result").textContent =
                `Conta: ${data.accountNumber}\nTitular: ${data.accountHolder}\nSaldo: $ ${data.balance.toFixed(2)}`;
        });
}
