package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextBold24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBold24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.935f, 4.44f)
            curveTo(7.217f, 4.158f, 7.598f, 4f, 7.996f, 4f)
            horizontalLineToRelative(4.383f)
            curveTo(15.017f, 4f, 17f, 6.182f, 17f, 8.625f)
            curveToRelative(0f, 0.977f, -0.316f, 1.912f, -0.865f, 2.682f)
            curveTo(17.211f, 12.134f, 18f, 13.427f, 18f, 15.12f)
            curveToRelative(0f, 3.112f, -2.7f, 4.88f, -4.88f, 4.88f)
            horizontalLineTo(8f)
            curveToRelative(-0.829f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            lineToRelative(-0.004f, -13f)
            curveToRelative(0f, -0.397f, 0.158f, -0.779f, 0.44f, -1.06f)
            close()
            moveTo(9.5f, 10.25f)
            horizontalLineToRelative(2.88f)
            curveToRelative(0.903f, 0f, 1.62f, -0.76f, 1.62f, -1.625f)
            reflectiveCurveTo(13.281f, 7f, 12.38f, 7f)
            horizontalLineTo(9.498f)
            lineTo(9.5f, 10.25f)
            close()
            moveToRelative(0f, 3f)
            verticalLineTo(17f)
            horizontalLineToRelative(3.62f)
            curveToRelative(0.874f, 0f, 1.88f, -0.754f, 1.88f, -1.88f)
            curveToRelative(0f, -1.13f, -0.974f, -1.87f, -1.88f, -1.87f)
            horizontalLineTo(9.5f)
            close()
        }
    }.build()
}
