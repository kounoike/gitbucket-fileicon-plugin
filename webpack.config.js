const path = require('path')
const webpack = require('webpack')

module.exports = {
    context: path.join(__dirname, 'src/main/web'),
    mode: 'development',
    devtool: 'source-map',
    output: {
        path: path.join(__dirname, 'src/main/resources/bundle/'),
        filename: '[name].js'
    },
    module: {
        rules: [
            {
                test: /\.css$/,
                loaders: ['style-loader', 'css-loader']
            },
            {
                test: /\.(woff|woff2|eot|ttf|svg)$/,
                loaders: [{
                    loader: 'url-loader'
                }]
            }
        ],
    },
    externals: [
        {
            jQuery: 'jQuery'
        }
    ],
    plugins: [
        new webpack.ProvidePlugin({
            $: 'jQuery'
        })
    ],
    entry: {
        entry: './js/entry.js'
    }
}