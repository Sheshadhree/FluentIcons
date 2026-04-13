package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.GasPump20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.GasPump20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 17f)
            verticalLineTo(4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            horizontalLineToRelative(5f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(9.167f)
            curveToRelative(0f, -0.325f, -0.105f, -0.64f, -0.3f, -0.9f)
            lineTo(15.6f, 6.8f)
            curveToRelative(-0.166f, -0.22f, -0.12f, -0.534f, 0.1f, -0.7f)
            curveToRelative(0.22f, -0.166f, 0.534f, -0.12f, 0.7f, 0.1f)
            lineToRelative(1.1f, 1.467f)
            curveToRelative(0.325f, 0.432f, 0.5f, 0.959f, 0.5f, 1.5f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-0.563f, 0f, -1.082f, -0.186f, -1.5f, -0.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 18f, 14.5f, 18f)
            horizontalLineToRelative(-11f)
            curveTo(3.224f, 18f, 3f, 17.776f, 3f, 17.5f)
            reflectiveCurveTo(3.224f, 17f, 3.5f, 17f)
            horizontalLineTo(4f)
            close()
            moveTo(6.5f, 4f)
            curveTo(6.224f, 4f, 6f, 4.224f, 6f, 4.5f)
            verticalLineToRelative(3f)
            curveTo(6f, 7.776f, 6.224f, 8f, 6.5f, 8f)
            horizontalLineToRelative(5f)
            curveTo(11.776f, 8f, 12f, 7.776f, 12f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(12f, 4.224f, 11.776f, 4f, 11.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
