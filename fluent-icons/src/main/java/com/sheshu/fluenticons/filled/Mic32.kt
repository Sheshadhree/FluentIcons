package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Mic32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mic32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveToRelative(-3.314f, 0f, -6f, 2.686f, -6f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            verticalLineTo(8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
            moveTo(7f, 15f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 4.418f, 3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 5.186f, -3.947f, 9.45f, -9.001f, 9.95f)
            lineTo(17f, 26f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            lineToRelative(0.001f, -0.05f)
            curveTo(9.947f, 25.45f, 6f, 21.187f, 6f, 16f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
