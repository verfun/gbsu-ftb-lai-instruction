package com.kata.gbsuftblai.services

import com.kata.gbsuftblai.Utils.ConvertToString
import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        return ConvertToString.convertNumber(inputNumber);
    }

}