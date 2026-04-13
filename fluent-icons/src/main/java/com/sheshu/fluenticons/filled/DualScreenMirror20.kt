package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DualScreenMirror20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DualScreenMirror20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 16f)
            horizontalLineTo(16f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(12f)
            close()
            moveToRelative(-1f, -12f)
            horizontalLineTo(4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5.5f)
            verticalLineTo(4f)
            close()
            moveTo(5.75f, 8f)
            curveToRelative(0.178f, 0f, 0.342f, 0.095f, 0.432f, 0.248f)
            lineToRelative(1.75f, 3f)
            curveToRelative(0.09f, 0.155f, 0.09f, 0.346f, 0.002f, 0.501f)
            curveTo(7.844f, 11.904f, 7.679f, 12f, 7.5f, 12f)
            horizontalLineTo(4f)
            curveToRelative(-0.179f, 0f, -0.344f, -0.096f, -0.434f, -0.251f)
            curveToRelative(-0.089f, -0.155f, -0.088f, -0.346f, 0.002f, -0.5f)
            lineToRelative(1.75f, -3f)
            curveTo(5.408f, 8.093f, 5.572f, 8f, 5.75f, 8f)
            close()
            moveToRelative(8.932f, 0.248f)
            lineToRelative(1.75f, 3f)
            curveToRelative(0.09f, 0.155f, 0.09f, 0.346f, 0.002f, 0.501f)
            curveTo(16.344f, 11.904f, 16.179f, 12f, 16f, 12f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.179f, 0f, -0.344f, -0.096f, -0.434f, -0.251f)
            curveToRelative(-0.089f, -0.155f, -0.088f, -0.346f, 0.002f, -0.5f)
            lineToRelative(1.75f, -3f)
            curveTo(13.908f, 8.093f, 14.072f, 8f, 14.25f, 8f)
            reflectiveCurveToRelative(0.342f, 0.095f, 0.432f, 0.248f)
            close()
        }
    }.build()
}
