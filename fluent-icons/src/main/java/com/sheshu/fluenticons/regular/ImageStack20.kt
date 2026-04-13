package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageStack20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageStack20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(7.707f, 13f)
            lineToRelative(-2.47f, -2.47f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.474f, 0f)
            lineTo(6.293f, 16f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-0.293f)
            close()
            moveToRelative(-6f, 0f)
            lineToRelative(1.763f, -1.763f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(12.293f, 16f)
            horizontalLineTo(7.707f)
            close()
            moveTo(16f, 9f)
            horizontalLineToRelative(-2.793f)
            lineToRelative(-1.97f, -1.97f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.474f, 0f)
            lineTo(6.793f, 9f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3f)
            close()
            moveTo(8.207f, 9f)
            lineTo(9.47f, 7.737f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(11.793f, 9f)
            horizontalLineTo(8.207f)
            close()
            moveTo(15f, 6f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-1f, 7.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
