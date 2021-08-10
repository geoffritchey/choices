import React, { useEffect, useState } from 'react';
import ReactDOM from "react-dom";
import List from './components/List';
import withListLoading from './components/withListLoading';


function App() {
  const ListLoading = withListLoading(List);
  const [appState, setAppState] = useState({
    loading: false,
    repos: null,
    selectedId: 1,
  });
 
  useEffect(() => {
    setAppState({ loading: true });
    const apiUrl = `http://localhost:8080/choices/leaders`;
    fetch(apiUrl)
      .then((res) => res.json())
      .then((repos) => {
        setAppState({ loading: false, repos: repos });
      });
  }, [setAppState]);
  return (
    <div className='App'>
      <div className='container'>
        <h1>Chapel Choices</h1>
      </div>
      <div className='repo-container'>
        <ListLoading post={(event)=>handleSubmit(event)} selected={appState.selectedId} isLoading={appState.loading} repos={appState.repos} />
      </div>
      <footer>
        <div className='footer'>
        </div>
      </footer>
    </div>
  );
}

  function handleSubmit(event) {
    alert('A name was submitted: ' + this.state.value);
    event.preventDefault();
  }


export default App;


ReactDOM.render(<App />, document.getElementById("react"));
