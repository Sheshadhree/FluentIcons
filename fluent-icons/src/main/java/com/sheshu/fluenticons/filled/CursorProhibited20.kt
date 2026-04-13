package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorProhibited20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorProhibited20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 5.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveTo(19f, 7.985f, 19f, 5.5f)
            reflectiveCurveTo(16.985f, 1f, 14.5f, 1f)
            reflectiveCurveTo(10f, 3.015f, 10f, 5.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(11f, 3.567f, 12.567f, 2f, 14.5f, 2f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            curveTo(11.26f, 7.011f, 11f, 6.286f, 11f, 5.5f)
            close()
            moveTo(14.5f, 9f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.26f, -2.096f, -0.697f)
            lineToRelative(4.9f, -4.9f)
            curveTo(17.74f, 3.989f, 18f, 4.714f, 18f, 5.5f)
            curveTo(18f, 7.433f, 16.433f, 9f, 14.5f, 9f)
            close()
            moveToRelative(0f, 2f)
            curveTo(11.462f, 11f, 9f, 8.538f, 9f, 5.5f)
            curveToRelative(0f, -0.4f, 0.043f, -0.789f, 0.123f, -1.164f)
            lineTo(6.636f, 2.287f)
            curveTo(5.983f, 1.75f, 5f, 2.215f, 5f, 3.06f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 0.925f, 1.15f, 1.354f, 1.756f, 0.654f)
            lineToRelative(3.524f, -4.073f)
            curveToRelative(0.285f, -0.33f, 0.699f, -0.518f, 1.134f, -0.518f)
            horizontalLineToRelative(5.592f)
            curveToRelative(0.938f, 0f, 1.36f, -1.176f, 0.636f, -1.772f)
            lineToRelative(-0.967f, -0.797f)
            curveTo(16.008f, 10.841f, 15.272f, 11f, 14.5f, 11f)
            close()
        }
    }.build()
}
