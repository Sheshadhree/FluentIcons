package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Temperature20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Temperature20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.748f, 7.25f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            curveToRelative(-0.415f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            lineToRelative(0.002f, 4.895f)
            curveTo(8.517f, 12.442f, 8f, 13.161f, 8f, 14f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            curveToRelative(0f, -0.84f, -0.517f, -1.558f, -1.25f, -1.855f)
            lineTo(10.748f, 7.25f)
            close()
            moveTo(6.5f, 5.5f)
            verticalLineTo(5.498f)
            curveTo(6.5f, 3.566f, 8.066f, 2f, 9.998f, 2f)
            curveToRelative(1.931f, 0f, 3.497f, 1.566f, 3.497f, 3.498f)
            verticalLineToRelative(5.668f)
            curveTo(14.124f, 11.94f, 14.5f, 12.926f, 14.5f, 14f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(5.5f, 16.485f, 5.5f, 14f)
            curveToRelative(0f, -1.074f, 0.377f, -2.06f, 1.004f, -2.834f)
            curveToRelative(0f, -1.737f, -0.008f, -3.98f, -0.008f, -5.666f)
            horizontalLineTo(6.5f)
            close()
            moveTo(8f, 5.498f)
            curveTo(7.995f, 7.578f, 8.004f, 9.66f, 8.004f, 11.74f)
            lineToRelative(-0.2f, 0.216f)
            curveTo(7.303f, 12.493f, 7f, 13.21f, 7f, 14f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -0.79f, -0.304f, -1.507f, -0.803f, -2.043f)
            lineToRelative(-0.201f, -0.216f)
            verticalLineTo(5.498f)
            curveToRelative(0f, -1.104f, -0.895f, -1.998f, -1.998f, -1.998f)
            curveTo(8.894f, 3.5f, 8f, 4.394f, 8f, 5.498f)
            close()
        }
    }.build()
}
