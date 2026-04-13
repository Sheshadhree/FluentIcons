package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Cloud28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Cloud28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 6.5f)
            curveToRelative(-2.964f, 0f, -5.38f, 2.344f, -5.496f, 5.28f)
            curveToRelative(-0.015f, 0.402f, -0.346f, 0.72f, -0.75f, 0.72f)
            horizontalLineTo(7.5f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(13f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-0.255f)
            curveToRelative(-0.403f, 0f, -0.733f, -0.318f, -0.75f, -0.72f)
            curveTo(19.38f, 8.844f, 16.965f, 6.5f, 14f, 6.5f)
            close()
            moveToRelative(-6.931f, 4.517f)
            curveTo(7.547f, 7.616f, 10.468f, 5f, 14f, 5f)
            reflectiveCurveToRelative(6.453f, 2.616f, 6.931f, 6.017f)
            curveTo(23.767f, 11.237f, 26f, 13.607f, 26f, 16.5f)
            curveToRelative(0f, 3.038f, -2.462f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-13f)
            curveTo(4.462f, 22f, 2f, 19.538f, 2f, 16.5f)
            curveToRelative(0f, -2.892f, 2.233f, -5.263f, 5.069f, -5.483f)
            close()
        }
    }.build()
}
