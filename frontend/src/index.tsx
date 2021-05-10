import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';
import 'C:/workspace/porjeto-sds3/frontend/src/assets/css/styles.css';
import App from './App';

//vai renderizar aqui dentro do render
//pela chamada do index.html que tem uma div com id=root
ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

