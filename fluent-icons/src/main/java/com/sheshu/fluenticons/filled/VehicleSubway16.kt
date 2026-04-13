package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VehicleSubway16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VehicleSubway16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.5f)
            curveTo(6f, 4.224f, 6.224f, 4f, 6.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(9.776f, 4f, 10f, 4.224f, 10f, 4.5f)
            reflectiveCurveTo(9.776f, 5f, 9.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(6.224f, 5f, 6f, 4.776f, 6f, 4.5f)
            close()
            moveToRelative(-4f, 0f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-0.617f)
            lineToRelative(1.865f, 1.066f)
            curveToRelative(0.24f, 0.137f, 0.323f, 0.442f, 0.186f, 0.682f)
            curveToRelative(-0.137f, 0.24f, -0.442f, 0.323f, -0.682f, 0.186f)
            lineTo(8.867f, 13f)
            horizontalLineTo(7.133f)
            lineToRelative(-3.385f, 1.934f)
            curveToRelative(-0.24f, 0.137f, -0.545f, 0.054f, -0.682f, -0.186f)
            reflectiveCurveToRelative(-0.054f, -0.545f, 0.186f, -0.682f)
            lineTo(5.117f, 13f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 13f, 2f, 11.88f, 2f, 10.5f)
            verticalLineToRelative(-6f)
            close()
            moveTo(3f, 8f)
            horizontalLineToRelative(10f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(8f)
            close()
            moveToRelative(4f, 2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
            moveToRelative(3f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
