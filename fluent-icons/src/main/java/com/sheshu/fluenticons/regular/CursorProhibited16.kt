package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CursorProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CursorProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 4.5f)
            curveTo(7f, 6.985f, 9.015f, 9f, 11.5f, 9f)
            reflectiveCurveTo(16f, 6.985f, 16f, 4.5f)
            reflectiveCurveTo(13.985f, 0f, 11.5f, 0f)
            reflectiveCurveTo(7f, 2.015f, 7f, 4.5f)
            close()
            moveToRelative(1f, 0f)
            curveTo(8f, 2.567f, 9.567f, 1f, 11.5f, 1f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            curveTo(8.26f, 6.011f, 8f, 5.286f, 8f, 4.5f)
            close()
            moveTo(11.5f, 8f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.26f, -2.096f, -0.697f)
            lineToRelative(4.9f, -4.9f)
            curveTo(14.74f, 2.989f, 15f, 3.714f, 15f, 4.5f)
            curveTo(15f, 6.433f, 13.433f, 8f, 11.5f, 8f)
            close()
            moveToRelative(0f, 2f)
            curveToRelative(0.068f, 0f, 0.136f, 0f, 0.203f, -0.003f)
            horizontalLineToRelative(0.268f)
            lineToRelative(-0.02f, -0.015f)
            curveToRelative(0.345f, -0.028f, 0.681f, -0.088f, 1.005f, -0.176f)
            curveToRelative(0.106f, 0.567f, -0.299f, 1.19f, -0.985f, 1.19f)
            horizontalLineTo(8.038f)
            curveToRelative(-0.31f, 0f, -0.603f, 0.145f, -0.792f, 0.39f)
            lineToRelative(-2.454f, 3.187f)
            curveTo(4.21f, 15.329f, 3f, 14.917f, 3f, 13.963f)
            verticalLineTo(3.987f)
            curveTo(3f, 3.162f, 3.943f, 2.69f, 4.602f, 3.188f)
            lineToRelative(1.404f, 1.059f)
            curveTo(6.002f, 4.33f, 6f, 4.415f, 6f, 4.5f)
            curveToRelative(0f, 0.368f, 0.036f, 0.726f, 0.105f, 1.074f)
            lineTo(4f, 3.987f)
            verticalLineToRelative(9.976f)
            lineToRelative(2.454f, -3.187f)
            curveToRelative(0.378f, -0.491f, 0.964f, -0.78f, 1.584f, -0.78f)
            horizontalLineToRelative(3.26f)
            curveTo(11.363f, 10f, 11.431f, 10f, 11.5f, 10f)
            close()
        }
    }.build()
}
