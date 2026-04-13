package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CursorProhibited20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CursorProhibited20",
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
            moveToRelative(2.506f, 3.122f)
            lineToRelative(-1.479f, -1.218f)
            curveToRelative(0.4f, -0.075f, 0.784f, -0.194f, 1.148f, -0.35f)
            lineToRelative(0.967f, 0.796f)
            curveToRelative(0.724f, 0.596f, 0.302f, 1.772f, -0.636f, 1.772f)
            horizontalLineToRelative(-5.592f)
            curveToRelative(-0.435f, 0f, -0.85f, 0.189f, -1.134f, 0.518f)
            lineToRelative(-3.524f, 4.073f)
            curveTo(6.15f, 18.413f, 5f, 17.984f, 5f, 17.058f)
            verticalLineTo(3.06f)
            curveToRelative(0f, -0.846f, 0.983f, -1.31f, 1.636f, -0.772f)
            lineToRelative(2.487f, 2.048f)
            curveTo(9.043f, 4.71f, 9f, 5.1f, 9f, 5.5f)
            verticalLineToRelative(0.03f)
            lineTo(6f, 3.06f)
            verticalLineToRelative(13.998f)
            lineToRelative(3.524f, -4.072f)
            curveToRelative(0.475f, -0.549f, 1.165f, -0.864f, 1.89f, -0.864f)
            horizontalLineToRelative(5.592f)
            close()
        }
    }.build()
}
