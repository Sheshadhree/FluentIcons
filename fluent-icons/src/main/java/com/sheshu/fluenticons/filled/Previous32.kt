package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Previous32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Previous32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(4f, 4.448f, 4f, 5f)
            verticalLineToRelative(22f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            close()
            moveToRelative(22.003f, 1.504f)
            curveToRelative(0f, -2.002f, -2.236f, -3.192f, -3.897f, -2.073f)
            lineToRelative(-14.003f, 9.432f)
            curveTo(8.637f, 14.85f, 8.63f, 17.005f, 10.09f, 18f)
            lineToRelative(14.003f, 9.56f)
            curveToRelative(1.66f, 1.132f, 3.91f, -0.056f, 3.91f, -2.066f)
            verticalLineTo(6.506f)
            close()
        }
    }.build()
}
