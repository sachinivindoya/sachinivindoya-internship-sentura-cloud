// App.tsx

import React from 'react';
import Button from './components/Button';
import Api from "./Api";

const App: React.FC = () => {
  const handleClick = () => {
    alert('Button clicked!');
  };

  return (
    <div>
      <h1>My React App</h1>
      <Api/>
      <Button onClick={handleClick} text="Click me" />
    </div>
  );
}

export default App;
