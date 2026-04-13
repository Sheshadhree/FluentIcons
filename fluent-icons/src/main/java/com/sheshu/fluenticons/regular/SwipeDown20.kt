package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SwipeDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SwipeDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6f)
            curveToRelative(0f, 1.679f, -1.034f, 3.116f, -2.5f, 3.71f)
            verticalLineTo(8.598f)
            curveTo(12.397f, 8.079f, 13f, 7.11f, 13f, 6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(7f, 4.343f, 7f, 6f)
            curveToRelative(0f, 1.11f, 0.603f, 2.08f, 1.5f, 2.599f)
            verticalLineToRelative(1.11f)
            curveTo(7.034f, 9.116f, 6f, 7.68f, 6f, 6f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveTo(9.646f, 17.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            lineTo(10.5f, 16.293f)
            verticalLineTo(5.5f)
            curveTo(10.5f, 5.224f, 10.276f, 5f, 10f, 5f)
            reflectiveCurveTo(9.5f, 5.224f, 9.5f, 5.5f)
            verticalLineToRelative(10.793f)
            lineToRelative(-2.146f, -2.146f)
            curveToRelative(-0.196f, -0.196f, -0.512f, -0.196f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(3f, 3f)
            close()
        }
    }.build()
}
