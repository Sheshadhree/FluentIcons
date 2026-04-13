package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageMultiple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageMultiple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 7.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(3f, -2f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.37f, 0.101f, 0.718f, 0.277f, 1.016f)
            lineToRelative(3.309f, -3.309f)
            curveToRelative(0.78f, -0.78f, 2.047f, -0.78f, 2.828f, 0f)
            lineToRelative(3.31f, 3.309f)
            curveTo(13.898f, 12.718f, 14f, 12.371f, 14f, 12f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(3.707f, 6.414f)
            curveToRelative(-0.39f, -0.39f, -1.024f, -0.39f, -1.414f, 0f)
            lineToRelative(-3.309f, 3.31f)
            curveTo(5.282f, 13.898f, 5.629f, 14f, 6f, 14f)
            horizontalLineToRelative(6f)
            curveToRelative(0.37f, 0f, 0.718f, -0.101f, 1.016f, -0.277f)
            lineToRelative(-3.309f, -3.309f)
            close()
            moveTo(8f, 17f)
            curveToRelative(-0.888f, 0f, -1.687f, -0.386f, -2.236f, -1f)
            horizontalLineTo(12.5f)
            curveToRelative(1.812f, 0f, 3.303f, -1.377f, 3.482f, -3.142f)
            curveTo(15.994f, 12.74f, 16f, 12.62f, 16f, 12.5f)
            verticalLineTo(5.764f)
            curveToRelative(0.614f, 0.55f, 1f, 1.348f, 1f, 2.236f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
