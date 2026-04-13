package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabProhibited20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabProhibited20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.6f)
            curveToRelative(-0.317f, -0.162f, -0.651f, -0.294f, -1f, -0.393f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4.207f)
            curveToRelative(0.099f, 0.349f, 0.23f, 0.683f, 0.393f, 1f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            close()
            moveToRelative(7f, 9.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.015f, -4.5f, -4.5f, -4.5f)
            reflectiveCurveToRelative(-4.5f, 2.015f, -4.5f, 4.5f)
            close()
            moveToRelative(1f, 0f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            curveTo(11.26f, 16.011f, 11f, 15.286f, 11f, 14.5f)
            close()
            moveToRelative(3.5f, 3.5f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.26f, -2.096f, -0.697f)
            lineToRelative(4.9f, -4.9f)
            curveTo(17.74f, 12.989f, 18f, 13.714f, 18f, 14.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            close()
        }
    }.build()
}
