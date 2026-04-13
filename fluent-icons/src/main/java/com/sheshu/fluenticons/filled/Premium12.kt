package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Premium12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Premium12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 1f)
            horizontalLineToRelative(1.046f)
            lineTo(2.997f, 4f)
            horizontalLineTo(1.191f)
            lineToRelative(1.362f, -2.724f)
            curveTo(2.638f, 1.107f, 2.811f, 1f, 3f, 1f)
            close()
            moveTo(1.228f, 5f)
            lineTo(4.24f, 9.687f)
            lineTo(2.97f, 5f)
            horizontalLineTo(1.226f)
            close()
            moveToRelative(2.778f, 0f)
            lineToRelative(1.53f, 5.645f)
            curveTo(5.594f, 10.855f, 5.785f, 11f, 6.002f, 11f)
            curveToRelative(0.216f, 0f, 0.407f, -0.145f, 0.463f, -0.355f)
            lineTo(7.998f, 5f)
            horizontalLineTo(4.006f)
            close()
            moveToRelative(5.028f, 0f)
            lineTo(7.76f, 9.685f)
            lineTo(10.773f, 5f)
            horizontalLineToRelative(-1.74f)
            close()
            moveToRelative(1.775f, -1f)
            horizontalLineTo(9.006f)
            lineToRelative(-1.05f, -3f)
            horizontalLineTo(9f)
            curveToRelative(0.19f, 0f, 0.363f, 0.107f, 0.448f, 0.276f)
            lineTo(10.809f, 4f)
            close()
            moveTo(7.947f, 4f)
            horizontalLineToRelative(-3.89f)
            lineToRelative(1.048f, -3f)
            horizontalLineToRelative(1.79f)
            lineToRelative(1.052f, 3f)
            close()
        }
    }.build()
}
