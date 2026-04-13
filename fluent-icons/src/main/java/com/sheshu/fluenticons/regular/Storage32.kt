package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Storage32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Storage32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 13.5f)
            curveTo(2f, 11.015f, 4.015f, 9f, 6.5f, 9f)
            horizontalLineToRelative(19f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 23f, 2f, 20.985f, 2f, 18.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(6.5f, 11f)
            curveTo(5.12f, 11f, 4f, 12.12f, 4f, 13.5f)
            verticalLineToRelative(5f)
            curveTo(4f, 19.88f, 5.12f, 21f, 6.5f, 21f)
            horizontalLineToRelative(19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(21f, 14.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(18f, 15.328f, 18f, 14.5f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            close()
            moveToRelative(3.5f, 1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(25.328f, 13f, 24.5f, 13f)
            reflectiveCurveTo(23f, 13.672f, 23f, 14.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
