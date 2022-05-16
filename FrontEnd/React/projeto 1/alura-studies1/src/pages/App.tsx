import React from 'react';
import Formulario from '../components/formulario';
import Lista from '../components/lista';
import style from  './style.module.scss'

function App() {
  return (
    <div className={style.AppStyle}>
      <Formulario />
      <Lista />
    </div>
  );
}

export default App;
