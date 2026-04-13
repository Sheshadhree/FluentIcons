package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SyncOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SyncOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            horizontalLineToRelative(3.877f)
            lineTo(5.03f, 10.33f)
            curveToRelative(-0.094f, 0.259f, 0.04f, 0.546f, 0.3f, 0.64f)
            curveToRelative(0.259f, 0.094f, 0.546f, -0.04f, 0.64f, -0.3f)
            lineToRelative(2f, -5.5f)
            curveToRelative(0.094f, -0.259f, -0.04f, -0.545f, -0.299f, -0.64f)
            curveToRelative(-0.26f, -0.094f, -0.546f, 0.04f, -0.64f, 0.3f)
            lineTo(6.24f, 7f)
            horizontalLineTo(2.083f)
            curveTo(2.559f, 4.162f, 5.027f, 2f, 8f, 2f)
            reflectiveCurveToRelative(5.441f, 2.162f, 5.917f, 5f)
            horizontalLineToRelative(-3.612f)
            lineToRelative(0.665f, -1.83f)
            curveToRelative(0.094f, -0.259f, -0.04f, -0.545f, -0.299f, -0.64f)
            curveToRelative(-0.26f, -0.094f, -0.546f, 0.04f, -0.64f, 0.3f)
            lineToRelative(-2f, 5.5f)
            curveToRelative(-0.095f, 0.259f, 0.039f, 0.546f, 0.298f, 0.64f)
            curveToRelative(0.26f, 0.094f, 0.547f, -0.04f, 0.641f, -0.3f)
            lineTo(9.941f, 8f)
            horizontalLineTo(14f)
            close()
        }
    }.build()
}
