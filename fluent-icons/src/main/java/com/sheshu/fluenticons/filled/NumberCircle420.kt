package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.NumberCircle420: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NumberCircle420",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(9.995f, -3.691f)
            curveToRelative(0f, -0.738f, -0.954f, -1.032f, -1.37f, -0.423f)
            lineToRelative(-3.533f, 5.176f)
            curveTo(6.82f, 11.46f, 7.106f, 12f, 7.588f, 12f)
            horizontalLineToRelative(3.41f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
            curveToRelative(0.277f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(12f)
            horizontalLineTo(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.276f, 11f, 13f, 11f)
            horizontalLineToRelative(-1.003f)
            lineToRelative(-0.002f, -4.691f)
            close()
            moveToRelative(-1f, 0.81f)
            lineTo(10.997f, 11f)
            horizontalLineTo(8.345f)
            lineToRelative(2.65f, -3.882f)
            close()
        }
    }.build()
}
