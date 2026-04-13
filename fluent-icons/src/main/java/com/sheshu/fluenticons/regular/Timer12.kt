package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Timer12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Timer12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 0.5f)
            curveTo(3f, 0.224f, 3.224f, 0f, 3.5f, 0f)
            horizontalLineToRelative(4f)
            curveTo(7.776f, 0f, 8f, 0.224f, 8f, 0.5f)
            reflectiveCurveTo(7.776f, 1f, 7.5f, 1f)
            horizontalLineToRelative(-4f)
            curveTo(3.224f, 1f, 3f, 0.776f, 3f, 0.5f)
            close()
            moveToRelative(2f, 7f)
            curveTo(5f, 7.776f, 5.224f, 8f, 5.5f, 8f)
            reflectiveCurveTo(6f, 7.776f, 6f, 7.5f)
            verticalLineToRelative(-3f)
            curveTo(6f, 4.224f, 5.776f, 4f, 5.5f, 4f)
            reflectiveCurveTo(5f, 4.224f, 5f, 4.5f)
            verticalLineToRelative(3f)
            close()
            moveTo(5.5f, 2f)
            curveTo(3.015f, 2f, 1f, 4.015f, 1f, 6.5f)
            reflectiveCurveTo(3.015f, 11f, 5.5f, 11f)
            reflectiveCurveTo(10f, 8.985f, 10f, 6.5f)
            reflectiveCurveTo(7.985f, 2f, 5.5f, 2f)
            close()
            moveTo(2f, 6.5f)
            curveTo(2f, 4.567f, 3.567f, 3f, 5.5f, 3f)
            reflectiveCurveTo(9f, 4.567f, 9f, 6.5f)
            reflectiveCurveTo(7.433f, 10f, 5.5f, 10f)
            reflectiveCurveTo(2f, 8.433f, 2f, 6.5f)
            close()
            moveToRelative(8.148f, -2.647f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.197f, 0.194f, -0.513f, -0.001f, -0.708f)
            lineTo(9.852f, 2.147f)
            curveToRelative(-0.195f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            curveTo(8.95f, 2.344f, 8.951f, 2.66f, 9.146f, 2.856f)
            lineToRelative(1.002f, 0.998f)
            close()
        }
    }.build()
}
