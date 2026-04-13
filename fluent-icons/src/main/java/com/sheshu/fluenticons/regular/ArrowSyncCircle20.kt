package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSyncCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSyncCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(8f, 7f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
            moveToRelative(-8f, -2.5f)
            curveToRelative(1.024f, 0f, 1.906f, 0.617f, 2.292f, 1.5f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 9f, 11f, 9.224f, 11f, 9.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2f)
            curveTo(14f, 7.224f, 13.776f, 7f, 13.5f, 7f)
            reflectiveCurveTo(13f, 7.224f, 13f, 7.5f)
            verticalLineToRelative(0.696f)
            curveTo(12.388f, 7.18f, 11.274f, 6.5f, 10f, 6.5f)
            curveToRelative(-1.037f, 0f, -1.969f, 0.451f, -2.609f, 1.167f)
            curveToRelative(-0.184f, 0.205f, -0.166f, 0.521f, 0.04f, 0.706f)
            curveToRelative(0.205f, 0.184f, 0.521f, 0.166f, 0.705f, -0.04f)
            curveTo(8.595f, 7.822f, 9.26f, 7.5f, 10f, 7.5f)
            close()
            moveToRelative(-3f, 4.304f)
            verticalLineTo(12.5f)
            curveTo(7f, 12.776f, 6.776f, 13f, 6.5f, 13f)
            reflectiveCurveTo(6f, 12.776f, 6f, 12.5f)
            verticalLineToRelative(-2f)
            curveTo(6f, 10.224f, 6.224f, 10f, 6.5f, 10f)
            horizontalLineToRelative(2f)
            curveTo(8.776f, 10f, 9f, 10.224f, 9f, 10.5f)
            reflectiveCurveTo(8.776f, 11f, 8.5f, 11f)
            horizontalLineTo(7.708f)
            curveToRelative(0.386f, 0.883f, 1.268f, 1.5f, 2.292f, 1.5f)
            curveToRelative(0.74f, 0f, 1.405f, -0.321f, 1.864f, -0.834f)
            curveToRelative(0.184f, -0.205f, 0.5f, -0.223f, 0.706f, -0.039f)
            curveToRelative(0.205f, 0.185f, 0.223f, 0.5f, 0.039f, 0.707f)
            curveTo(11.969f, 13.049f, 11.037f, 13.5f, 10f, 13.5f)
            curveToRelative(-1.274f, 0f, -2.388f, -0.68f, -3f, -1.696f)
            close()
        }
    }.build()
}
