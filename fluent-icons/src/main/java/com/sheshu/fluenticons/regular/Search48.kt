package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Search48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Search48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(31.398f, 33.161f)
            curveTo(28.6f, 35.555f, 24.968f, 37f, 21f, 37f)
            curveToRelative(-8.837f, 0f, -16f, -7.163f, -16f, -16f)
            reflectiveCurveTo(12.163f, 5f, 21f, 5f)
            reflectiveCurveToRelative(16f, 7.163f, 16f, 16f)
            curveToRelative(0f, 3.967f, -1.444f, 7.598f, -3.835f, 10.393f)
            lineToRelative(9.473f, 9.473f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            curveToRelative(-0.489f, 0.488f, -1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-9.472f, -9.473f)
            close()
            moveTo(34.5f, 21f)
            curveToRelative(0f, -7.456f, -6.044f, -13.5f, -13.5f, -13.5f)
            reflectiveCurveTo(7.5f, 13.544f, 7.5f, 21f)
            reflectiveCurveTo(13.544f, 34.5f, 21f, 34.5f)
            reflectiveCurveTo(34.5f, 28.456f, 34.5f, 21f)
            close()
        }
    }.build()
}
