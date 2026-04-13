package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SwipeRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SwipeRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 6f)
            curveToRelative(1.679f, 0f, 3.116f, 1.034f, 3.71f, 2.5f)
            horizontalLineTo(8.598f)
            curveTo(8.079f, 7.603f, 7.11f, 7f, 6f, 7f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            curveToRelative(1.11f, 0f, 2.08f, -0.603f, 2.599f, -1.5f)
            horizontalLineToRelative(1.11f)
            curveTo(9.116f, 12.966f, 7.68f, 14f, 6f, 14f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(8.854f, 7.354f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.195f, -0.196f, -0.512f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.196f, 0.195f, -0.196f, 0.511f, 0f, 0.707f)
            lineTo(16.293f, 9.5f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 9.5f, 5f, 9.724f, 5f, 10f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(10.793f)
            lineToRelative(-2.146f, 2.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            close()
        }
    }.build()
}
