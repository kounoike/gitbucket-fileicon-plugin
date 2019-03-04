"use strict;"
require('../css/style.css')
const FileIcons = require('file-icons-js')

$(function(){
    $('.octicon-file[data-filename], .octicon-file-text[data-filename]').each(function(){
        $(this).addClass(FileIcons.getClassWithColor($(this).data("filename")))
    })
})