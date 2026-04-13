package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LightbulbCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LightbulbCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(2.481f, 15f)
            horizontalLineTo(9.519f)
            lineToRelative(0.103f, 0.454f)
            lineToRelative(0.043f, 0.152f)
            lineToRelative(0.057f, 0.143f)
            curveToRelative(0.288f, 0.646f, 0.902f, 1.05f, 1.587f, 1.05f)
            horizontalLineToRelative(1.382f)
            lineToRelative(0.156f, -0.009f)
            lineToRelative(0.15f, -0.023f)
            lineToRelative(0.147f, -0.035f)
            curveToRelative(0.622f, -0.174f, 1.09f, -0.656f, 1.233f, -1.276f)
            lineTo(14.481f, 17f)
            close()
            moveTo(12f, 5.202f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            lineToRelative(0.008f, 0.271f)
            lineToRelative(0.02f, 0.256f)
            lineToRelative(0.034f, 0.252f)
            curveToRelative(0.186f, 1.168f, 0.77f, 2.215f, 1.64f, 2.978f)
            lineToRelative(0.154f, 0.129f)
            lineToRelative(0.321f, 1.412f)
            horizontalLineToRelative(5.644f)
            lineToRelative(0.32f, -1.41f)
            lineToRelative(0.163f, -0.136f)
            curveToRelative(1.01f, -0.895f, 1.621f, -2.144f, 1.69f, -3.497f)
            lineTo(17f, 10.202f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
