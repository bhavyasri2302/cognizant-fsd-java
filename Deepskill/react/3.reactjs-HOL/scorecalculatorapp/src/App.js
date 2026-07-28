import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">

      <CalculateScore
        name="Bhagya Lakshmi"
        school="ABC Public School"
        total={480}
        goal={6}
      />

    </div>
  );
}

export default App;