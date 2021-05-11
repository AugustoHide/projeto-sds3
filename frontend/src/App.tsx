import DonutsChart from "C:/workspace/porjeto-sds3/frontend/src/components/DonutsChart";
import BarChart from "C:/workspace/porjeto-sds3/frontend/src/components/BarChart";
import DataTable from "C:/workspace/porjeto-sds3/frontend/src/components/DataTable";
import Footer from "C:/workspace/porjeto-sds3/frontend/src/components/Footer";
import NavBar from "C:/workspace/porjeto-sds3/frontend/src/components/NavBar";

///**  A ideia de fazer NavBar separado é pra ajudar a reutilizar os componentes em outras páginas / lugares do projeto **/
function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-13">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as vendas</h5>
            <DonutsChart />
          </div>

        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
