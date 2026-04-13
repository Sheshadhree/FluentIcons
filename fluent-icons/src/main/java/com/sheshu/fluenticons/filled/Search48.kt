package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Search48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Search48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(31.203f, 33.325f)
            curveTo(28.434f, 35.62f, 24.878f, 37f, 21f, 37f)
            curveToRelative(-8.837f, 0f, -16f, -7.163f, -16f, -16f)
            reflectiveCurveTo(12.163f, 5f, 21f, 5f)
            reflectiveCurveToRelative(16f, 7.163f, 16f, 16f)
            curveToRelative(0f, 3.878f, -1.38f, 7.434f, -3.675f, 10.203f)
            lineToRelative(9.236f, 9.236f)
            curveToRelative(0.585f, 0.586f, 0.585f, 1.536f, 0f, 2.122f)
            curveToRelative(-0.586f, 0.585f, -1.536f, 0.585f, -2.122f, 0f)
            lineToRelative(-9.236f, -9.236f)
            close()
            moveTo(34f, 21f)
            curveToRelative(0f, -7.18f, -5.82f, -13f, -13f, -13f)
            reflectiveCurveTo(8f, 13.82f, 8f, 21f)
            reflectiveCurveToRelative(5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            close()
        }
    }.build()
}
