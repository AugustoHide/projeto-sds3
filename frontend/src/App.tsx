import DataTable from "C:/workspace/porjeto-sds3/frontend/src/components/DataTable";
import Footer from "C:/workspace/porjeto-sds3/frontend/src/components/Footer";
import NavBar from "C:/workspace/porjeto-sds3/frontend/src/components/NavBar";
///**  A ideia de fazer NavBar separado é pra ajudar a reutilizar os componentes em outras páginas / lugares do projeto **/
function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
