package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 13f)
            horizontalLineToRelative(4.207f)
            curveToRelative(0.099f, -0.349f, 0.23f, -0.683f, 0.393f, -1f)
            horizontalLineTo(5f)
            verticalLineTo(4f)
            horizontalLineToRelative(10.566f)
            lineToRelative(-2.482f, 3.723f)
            curveToRelative(-0.112f, 0.168f, -0.112f, 0.386f, 0f, 0.554f)
            lineToRelative(0.53f, 0.794f)
            curveTo(13.901f, 9.024f, 14.197f, 9f, 14.5f, 9f)
            curveToRelative(0.091f, 0f, 0.182f, 0.002f, 0.272f, 0.007f)
            lineTo(14.101f, 8f)
            lineToRelative(2.815f, -4.223f)
            curveTo(17.137f, 3.445f, 16.899f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-12f)
            curveTo(4.224f, 3f, 4f, 3.224f, 4f, 3.5f)
            verticalLineToRelative(14f)
            curveTo(4f, 17.776f, 4.224f, 18f, 4.5f, 18f)
            reflectiveCurveTo(5f, 17.776f, 5f, 17.5f)
            verticalLineTo(13f)
            close()
            moveToRelative(14f, 1.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(10f, 16.985f, 10f, 14.5f)
            reflectiveCurveToRelative(2.015f, -4.5f, 4.5f, -4.5f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            close()
            moveTo(14.5f, 12f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(16f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.276f, 14f, 16f, 14f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
