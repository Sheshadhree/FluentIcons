package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSyncCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSyncCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 18f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            close()
            moveToRelative(3.5f, -8f)
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
            curveToRelative(1.024f, 0f, 1.906f, 0.617f, 2.292f, 1.5f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 9f, 11f, 9.224f, 11f, 9.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(2f)
            close()
            moveTo(6f, 10.5f)
            verticalLineToRelative(2f)
            curveTo(6f, 12.776f, 6.224f, 13f, 6.5f, 13f)
            reflectiveCurveTo(7f, 12.776f, 7f, 12.5f)
            verticalLineToRelative(-0.696f)
            curveTo(7.612f, 12.82f, 8.726f, 13.5f, 10f, 13.5f)
            curveToRelative(1.037f, 0f, 1.969f, -0.451f, 2.609f, -1.166f)
            curveToRelative(0.184f, -0.206f, 0.166f, -0.522f, -0.04f, -0.707f)
            curveToRelative(-0.205f, -0.184f, -0.521f, -0.166f, -0.705f, 0.04f)
            curveTo(11.405f, 12.178f, 10.74f, 12.5f, 10f, 12.5f)
            curveToRelative(-1.024f, 0f, -1.906f, -0.617f, -2.292f, -1.5f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 11f, 9f, 10.776f, 9f, 10.5f)
            reflectiveCurveTo(8.776f, 10f, 8.5f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(6.224f, 10f, 6f, 10.224f, 6f, 10.5f)
            close()
        }
    }.build()
}
