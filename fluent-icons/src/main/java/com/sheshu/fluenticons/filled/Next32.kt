package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Next32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Next32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26.002f, 5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(22f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(5f)
            close()
            moveTo(3.999f, 6.504f)
            curveToRelative(0f, -2.002f, 2.236f, -3.192f, 3.897f, -2.073f)
            lineToRelative(14.003f, 9.432f)
            curveToRelative(1.466f, 0.987f, 1.472f, 3.142f, 0.013f, 4.138f)
            lineTo(7.909f, 27.56f)
            curveToRelative(-1.66f, 1.132f, -3.91f, -0.056f, -3.91f, -2.066f)
            verticalLineTo(6.506f)
            close()
        }
    }.build()
}
