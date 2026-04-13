package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MicProhibited16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MicProhibited16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            reflectiveCurveTo(9f, 3.12f, 9f, 4.5f)
            verticalLineToRelative(0.707f)
            curveToRelative(-2.159f, 0.61f, -3.778f, 2.506f, -3.979f, 4.809f)
            curveTo(4.401f, 9.56f, 4f, 8.827f, 4f, 8f)
            verticalLineTo(4.5f)
            close()
            moveToRelative(1.042f, 6.683f)
            curveTo(3.837f, 10.63f, 3f, 9.413f, 3f, 8f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(2f, 7.724f, 2f, 8f)
            curveToRelative(0f, 2.076f, 1.405f, 3.823f, 3.316f, 4.343f)
            curveToRelative(-0.131f, -0.37f, -0.224f, -0.759f, -0.274f, -1.16f)
            close()
            moveTo(6f, 10.5f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(12.985f, 6f, 10.5f, 6f)
            reflectiveCurveTo(6f, 8.015f, 6f, 10.5f)
            close()
            moveToRelative(2.404f, 2.803f)
            lineToRelative(4.9f, -4.9f)
            curveTo(13.74f, 8.989f, 14f, 9.714f, 14f, 10.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            curveToRelative(-0.786f, 0f, -1.512f, -0.26f, -2.096f, -0.697f)
            close()
            moveToRelative(-0.707f, -0.707f)
            curveTo(7.259f, 12.012f, 7f, 11.286f, 7f, 10.5f)
            curveTo(7f, 8.567f, 8.567f, 7f, 10.5f, 7f)
            curveToRelative(0.786f, 0f, 1.512f, 0.26f, 2.096f, 0.697f)
            lineToRelative(-4.9f, 4.9f)
            close()
        }
    }.build()
}
