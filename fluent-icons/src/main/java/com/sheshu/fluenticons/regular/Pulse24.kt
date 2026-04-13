package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Pulse24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Pulse24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.462f, 6.81f)
            lineToRelative(3.284f, 13.616f)
            curveToRelative(0.178f, 0.737f, 1.211f, 0.775f, 1.443f, 0.054f)
            lineToRelative(3.257f, -10.123f)
            lineToRelative(0.586f, 2.096f)
            curveToRelative(0.09f, 0.324f, 0.386f, 0.548f, 0.722f, 0.548f)
            horizontalLineToRelative(3.494f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-2.925f)
            lineToRelative(-1.105f, -3.95f)
            curveToRelative(-0.2f, -0.717f, -1.208f, -0.736f, -1.436f, -0.028f)
            lineToRelative(-3.204f, 9.957f)
            lineTo(9.226f, 3.574f)
            curveTo(9.043f, 2.817f, 7.97f, 2.805f, 7.771f, 3.558f)
            lineTo(5.67f, 11.501f)
            horizontalLineTo(2.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(3.496f)
            curveToRelative(0.34f, 0f, 0.638f, -0.229f, 0.725f, -0.558f)
            lineTo(8.462f, 6.81f)
            close()
        }
    }.build()
}
