package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4.5f)
            curveTo(7f, 6.985f, 9.015f, 9f, 11.5f, 9f)
            curveTo(13.986f, 9f, 16f, 6.985f, 16f, 4.5f)
            reflectiveCurveTo(13.986f, 0f, 11.5f, 0f)
            curveTo(9.015f, 0f, 7f, 2.015f, 7f, 4.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(8f, 2.567f, 9.567f, 1f, 11.5f, 1f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.899f, 4.9f)
            curveTo(8.26f, 6.011f, 8f, 5.286f, 8f, 4.5f)
            close()
            moveTo(11.5f, 8f)
            curveToRelative(-0.786f, 0f, -1.51f, -0.26f, -2.096f, -0.697f)
            lineToRelative(4.9f, -4.9f)
            curveTo(14.74f, 2.989f, 15f, 3.714f, 15f, 4.5f)
            curveTo(15f, 6.433f, 13.433f, 8f, 11.5f, 8f)
            close()
            moveToRelative(0f, 2f)
            curveToRelative(0.514f, 0f, 1.011f, -0.07f, 1.483f, -0.202f)
            curveTo(13.095f, 10.368f, 12.69f, 11f, 11.999f, 11f)
            horizontalLineTo(8.054f)
            curveToRelative(-0.31f, 0f, -0.604f, 0.144f, -0.793f, 0.39f)
            lineToRelative(-2.466f, 3.215f)
            curveToRelative(-0.581f, 0.758f, -1.793f, 0.347f, -1.793f, -0.609f)
            verticalLineTo(3.998f)
            curveToRelative(0f, -0.824f, 0.94f, -1.294f, 1.6f, -0.8f)
            lineToRelative(1.404f, 1.054f)
            curveTo(6.002f, 4.334f, 6f, 4.417f, 6f, 4.5f)
            curveTo(6f, 7.538f, 8.463f, 10f, 11.5f, 10f)
            close()
        }
    }.build()
}
