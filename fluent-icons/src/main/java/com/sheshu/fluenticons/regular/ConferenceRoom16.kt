package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ConferenceRoom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ConferenceRoom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 7.998f)
            curveToRelative(0f, 0.277f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(9f, 8.275f, 9f, 7.998f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            close()
            moveTo(7.598f, 2.01f)
            curveToRelative(-0.147f, -0.03f, -0.3f, 0.008f, -0.415f, 0.103f)
            curveTo(7.067f, 2.208f, 7f, 2.35f, 7f, 2.5f)
            verticalLineToRelative(10.997f)
            curveToRelative(0f, 0.15f, 0.067f, 0.292f, 0.183f, 0.387f)
            curveToRelative(0.116f, 0.095f, 0.268f, 0.133f, 0.415f, 0.103f)
            lineToRelative(5f, -1f)
            curveTo(12.832f, 12.94f, 13f, 12.735f, 13f, 12.497f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.238f, -0.168f, -0.443f, -0.402f, -0.49f)
            lineToRelative(-5f, -1f)
            close()
            moveTo(8f, 12.887f)
            verticalLineTo(3.11f)
            lineToRelative(4f, 0.8f)
            verticalLineToRelative(8.177f)
            lineToRelative(-4f, 0.8f)
            close()
            moveToRelative(-2f, 0.11f)
            verticalLineToRelative(-1f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            horizontalLineToRelative(2f)
            verticalLineTo(3f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(8.997f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(6f)
            close()
        }
    }.build()
}
