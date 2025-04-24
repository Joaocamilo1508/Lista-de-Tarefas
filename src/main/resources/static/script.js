const API_URL = '/tarefas';

const form = document.getElementById('tarefa-form');
const lista = document.getElementById('lista-tarefas');

form.addEventListener('submit', async (e) => {
  e.preventDefault();

  const novaTarefa = {
    titulo: form.titulo.value,
    descricao: form.descricao.value,
    dataVencimento: form.dataVencimento.value || null,
    prioridade: form.prioridade.value,
    status: form.status.value
  };

  await fetch(API_URL, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(novaTarefa)
  });

  form.reset();
  carregarTarefas();
});

async function carregarTarefas() {
  const resposta = await fetch(API_URL);
  const tarefas = await resposta.json();

  lista.innerHTML = '';
  tarefas.forEach(t => {
    const li = document.createElement('li');
    li.innerHTML = `
      <strong>${t.titulo}</strong> - ${t.status} - ${t.prioridade}
      <br />
      <small>${t.descricao || ''} - ${t.dataVencimento || ''}</small>
    `;
    lista.appendChild(li);
  });
}

carregarTarefas();
