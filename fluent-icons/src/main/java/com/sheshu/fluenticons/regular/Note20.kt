package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Note20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Note20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3f)
            curveToRelative(1.598f, 0f, 2.904f, 1.249f, 2.995f, 2.824f)
            lineTo(17f, 6f)
            verticalLineToRelative(4.379f)
            curveToRelative(0f, 0.471f, -0.166f, 0.926f, -0.467f, 1.284f)
            lineToRelative(-0.119f, 0.13f)
            lineToRelative(-4.621f, 4.621f)
            curveToRelative(-0.333f, 0.334f, -0.772f, 0.537f, -1.238f, 0.578f)
            lineTo(10.379f, 17f)
            horizontalLineTo(6f)
            curveToRelative(-1.598f, 0f, -2.904f, -1.249f, -2.995f, -2.824f)
            lineTo(3f, 14f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.598f, 1.249f, -2.904f, 2.824f, -2.995f)
            lineTo(6f, 3f)
            horizontalLineToRelative(8f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineTo(6f)
            curveTo(4.946f, 4f, 4.082f, 4.816f, 4.005f, 5.85f)
            lineTo(4f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.054f, 0.816f, 1.918f, 1.85f, 1.995f)
            lineTo(6f, 16f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.598f, 1.249f, -2.904f, 2.824f, -2.995f)
            lineTo(13f, 10f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.054f, -0.816f, -1.918f, -1.85f, -1.995f)
            lineTo(14f, 4f)
            close()
            moveToRelative(1.783f, 7.001f)
            lineTo(13f, 11f)
            curveToRelative(-1.054f, 0f, -1.918f, 0.816f, -1.995f, 1.85f)
            lineTo(11f, 13f)
            verticalLineToRelative(2.781f)
            lineToRelative(0.086f, -0.074f)
            lineToRelative(4.621f, -4.621f)
            curveToRelative(0.027f, -0.027f, 0.052f, -0.055f, 0.075f, -0.085f)
            close()
        }
    }.build()
}
