"use strict;"
require('../css/style.css')
const FileIcons = require('file-icons-js')

$(function(){
    $('.file-icon > i[data-filename]').each(function(){
        $(this).addClass(FileIcons.getClassWithColor($(this).data("filename")))
    })
})