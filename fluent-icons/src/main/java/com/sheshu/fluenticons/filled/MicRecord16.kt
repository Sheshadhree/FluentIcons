package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MicRecord16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MicRecord16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 6f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            reflectiveCurveTo(12.985f, 15f, 10.5f, 15f)
            reflectiveCurveTo(6f, 12.985f, 6f, 10.5f)
            reflectiveCurveTo(8.015f, 6f, 10.5f, 6f)
            close()
            moveToRelative(0f, 1f)
            curveTo(8.567f, 7f, 7f, 8.567f, 7f, 10.5f)
            reflectiveCurveTo(8.567f, 14f, 10.5f, 14f)
            reflectiveCurveToRelative(3.5f, -1.567f, 3.5f, -3.5f)
            reflectiveCurveTo(12.433f, 7f, 10.5f, 7f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(11.88f, 13f, 10.5f, 13f)
            reflectiveCurveTo(8f, 11.88f, 8f, 10.5f)
            reflectiveCurveTo(9.12f, 8f, 10.5f, 8f)
            close()
            moveToRelative(-8f, -0.5f)
            curveTo(2.776f, 7.5f, 3f, 7.724f, 3f, 8f)
            curveToRelative(0f, 1.413f, 0.837f, 2.63f, 2.042f, 3.183f)
            curveToRelative(0.05f, 0.401f, 0.143f, 0.79f, 0.274f, 1.16f)
            curveTo(3.406f, 11.823f, 2f, 10.076f, 2f, 8f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
            moveToRelative(4f, -5.5f)
            curveTo(7.88f, 2f, 9f, 3.12f, 9f, 4.5f)
            verticalLineToRelative(0.707f)
            curveToRelative(-2.159f, 0.61f, -3.778f, 2.506f, -3.979f, 4.809f)
            curveTo(4.402f, 9.56f, 4f, 8.827f, 4f, 8f)
            verticalLineTo(4.5f)
            curveTo(4f, 3.12f, 5.12f, 2f, 6.5f, 2f)
            close()
        }
    }.build()
}
