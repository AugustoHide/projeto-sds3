import axios from 'axios';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}

const DonutsChart = () => {

    let chartdata: ChartData = { labels: [], series: [] };

    axios.get(`${BASE_URL}/sales/amount-by-seller`)
        .then((response) => {
            const data = response.data as SaleSum[]; //converte backend pra formato no frontemd
            const myLabels = data.map(x => x.sellerName);
            const mySeries = data.map(x => x.sum); // p/ cada x no saleSum eu vou pegar x.sum

            chartdata = { labels: myLabels, series: mySeries };
            console.log(chartdata);
        });

    /*
    const mockData = {
        series: [477138, 499928, 444867, 220426, 473088],
        labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    }
    */

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: chartdata.labels }}
            series={chartdata.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutsChart;